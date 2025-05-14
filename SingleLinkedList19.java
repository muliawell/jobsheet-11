public class SingleLinkedList19 {
    NodeMahasiswa19 head;
    NodeMahasiswa19 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa19 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println(""); 
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Mahasiswa19 input) {
        NodeMahasiswa19 ndInput = new NodeMahasiswa19(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa19 input) {
        NodeMahasiswa19 ndInput = new NodeMahasiswa19(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa19 input) {
        NodeMahasiswa19 ndInput = new NodeMahasiswa19(input, null);
        NodeMahasiswa19 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa19 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa19 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa19(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    // Tambahan method
    public Mahasiswa19 get(int index) {
        NodeMahasiswa19 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int indexOf(String nama) {
        NodeMahasiswa19 temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(nama)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            System.out.println("Linked List kosong, tidak bisa hapus!");
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                NodeMahasiswa19 temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        } else {
            System.out.println("Linked List kosong, tidak bisa hapus!");
        }
    }

    public void remove(String nama) {
        if (!isEmpty()) {
            NodeMahasiswa19 temp = head;
            NodeMahasiswa19 prev = null;
            while (temp != null) {
                if (temp.data.nama.equalsIgnoreCase(nama)) {
                    if (prev == null) {
                        removeFirst();
                    } else {
                        prev.next = temp.next;
                        if (temp == tail) {
                            tail = prev;
                        }
                    }
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        } else {
            System.out.println("Linked List kosong, tidak bisa hapus!");
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa19 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
