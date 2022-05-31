def reverse(node):
    node previo = null
    node curr = None
    while curr != null:
        node nextn = curr.next
        curr.next = previo
        previo = curr
        curr = nextn
    return previo
