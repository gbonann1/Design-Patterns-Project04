CS442 Design Patterns
Fall 2016
PROJECT 4 README FILE

Due Date: Wednesday, November 23, 2016
Submission Date: Saturday, November 26, 2016
Grace Period Used This Project: 3 Days
Grace Period Remaining: 1 Days
Author(s): Gianluca Bonanno
e-mail(s): gbonanno1@binghamton.edu


PURPOSE:

	This assignment will read in a file and populate a data structure with data
	based on the contents of the file. Three visitors are used to populate the data
	structure, extract info from the data structure, and create a backup of the data
	structure. This assignment utilizes the observer pattern, the prototype pattern,
	and the visitor pattern.

PERCENT COMPLETE:

	I believe that I have completed 100% of this project.

PARTS THAT ARE NOT COMPLETE:

	All features as required by this project are complete.

BUGS:

	N/A.

FILES:

	Included with this project are 17 files:
	
	- Driver.java, the file which drives the program and contains the main function
	- Backup.java, implements ObserverI
	- Node.java, data structure that contains string and int
	- ObserverI.java, observer interface
	- Original.java, implements SubjectI
	- SubjectI.java, subject interface
	- FileProcessor.java, sets up file I/O for reading and writing
	- CloneAndObserverVisitor.java, Visitor to create backup
	- PopulateVisitor.java, visitor to populate the data structure
	- Visitor.java, visitor interface
	- WordCountVisitor.java, Visitor to extract data from data structure
	- backupTest.txt, destination file for backup test's output
	- input1.txt, small sample input file
	- input2.txt large sample input file
	- output.txt destination file for output
	- build.xml, the ANT compilation file
	- README, the text file you are presently reading

SAMPLE OUTPUT:

	Total time: 2
	BACKUP: Number of words:30
	BACKUP: Number of distinct words:12
	BACKUP: Number of characters:110
	
	backupTest.txt contains:
	Number of words:30
	Number of distinct words:12
	Number of characters:110
	
	(should match the output on console)
	
	output.txt contains:
	Number of words:18
	Number of distinct words:12
	Number of characters:65

TO COMPILE:

	Extract the files from the tar.gz. Navigate to the created folder
	bonanno_gianluca_assign4\wordCount\src\ and run
	the command "ant all". Afterwards, run the command "ant jar".

TO RUN:

	Navigate to the folder 
	bonanno_gianluca_assign4\wordCount\src\
	Run ant in the following format:
	"ant run"
	
	requires 3 arguments which can be changed within the ant file
	input.txt output.txt NUM_ITERATIONS
	
	you may need to create an empty file output.txt in order for the
	file processor to work properly.
	
	Additionally, the program may write outputs to the bin folder
	as this project was created in eclipse and bin is the default
	location.

DATA STRUCTURES AND ALGORITHMS/COMPLEXITY:
	
	Node object contains a string and an int count
	Nodes are contained in a hashMap data structure
	The key of the hashmap is a String and the value is a Node
	Inserting a new Node into the hashmap is complexity O(1) (put)
	Accessing an element in the hashmap is complexity O(1) (get)
	
	I choose to use a hashmap data structure because of the cheap cost
	of both accessing and inserting elements. I simply used the unique
	String values from the input files as the keys and my own Node
	data structure as the value (which implements cloneable). Assuming good
	implementation of hashmap from the java library, the complexity
	for accessing and inserting is O(1). This makes my program very fast.
	

EXTRA CREDIT:

	N/A

BIBLIOGRAPHY:

	N/A

ACKNOWLEDGEMENT:

	N/A