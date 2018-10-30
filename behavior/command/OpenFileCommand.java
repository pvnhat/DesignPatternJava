package command;

public class OpenFileCommand implements Command {

	private FileSystemReceiver mFileSystem;

	public OpenFileCommand(FileSystemReceiver fs) {
		mFileSystem = fs;
	}

	@Override
	public void execute() {
		// open command is forwarding request to openFile method
		mFileSystem.openFile();
	}

}