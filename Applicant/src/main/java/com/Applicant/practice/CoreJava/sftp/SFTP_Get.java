package com.Applicant.practice.CoreJava.sftp;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Optional;

public class SFTP_Get {

    public static void main(String[] args) {
        //String localPath = "/path/to/file"; "/G:/Downloads/sample1.json"
        String localPath = "/G:/Downloads/sample1.json";
        //String fileName =  "file_name";
        String sftpPath = "/SFTPFile";
        String sftpHost = "abcd56.files.com";
        String sftpPort = "22";
        String sftpUser = "slvirendra352@gmail.com";
        String sftpPassword = "Sftp@123456";

        try{
            /**
             * Open session to sftp server
             */
           // JSch jsch = new JSch();
            //Session session = jsch.getSession(sftpUser, sftpHost, Integer.valueOf(sftpPort));
            //session.setConfig("StrictHostKeyChecking", "no");
            //session.setPassword(sftpPassword);
            System.out.println("Connecting------");
         //   session.connect();
            System.out.println("Established Session");

         //   Channel channel = session.openChannel("sftp");
         //   ChannelSftp sftpChannel = (ChannelSftp) channel;
         //   sftpChannel.connect();*/

            System.out.println("Opened sftp Channel");

            /**
             * Do everything you need in sftp
             */
            File file=new File(localPath);


            Optional.of(file).filter(File::exists)
                    .ifPresentOrElse(
                            f -> System.out.println("File is present in directory..........."),
                            () -> {
                                throw new RuntimeException(new FileNotFoundException("File not found: " + localPath));
                            }
                    );

            // Navigate to the target directory on the SFTP server.
           // sftpChannel.cd(sftpPath);
            System.out.println("Copying file to Host");
            // Upload the file to the target location.
            //sftpChannel.put(new FileInputStream(file), file.getName());

            //sftpChannel.put(localPath, sftpPath);
            System.out.println("Copied file to Host"+file.getName());

//            System.out.println("Copying file from Host to Local");
//            sftpChannel.get(sftpPath+"/"+fileName, localPath);
//            System.out.println("Copied file from Host to local");

            //sftpChannel.disconnect();
            //session.disconnect();

            System.out.println("Disconnected from sftp");


        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

