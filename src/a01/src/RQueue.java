
/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */


public class RQueue {
	
	public int length=0;
	
	Element head;
	
	public RQueue() {
		this.head = null;
		this.errorel = new Element();
	}	
	
	public int length=0;
	
	public RQueue() {
		this.head = null;	
	}
	
	public RQueue rqempty() {		//Durch Konstruktorimplementierung überflüssig
		return new RQueue();
	}
	
	public RQueue rqinsert(int element, int prio) {
		Element insertion;
		insertion.prio = prio;
		insertion.val = element;
		insertion.next = this.head;
		this.head = insertion;
		this.length++;
	}
	
	public Element rqfront() {
		 Element tmp = this.head;
		 if(head == null) {
			 tmp = errorel;
			}else {
			if(head.next == null) {
				tmp = this.head;
			}else {

		 Element runner = this.head.next;
		 int i = 0;
		 
		 while(i < this.length) {
			 if(tmp.prio <= runner.prio) {
				 tmp = runner;
				 i++;
			 }
		 }
	}
			}
		 return tmp;
	}
	
	public RQueue rqremove() {
		Element tmp = rqfront();
		Element prev = this.head;
		while(tmp != prev.next) prev = prev.next;
		
		prev.next = tmp.next;
	}
	}