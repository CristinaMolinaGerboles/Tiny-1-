package alex;

%%
%line
%column
%class AnalizadorLexicoTiny
%type  UnidadLexica
%unicode

%{
  private ALexOperations ops;
  public String lexema() {return yytext();}
  public int fila() {return yyline+1;}
  public int columna() {return yycolumn+1;}
%}

%eofval{
  return ops.unidadEof();
%eofval}

%init{
  ops = new ALexOperations(this);
%init}

letra  = ([A-Z]|[a-z])
digitoPositivo = [1-9]
digito = ({digitoPositivo}|0)
digitos = {digito}*
parteEntera = ({digitoPositivo}{digitos}|0)
parteDecimal = (0|{digitos}{digitoPositivo})
exp = [e|E]{parteEntera}


separador = [ \t\r\b\n]
comentario = #[^\n]* 

int = int
real = real
bool = bool
string = string
and = and
or = or
not = not
null = null
proc = proc
if = if
then = then
else = else
endif = endif
while = while
do = do
endwhile = endwhile
call = call
record = record
array = array
of = of
pointer = pointer
new = new
delete = delete
read = read
write = write
nl = nl
var = var
type = type
true = true
false = false

punto = \.
operadorMultiplicacion = \*
operadorDivision = \/
parentesisApertura = \(
parentesisCierre = \)
igual = \=
coma  = \,
operadorSuma = \+
operadorResta = \-
simband = \&
mayor = >
menor = <
mayorig = >\=
menorig = <\=
igig = {igual}{igual}
diferente = \!\=
puntocoma = ;
modulo = \%
listAp = \[
listCie = \]
corchAp = \{
corchCie = \}
puntero = \->


numeroEntero = [\+,\-]?{parteEntera}
numeroReal = [\+,\-]?{parteEntera}{punto}{parteDecimal}
variable = {letra}({letra}|{digito}|_)*
expresionBasica = {numeroReal}|{numeroEntero}|{variable}|{true}|{false}
literalCadena = \"[^\n\b\"]*\"
%%
{separador}               {}
{comentario}              {}
{literalCadena} {return ops.unidadLiteralcadena();}
{int} 				 {return ops.unidadInt();}
{real} 				 {return ops.unidadreal();}
{bool} 				 {return ops.unidadBool();}
{string}  			 {return ops.unidadString();}
{and}  				 {return ops.unidadAnd();}
{or} 				 {return ops.unidadOr();}
{not} {return ops.unidadNot();}
{null} {return ops.unidadNull();}
{proc} {return ops.unidadProc();}
{if} {return ops.unidadIf();}
{then} {return ops.unidadThen();}
{else} {return  ops.unidadElse();}
{endif} {return ops.unidadEndif();}
{while} {return ops.unidadWhile();}
{do} { return ops.unidadDo();}
{endwhile}				  {return ops.unidadEndwhile();}
{call}				  	  {return ops.unidadCall();}
{record}			  {return ops.unidadRecord();}
{array}					  {return ops.unidadArray();}
{of}				  {return ops.unidadOf();}
{pointer}			  {return ops.unidadPointer();}
{new}				  {return ops.unidadNew();}
{delete}			  {return ops.unidadDelete();}
{read}				  {return ops.unidadRead();}
{write}				  {return ops.unidadWrite();}
{nl}				  {return ops.unidadNl();}
{var}				  {return ops.unidadVar();}
{type}				  {return ops.unidadType();}
{true}				  {return ops.unidadTrue();}
{false}				  {return ops.unidadFalse();}
{numeroEntero}            {return ops.unidadEnt();}
{numeroReal}              {return ops.unidadReal();}
{expresionBasica} 	 {return ops.unidadExpBasica();}
{operadorSuma}            {return ops.unidadSuma();}
{operadorResta}           {return ops.unidadResta();}
{operadorMultiplicacion}  {return ops.unidadMul();}
{operadorDivision}        {return ops.unidadDiv();}
{parentesisApertura}      {return ops.unidadPAp();}
{parentesisCierre}        {return ops.unidadPCierre();} 
{igual}                   {return ops.unidadIgual();} 
{coma}                    {return ops.unidadComa();}
{punto} {return ops.unidadPunto();}
{igual} {return ops.unidadIgual();}
{simband} {return ops.unidadSimband();}
{mayor} {return ops.Mayor();}
{menor} {return ops.unidadMenor();}
{mayorig} {return ops.unidadMayorig();}
{menorig}  {return ops.unidadMenorig ();}
{igig}  {return ops.unidadIgig ();}
{diferente} {return ops.unidadDiferente ();}
{puntocoma} {return ops.unidadPuntocoma ();}
{modulo} {return ops.unidadModulo ();}
{listAp} {return ops.unidadListAp ();}
{listCie} {return ops.unidadListCie();}
{corchAp}  {return ops.unidadcorchAp();}
{corchCie} {return ops.unidadCorchCie();}
{puntero} {return ops.unidadPuntero();}
{variable}           {return ops.unidadId();}
[^]                       {ops.error();}  