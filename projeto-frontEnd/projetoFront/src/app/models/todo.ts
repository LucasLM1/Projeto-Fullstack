export interface Todo{
    id?: String, //"?" não da 100% para o id
    titulo: String,
    descricao?: String,
    dataParaFinalizar: any,
    finalizado: Boolean
}