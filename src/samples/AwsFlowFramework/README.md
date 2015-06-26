# AWS Flow Framework Samples

These samples demonstrate how to use AWS Flow Framework. The following samples are included:

*   HelloWorld – this sample includes a very simple workflow that calls an activity to print hello world to the console. It shows the basic usage of AWS Flow Framework, including defining contracts, implementation of activities and workflow coordination logic and worker programs to host them.
*   Booking – shows an example workflow for making a reservation, including flight and rental car.
*   FileProcessing – shows a workflow for media processing use case. The sample workflow downloads a file from an Amazon S3 bucket, creates a zip file and uploads that zip file back to S3. The sample uses the task routing feature.
*   PeriodicWorkflow – shows how to create a workflow that periodically executes an activity. The workflow can run for extended periods and hence it uses the continue as new execution feature.
*   SplitMerge – the workflow in this sample processes a large data set by splitting it up into smaller data sets. The sample calculates the average of a large set of numbers stored in a file in S3. The smaller data sets are assigned to workers and the results of processing are merged to produce the final result.
*   Deployment – the workflow in this sample shows deployment of interdependent components.
*   Cron – the workflow in this sample starts an activity periodically based on a cron schedule.
*   CronWithRetry – this is an enhanced version of the Cron sample that uses the exponential retry feature to retry the activity if it fails.

## Prerequisites

*   You must have a valid Amazon Web Services developer account.
*   Requires the AWS SDK for Java. For more information on the AWS SDK for Java, see [http://aws.amazon.com/sdkforjava](http://aws.amazon.com/sdkforjava).
*   You must be signed up for the following services:
    *   Amazon Simple Workflow Service (SWF). For more information, see [http://aws.amazon.com/swf](http://aws.amazon.com/swf).
    *   Amazon Simple Storage Service (S3). For more information, see [http://aws.amazon.com/s3](http://aws.amazon.com/s3).
*   JUnit (version 4.7) is required to run the samples. The jar file must be in the classpath. For more information, see [http://www.junit.org/](http://www.junit.org/)
*   org.springframework.test (version 3.0) is required to run the samples. The jar file must be in the classpath. For more information, see [http://www.springsource.org/](http://www.springsource.org/)
*   Log4j (version 1.2.15) is required to run the samples. The jar file must be in the classpath. For more information, see [http://logging.apache.org/log4j/1.2/](http://logging.apache.org/log4j/1.2/)

## Running the Samples

The steps for running the AWS Flow Framework samples are:

1.  Create the Samples domain
    1.  Go to the SWF Management Console (https://console.aws.amazon.com/swf/home).
    2.  Follow the on-screen instructions to log in.
    3.  Click Manage Domains and register a new domain with the name Samples.

2.  Open the access.properties in the samples folder.

3.  Locate the following sections and fill in your Access Key ID and Secret Access Key. You can use the same values for SWF and S3:

    ```
    # Fill in your AWS Access Key ID and Secret Access Key for SWF
    # http://aws.amazon.com/security-credentials
    AWS.Access.ID=<Your AWS Access Key>
    AWS.Secret.Key=<Your AWS Secret Key>
    AWS.Account.ID=<Your AWS Account ID>

    # Fill in your AWS Access Key ID and Secret Access Key for S3
    # http://aws.amazon.com/security-credentials
    S3.Access.ID=<Your AWS Access Key>
    S3.Secret.Key=<Your AWS Secret Key>
    S3.Account.ID=<Your AWS Account ID>
    ```

4.  Some samples upload files to S3. Locate the following section and fill in the name of S3 bucket that you want the samples to use:

     ```
     ####### FileProcessing Sample Config Values ##########
     Workflow.Input.TargetBucketName=<Your S3 bucket name>
     ```

5.  Save the file.

6.  Set the environment variable AWS_SWF_SAMPLES_CONFIG to the full path of the directory containing the access.properties file. For example on windows run this command:

     ```
     set AWS_SWF_SAMPLES_CONFIG=<Your SDK Directrory>/src/samples/AwsFlowFramework
     ```

     and on linux use this command to set the environment variable:

     ```
     export AWS_SWF_SAMPLES_CONFIG=<Your SDK Directrory>/src/samples/AwsFlowFramework
     ```

7.  Compile the samples by using the Ant build.xml file. This will create binaries in bin directory under the samples directory.

8.  To run the samples follow these instructions:

   *Hello World Sample:*

     The sample has three executables. You should run each in a separate terminal/console.
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.helloworld.ActivityHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.helloworld.WorkflowHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.helloworld.WorkflowExecutionStarter" run`


   *Booking Sample:*

     The sample has three executables. You should run each in a separate terminal/console. From the samples folder,
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.booking.ActivityHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.booking.WorkflowHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.booking.WorkflowExecutionStarter" run`


   *Split Merge Sample:*

     The sample has three executables. You should run each in a separate terminal/console. From the samples folder,
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.splitmerge.ActivityHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.splitmerge.WorkflowHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.splitmerge.WorkflowExecutionStarter" run`


   *Periodic Workflow Sample:*

     The sample has three executables. You should run each in a separate terminal/console. From the samples folder,
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.ActivityHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.WorkflowHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow.WorkflowExecutionStarter" run`

   *File Processing Sample:*

     The sample has three executables. You should run each in a separate terminal/console. From the samples folder,
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing.ActivityHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing.WorkflowHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing.WorkflowExecutionStarter" run`


   *Cron Sample:*

     The sample has three executables. You should run each in a separate terminal/console. From the samples folder,
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.cron.ActivityHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.cron.WorkflowHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.cron.CronWorkflowExecutionStarter" -Dmain-args="\"*/10 * * * * *\" PST 60" run`

   The workflow starter takes 3 command line arguments that must be specified:
     1. CRON_PATTERN: specifies the pattern used to determine the cron schedule for the periodic activity task. The above command specifies the pattern */10 * * * * * to run the task every 10 seconds.
     2. TIME_ZONE: specifies the time zone to use for time calculations. The above command specifies PST (Pacific Standard Time).
     3. CONTINUE_AS_NEW_AFTER_SECONDS: specifies the duration, in seconds, after which the current execution should be closed and continued as a new execution. The above command specifies 60 seconds.


   *Cron With Retry Sample:*

     The sample has three executables. You should run each in a separate terminal/console. From the samples folder,
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry.ActivityHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry.WorkflowHost" run`
     - Run: `ant -f build.xml -Dmain-class="com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry.CronWithRetryWorkflowExecutionStarter" -Dmain-args="\"*/10 * * * * *\" PST 60" run`

   The workflow starter takes 3 command line arguments that must be specified:
     1. CRON_PATTERN: specifies the pattern used to determine the cron schedule for the periodic activity task. The above command specifies the pattern */10 * * * * * to run the task every 10 seconds.
     2. TIME_ZONE: specifies the time zone to use for time calculations. The above command specifies PST (Pacific Standard Time).
     3. CONTINUE_AS_NEW_AFTER_SECONDS: specifies the duration, in seconds, after which the current execution should be closed and continued as a new execution. The above command specifies 60 seconds.
