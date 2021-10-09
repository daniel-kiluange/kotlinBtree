class Node(val value: Int, var leftNode: Node?, var rightNode: Node?)

val root = Node(0,null,null)

fun main() {
    val list = listOf(3,25,9,7,4,99)

    list.forEach { i -> fillTree(i,root) }

    printTree(root)
}

fun fillTree(value: Int, node: Node) {
    val nextNode = Node(value,null,null)
    when(value <= node.value){
        true -> {
            if (node.leftNode != null) {
                fillTree(value, node.leftNode!!)
            }else{
                node.leftNode = nextNode
            }
        }
        false -> {
            if (node.rightNode != null){
                fillTree(value, node.rightNode!!)
            }else{
                node.rightNode = nextNode
            }
        }
    }
}

fun printTree(node:Node){
    println(node.value)
    if (node.leftNode != null){
        print("left ")
        printTree(node.leftNode!!)
    }
    if (node.rightNode != null){
        print("right ")
        printTree(node.rightNode!!)
    }
}