/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a description of the application, including the application Amazon Resource Name (ARN), status, latest
 * version, and input and output configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/ApplicationDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Description of the application.
     * </p>
     */
    private String applicationDescription;
    /**
     * <p>
     * ARN of the application.
     * </p>
     */
    private String applicationARN;
    /**
     * <p>
     * Status of the application.
     * </p>
     */
    private String applicationStatus;
    /**
     * <p>
     * Time stamp when the application version was created.
     * </p>
     */
    private java.util.Date createTimestamp;
    /**
     * <p>
     * Time stamp when the application was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTimestamp;
    /**
     * <p>
     * Describes the application input configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>.
     * </p>
     */
    private java.util.List<InputDescription> inputDescriptions;
    /**
     * <p>
     * Describes the application output configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application
     * Output</a>.
     * </p>
     */
    private java.util.List<OutputDescription> outputDescriptions;
    /**
     * <p>
     * Describes reference data sources configured for the application. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>.
     * </p>
     */
    private java.util.List<ReferenceDataSourceDescription> referenceDataSourceDescriptions;
    /**
     * <p>
     * Describes the CloudWatch log streams that are configured to receive application messages. For more information
     * about using CloudWatch log streams with Amazon Kinesis Analytics applications, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon CloudWatch
     * Logs</a>.
     * </p>
     */
    private java.util.List<CloudWatchLoggingOptionDescription> cloudWatchLoggingOptionDescriptions;
    /**
     * <p>
     * Returns the application code that you provided to perform data analysis on any of the in-application streams in
     * your application.
     * </p>
     */
    private String applicationCode;
    /**
     * <p>
     * Provides the current application version.
     * </p>
     */
    private Long applicationVersionId;

    /**
     * <p>
     * Name of the application.
     * </p>
     * 
     * @param applicationName
     *        Name of the application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * Name of the application.
     * </p>
     * 
     * @return Name of the application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * Name of the application.
     * </p>
     * 
     * @param applicationName
     *        Name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Description of the application.
     * </p>
     * 
     * @param applicationDescription
     *        Description of the application.
     */

    public void setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
    }

    /**
     * <p>
     * Description of the application.
     * </p>
     * 
     * @return Description of the application.
     */

    public String getApplicationDescription() {
        return this.applicationDescription;
    }

    /**
     * <p>
     * Description of the application.
     * </p>
     * 
     * @param applicationDescription
     *        Description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withApplicationDescription(String applicationDescription) {
        setApplicationDescription(applicationDescription);
        return this;
    }

    /**
     * <p>
     * ARN of the application.
     * </p>
     * 
     * @param applicationARN
     *        ARN of the application.
     */

    public void setApplicationARN(String applicationARN) {
        this.applicationARN = applicationARN;
    }

    /**
     * <p>
     * ARN of the application.
     * </p>
     * 
     * @return ARN of the application.
     */

    public String getApplicationARN() {
        return this.applicationARN;
    }

    /**
     * <p>
     * ARN of the application.
     * </p>
     * 
     * @param applicationARN
     *        ARN of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withApplicationARN(String applicationARN) {
        setApplicationARN(applicationARN);
        return this;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param applicationStatus
     *        Status of the application.
     * @see ApplicationStatus
     */

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @return Status of the application.
     * @see ApplicationStatus
     */

    public String getApplicationStatus() {
        return this.applicationStatus;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param applicationStatus
     *        Status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public ApplicationDetail withApplicationStatus(String applicationStatus) {
        setApplicationStatus(applicationStatus);
        return this;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param applicationStatus
     *        Status of the application.
     * @see ApplicationStatus
     */

    public void setApplicationStatus(ApplicationStatus applicationStatus) {
        withApplicationStatus(applicationStatus);
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param applicationStatus
     *        Status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public ApplicationDetail withApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Time stamp when the application version was created.
     * </p>
     * 
     * @param createTimestamp
     *        Time stamp when the application version was created.
     */

    public void setCreateTimestamp(java.util.Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * <p>
     * Time stamp when the application version was created.
     * </p>
     * 
     * @return Time stamp when the application version was created.
     */

    public java.util.Date getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * <p>
     * Time stamp when the application version was created.
     * </p>
     * 
     * @param createTimestamp
     *        Time stamp when the application version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withCreateTimestamp(java.util.Date createTimestamp) {
        setCreateTimestamp(createTimestamp);
        return this;
    }

    /**
     * <p>
     * Time stamp when the application was last updated.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        Time stamp when the application was last updated.
     */

    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    /**
     * <p>
     * Time stamp when the application was last updated.
     * </p>
     * 
     * @return Time stamp when the application was last updated.
     */

    public java.util.Date getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    /**
     * <p>
     * Time stamp when the application was last updated.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        Time stamp when the application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        setLastUpdateTimestamp(lastUpdateTimestamp);
        return this;
    }

    /**
     * <p>
     * Describes the application input configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>.
     * </p>
     * 
     * @return Describes the application input configuration. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     *         Application Input</a>.
     */

    public java.util.List<InputDescription> getInputDescriptions() {
        return inputDescriptions;
    }

    /**
     * <p>
     * Describes the application input configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>.
     * </p>
     * 
     * @param inputDescriptions
     *        Describes the application input configuration. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     *        Application Input</a>.
     */

    public void setInputDescriptions(java.util.Collection<InputDescription> inputDescriptions) {
        if (inputDescriptions == null) {
            this.inputDescriptions = null;
            return;
        }

        this.inputDescriptions = new java.util.ArrayList<InputDescription>(inputDescriptions);
    }

    /**
     * <p>
     * Describes the application input configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDescriptions(java.util.Collection)} or {@link #withInputDescriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inputDescriptions
     *        Describes the application input configuration. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     *        Application Input</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withInputDescriptions(InputDescription... inputDescriptions) {
        if (this.inputDescriptions == null) {
            setInputDescriptions(new java.util.ArrayList<InputDescription>(inputDescriptions.length));
        }
        for (InputDescription ele : inputDescriptions) {
            this.inputDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the application input configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>.
     * </p>
     * 
     * @param inputDescriptions
     *        Describes the application input configuration. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     *        Application Input</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withInputDescriptions(java.util.Collection<InputDescription> inputDescriptions) {
        setInputDescriptions(inputDescriptions);
        return this;
    }

    /**
     * <p>
     * Describes the application output configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application
     * Output</a>.
     * </p>
     * 
     * @return Describes the application output configuration. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring
     *         Application Output</a>.
     */

    public java.util.List<OutputDescription> getOutputDescriptions() {
        return outputDescriptions;
    }

    /**
     * <p>
     * Describes the application output configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application
     * Output</a>.
     * </p>
     * 
     * @param outputDescriptions
     *        Describes the application output configuration. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring
     *        Application Output</a>.
     */

    public void setOutputDescriptions(java.util.Collection<OutputDescription> outputDescriptions) {
        if (outputDescriptions == null) {
            this.outputDescriptions = null;
            return;
        }

        this.outputDescriptions = new java.util.ArrayList<OutputDescription>(outputDescriptions);
    }

    /**
     * <p>
     * Describes the application output configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application
     * Output</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputDescriptions(java.util.Collection)} or {@link #withOutputDescriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param outputDescriptions
     *        Describes the application output configuration. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring
     *        Application Output</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withOutputDescriptions(OutputDescription... outputDescriptions) {
        if (this.outputDescriptions == null) {
            setOutputDescriptions(new java.util.ArrayList<OutputDescription>(outputDescriptions.length));
        }
        for (OutputDescription ele : outputDescriptions) {
            this.outputDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the application output configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application
     * Output</a>.
     * </p>
     * 
     * @param outputDescriptions
     *        Describes the application output configuration. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring
     *        Application Output</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withOutputDescriptions(java.util.Collection<OutputDescription> outputDescriptions) {
        setOutputDescriptions(outputDescriptions);
        return this;
    }

    /**
     * <p>
     * Describes reference data sources configured for the application. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>.
     * </p>
     * 
     * @return Describes reference data sources configured for the application. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     *         Application Input</a>.
     */

    public java.util.List<ReferenceDataSourceDescription> getReferenceDataSourceDescriptions() {
        return referenceDataSourceDescriptions;
    }

    /**
     * <p>
     * Describes reference data sources configured for the application. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>.
     * </p>
     * 
     * @param referenceDataSourceDescriptions
     *        Describes reference data sources configured for the application. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     *        Application Input</a>.
     */

    public void setReferenceDataSourceDescriptions(java.util.Collection<ReferenceDataSourceDescription> referenceDataSourceDescriptions) {
        if (referenceDataSourceDescriptions == null) {
            this.referenceDataSourceDescriptions = null;
            return;
        }

        this.referenceDataSourceDescriptions = new java.util.ArrayList<ReferenceDataSourceDescription>(referenceDataSourceDescriptions);
    }

    /**
     * <p>
     * Describes reference data sources configured for the application. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceDataSourceDescriptions(java.util.Collection)} or
     * {@link #withReferenceDataSourceDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param referenceDataSourceDescriptions
     *        Describes reference data sources configured for the application. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     *        Application Input</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withReferenceDataSourceDescriptions(ReferenceDataSourceDescription... referenceDataSourceDescriptions) {
        if (this.referenceDataSourceDescriptions == null) {
            setReferenceDataSourceDescriptions(new java.util.ArrayList<ReferenceDataSourceDescription>(referenceDataSourceDescriptions.length));
        }
        for (ReferenceDataSourceDescription ele : referenceDataSourceDescriptions) {
            this.referenceDataSourceDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes reference data sources configured for the application. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>.
     * </p>
     * 
     * @param referenceDataSourceDescriptions
     *        Describes reference data sources configured for the application. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring
     *        Application Input</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withReferenceDataSourceDescriptions(java.util.Collection<ReferenceDataSourceDescription> referenceDataSourceDescriptions) {
        setReferenceDataSourceDescriptions(referenceDataSourceDescriptions);
        return this;
    }

    /**
     * <p>
     * Describes the CloudWatch log streams that are configured to receive application messages. For more information
     * about using CloudWatch log streams with Amazon Kinesis Analytics applications, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon CloudWatch
     * Logs</a>.
     * </p>
     * 
     * @return Describes the CloudWatch log streams that are configured to receive application messages. For more
     *         information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see <a
     *         href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon
     *         CloudWatch Logs</a>.
     */

    public java.util.List<CloudWatchLoggingOptionDescription> getCloudWatchLoggingOptionDescriptions() {
        return cloudWatchLoggingOptionDescriptions;
    }

    /**
     * <p>
     * Describes the CloudWatch log streams that are configured to receive application messages. For more information
     * about using CloudWatch log streams with Amazon Kinesis Analytics applications, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon CloudWatch
     * Logs</a>.
     * </p>
     * 
     * @param cloudWatchLoggingOptionDescriptions
     *        Describes the CloudWatch log streams that are configured to receive application messages. For more
     *        information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon
     *        CloudWatch Logs</a>.
     */

    public void setCloudWatchLoggingOptionDescriptions(java.util.Collection<CloudWatchLoggingOptionDescription> cloudWatchLoggingOptionDescriptions) {
        if (cloudWatchLoggingOptionDescriptions == null) {
            this.cloudWatchLoggingOptionDescriptions = null;
            return;
        }

        this.cloudWatchLoggingOptionDescriptions = new java.util.ArrayList<CloudWatchLoggingOptionDescription>(cloudWatchLoggingOptionDescriptions);
    }

    /**
     * <p>
     * Describes the CloudWatch log streams that are configured to receive application messages. For more information
     * about using CloudWatch log streams with Amazon Kinesis Analytics applications, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon CloudWatch
     * Logs</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudWatchLoggingOptionDescriptions(java.util.Collection)} or
     * {@link #withCloudWatchLoggingOptionDescriptions(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param cloudWatchLoggingOptionDescriptions
     *        Describes the CloudWatch log streams that are configured to receive application messages. For more
     *        information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon
     *        CloudWatch Logs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withCloudWatchLoggingOptionDescriptions(CloudWatchLoggingOptionDescription... cloudWatchLoggingOptionDescriptions) {
        if (this.cloudWatchLoggingOptionDescriptions == null) {
            setCloudWatchLoggingOptionDescriptions(new java.util.ArrayList<CloudWatchLoggingOptionDescription>(cloudWatchLoggingOptionDescriptions.length));
        }
        for (CloudWatchLoggingOptionDescription ele : cloudWatchLoggingOptionDescriptions) {
            this.cloudWatchLoggingOptionDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the CloudWatch log streams that are configured to receive application messages. For more information
     * about using CloudWatch log streams with Amazon Kinesis Analytics applications, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon CloudWatch
     * Logs</a>.
     * </p>
     * 
     * @param cloudWatchLoggingOptionDescriptions
     *        Describes the CloudWatch log streams that are configured to receive application messages. For more
     *        information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon
     *        CloudWatch Logs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withCloudWatchLoggingOptionDescriptions(
            java.util.Collection<CloudWatchLoggingOptionDescription> cloudWatchLoggingOptionDescriptions) {
        setCloudWatchLoggingOptionDescriptions(cloudWatchLoggingOptionDescriptions);
        return this;
    }

    /**
     * <p>
     * Returns the application code that you provided to perform data analysis on any of the in-application streams in
     * your application.
     * </p>
     * 
     * @param applicationCode
     *        Returns the application code that you provided to perform data analysis on any of the in-application
     *        streams in your application.
     */

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    /**
     * <p>
     * Returns the application code that you provided to perform data analysis on any of the in-application streams in
     * your application.
     * </p>
     * 
     * @return Returns the application code that you provided to perform data analysis on any of the in-application
     *         streams in your application.
     */

    public String getApplicationCode() {
        return this.applicationCode;
    }

    /**
     * <p>
     * Returns the application code that you provided to perform data analysis on any of the in-application streams in
     * your application.
     * </p>
     * 
     * @param applicationCode
     *        Returns the application code that you provided to perform data analysis on any of the in-application
     *        streams in your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withApplicationCode(String applicationCode) {
        setApplicationCode(applicationCode);
        return this;
    }

    /**
     * <p>
     * Provides the current application version.
     * </p>
     * 
     * @param applicationVersionId
     *        Provides the current application version.
     */

    public void setApplicationVersionId(Long applicationVersionId) {
        this.applicationVersionId = applicationVersionId;
    }

    /**
     * <p>
     * Provides the current application version.
     * </p>
     * 
     * @return Provides the current application version.
     */

    public Long getApplicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * <p>
     * Provides the current application version.
     * </p>
     * 
     * @param applicationVersionId
     *        Provides the current application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withApplicationVersionId(Long applicationVersionId) {
        setApplicationVersionId(applicationVersionId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getApplicationDescription() != null)
            sb.append("ApplicationDescription: ").append(getApplicationDescription()).append(",");
        if (getApplicationARN() != null)
            sb.append("ApplicationARN: ").append(getApplicationARN()).append(",");
        if (getApplicationStatus() != null)
            sb.append("ApplicationStatus: ").append(getApplicationStatus()).append(",");
        if (getCreateTimestamp() != null)
            sb.append("CreateTimestamp: ").append(getCreateTimestamp()).append(",");
        if (getLastUpdateTimestamp() != null)
            sb.append("LastUpdateTimestamp: ").append(getLastUpdateTimestamp()).append(",");
        if (getInputDescriptions() != null)
            sb.append("InputDescriptions: ").append(getInputDescriptions()).append(",");
        if (getOutputDescriptions() != null)
            sb.append("OutputDescriptions: ").append(getOutputDescriptions()).append(",");
        if (getReferenceDataSourceDescriptions() != null)
            sb.append("ReferenceDataSourceDescriptions: ").append(getReferenceDataSourceDescriptions()).append(",");
        if (getCloudWatchLoggingOptionDescriptions() != null)
            sb.append("CloudWatchLoggingOptionDescriptions: ").append(getCloudWatchLoggingOptionDescriptions()).append(",");
        if (getApplicationCode() != null)
            sb.append("ApplicationCode: ").append(getApplicationCode()).append(",");
        if (getApplicationVersionId() != null)
            sb.append("ApplicationVersionId: ").append(getApplicationVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationDetail == false)
            return false;
        ApplicationDetail other = (ApplicationDetail) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getApplicationDescription() == null ^ this.getApplicationDescription() == null)
            return false;
        if (other.getApplicationDescription() != null && other.getApplicationDescription().equals(this.getApplicationDescription()) == false)
            return false;
        if (other.getApplicationARN() == null ^ this.getApplicationARN() == null)
            return false;
        if (other.getApplicationARN() != null && other.getApplicationARN().equals(this.getApplicationARN()) == false)
            return false;
        if (other.getApplicationStatus() == null ^ this.getApplicationStatus() == null)
            return false;
        if (other.getApplicationStatus() != null && other.getApplicationStatus().equals(this.getApplicationStatus()) == false)
            return false;
        if (other.getCreateTimestamp() == null ^ this.getCreateTimestamp() == null)
            return false;
        if (other.getCreateTimestamp() != null && other.getCreateTimestamp().equals(this.getCreateTimestamp()) == false)
            return false;
        if (other.getLastUpdateTimestamp() == null ^ this.getLastUpdateTimestamp() == null)
            return false;
        if (other.getLastUpdateTimestamp() != null && other.getLastUpdateTimestamp().equals(this.getLastUpdateTimestamp()) == false)
            return false;
        if (other.getInputDescriptions() == null ^ this.getInputDescriptions() == null)
            return false;
        if (other.getInputDescriptions() != null && other.getInputDescriptions().equals(this.getInputDescriptions()) == false)
            return false;
        if (other.getOutputDescriptions() == null ^ this.getOutputDescriptions() == null)
            return false;
        if (other.getOutputDescriptions() != null && other.getOutputDescriptions().equals(this.getOutputDescriptions()) == false)
            return false;
        if (other.getReferenceDataSourceDescriptions() == null ^ this.getReferenceDataSourceDescriptions() == null)
            return false;
        if (other.getReferenceDataSourceDescriptions() != null
                && other.getReferenceDataSourceDescriptions().equals(this.getReferenceDataSourceDescriptions()) == false)
            return false;
        if (other.getCloudWatchLoggingOptionDescriptions() == null ^ this.getCloudWatchLoggingOptionDescriptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptionDescriptions() != null
                && other.getCloudWatchLoggingOptionDescriptions().equals(this.getCloudWatchLoggingOptionDescriptions()) == false)
            return false;
        if (other.getApplicationCode() == null ^ this.getApplicationCode() == null)
            return false;
        if (other.getApplicationCode() != null && other.getApplicationCode().equals(this.getApplicationCode()) == false)
            return false;
        if (other.getApplicationVersionId() == null ^ this.getApplicationVersionId() == null)
            return false;
        if (other.getApplicationVersionId() != null && other.getApplicationVersionId().equals(this.getApplicationVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getApplicationDescription() == null) ? 0 : getApplicationDescription().hashCode());
        hashCode = prime * hashCode + ((getApplicationARN() == null) ? 0 : getApplicationARN().hashCode());
        hashCode = prime * hashCode + ((getApplicationStatus() == null) ? 0 : getApplicationStatus().hashCode());
        hashCode = prime * hashCode + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTimestamp() == null) ? 0 : getLastUpdateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getInputDescriptions() == null) ? 0 : getInputDescriptions().hashCode());
        hashCode = prime * hashCode + ((getOutputDescriptions() == null) ? 0 : getOutputDescriptions().hashCode());
        hashCode = prime * hashCode + ((getReferenceDataSourceDescriptions() == null) ? 0 : getReferenceDataSourceDescriptions().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptionDescriptions() == null) ? 0 : getCloudWatchLoggingOptionDescriptions().hashCode());
        hashCode = prime * hashCode + ((getApplicationCode() == null) ? 0 : getApplicationCode().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionId() == null) ? 0 : getApplicationVersionId().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationDetail clone() {
        try {
            return (ApplicationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.ApplicationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
