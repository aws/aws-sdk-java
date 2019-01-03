/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.TransferManagerBuilder;
import com.amazonaws.services.s3.transfer.Upload;
import com.amazonaws.util.StringUtils;

/**
 * Demonstrates how to upload data to Amazon S3, and track progress, using a
 * Swing progress bar.
 * <p>
 * <b>Prerequisites:</b> You must have a valid Amazon Web Services developer
 * account, and be signed up to use Amazon S3. For more information on Amazon
 * S3, see http://aws.amazon.com/s3.
 * <p>
 * Fill in your AWS access credentials in the provided credentials file
 * template, and be sure to move the file to the default location
 * (~/.aws/credentials) where the sample code will load the credentials from.
 * <p>
 * <b>WARNING:</b> To avoid accidental leakage of your credentials, DO NOT keep
 * the credentials file in your source directory.
 *
 * http://aws.amazon.com/security-credentials
 */
public class S3TransferProgressSample {

    private static ProfileCredentialsProvider credentialsProvider = null;
    private static TransferManager tx;
    private static String bucketName;

    private JProgressBar pb;
    private JFrame frame;
    private Upload upload;
    private JButton button;

    public static void main(String[] args) throws Exception {
        /*
         * The ProfileCredentialsProvider will return your [default]
         * credential profile by reading from the credentials file located at
         * (~/.aws/credentials).
         *
         * TransferManager manages a pool of threads, so we create a
         * single instance and share it throughout our application.
         */
        credentialsProvider = new ProfileCredentialsProvider();
        try {
            credentialsProvider.getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (~/.aws/credentials), and is in valid format.",
                    e);
        }

        AmazonS3 s3 = AmazonS3ClientBuilder.standard()
            .withCredentials(credentialsProvider)
            .withRegion("us-west-2")
            .build();

        tx = TransferManagerBuilder.standard()
            .withS3Client(s3)
            .build();

        final String accessKeyId = credentialsProvider.getCredentials().getAWSAccessKeyId();
        bucketName = "s3-upload-sdk-sample-" + StringUtils.lowerCase(accessKeyId);

        new S3TransferProgressSample();
    }

    public S3TransferProgressSample() throws Exception {
        frame = new JFrame("Amazon S3 File Upload");
        button = new JButton("Choose File...");
        button.addActionListener(new ButtonListener());

        pb = new JProgressBar(0, 100);
        pb.setStringPainted(true);

        frame.setContentPane(createContentPane());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            JFileChooser fileChooser = new JFileChooser();
            int showOpenDialog = fileChooser.showOpenDialog(frame);
            if (showOpenDialog != JFileChooser.APPROVE_OPTION) return;

            createAmazonS3Bucket();

            ProgressListener progressListener = new ProgressListener() {
                public void progressChanged(ProgressEvent progressEvent) {
                    if (upload == null) return;

                    pb.setValue((int)upload.getProgress().getPercentTransferred());

                    switch (progressEvent.getEventCode()) {
                    case ProgressEvent.COMPLETED_EVENT_CODE:
                        pb.setValue(100);
                        break;
                    case ProgressEvent.FAILED_EVENT_CODE:
                        try {
                            AmazonClientException e = upload.waitForException();
                            JOptionPane.showMessageDialog(frame,
                                    "Unable to upload file to Amazon S3: " + e.getMessage(),
                                    "Error Uploading File", JOptionPane.ERROR_MESSAGE);
                        } catch (InterruptedException e) {}
                        break;
                    }
                }
            };

            File fileToUpload = fileChooser.getSelectedFile();
            PutObjectRequest request = new PutObjectRequest(
                    bucketName, fileToUpload.getName(), fileToUpload)
                .withGeneralProgressListener(progressListener);
            upload = tx.upload(request);
        }
    }

    private void createAmazonS3Bucket() {
        try {
            if (tx.getAmazonS3Client().doesBucketExist(bucketName) == false) {
                tx.getAmazonS3Client().createBucket(bucketName);
            }
        } catch (AmazonClientException ace) {
            JOptionPane.showMessageDialog(frame, "Unable to create a new Amazon S3 bucket: " + ace.getMessage(),
                    "Error Creating Bucket", JOptionPane.ERROR_MESSAGE);
        }
    }

    private JPanel createContentPane() {
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(pb);

        JPanel borderPanel = new JPanel();
        borderPanel.setLayout(new BorderLayout());
        borderPanel.add(panel, BorderLayout.NORTH);
        borderPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        return borderPanel;
    }
}
