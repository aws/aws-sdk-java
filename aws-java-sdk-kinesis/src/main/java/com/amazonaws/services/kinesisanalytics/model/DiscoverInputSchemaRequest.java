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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DiscoverInputSchema"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiscoverInputSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the streaming source.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming source
     * discovery purposes.
     * </p>
     */
    private InputStartingPositionConfiguration inputStartingPositionConfiguration;
    /**
     * <p>
     * Specify this parameter to discover a schema from data in an Amazon S3 object.
     * </p>
     */
    private S3Configuration s3Configuration;
    /**
     * <p>
     * The <a>InputProcessingConfiguration</a> to use to preprocess the records before discovering the schema of the
     * records.
     * </p>
     */
    private InputProcessingConfiguration inputProcessingConfiguration;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the streaming source.
     * </p>
     * 
     * @param resourceARN
     *        Amazon Resource Name (ARN) of the streaming source.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the streaming source.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the streaming source.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the streaming source.
     * </p>
     * 
     * @param resourceARN
     *        Amazon Resource Name (ARN) of the streaming source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInputSchemaRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     * </p>
     * 
     * @param roleARN
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     * </p>
     * 
     * @return ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     * </p>
     * 
     * @param roleARN
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInputSchemaRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming source
     * discovery purposes.
     * </p>
     * 
     * @param inputStartingPositionConfiguration
     *        Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming
     *        source discovery purposes.
     */

    public void setInputStartingPositionConfiguration(InputStartingPositionConfiguration inputStartingPositionConfiguration) {
        this.inputStartingPositionConfiguration = inputStartingPositionConfiguration;
    }

    /**
     * <p>
     * Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming source
     * discovery purposes.
     * </p>
     * 
     * @return Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming
     *         source discovery purposes.
     */

    public InputStartingPositionConfiguration getInputStartingPositionConfiguration() {
        return this.inputStartingPositionConfiguration;
    }

    /**
     * <p>
     * Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming source
     * discovery purposes.
     * </p>
     * 
     * @param inputStartingPositionConfiguration
     *        Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming
     *        source discovery purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInputSchemaRequest withInputStartingPositionConfiguration(InputStartingPositionConfiguration inputStartingPositionConfiguration) {
        setInputStartingPositionConfiguration(inputStartingPositionConfiguration);
        return this;
    }

    /**
     * <p>
     * Specify this parameter to discover a schema from data in an Amazon S3 object.
     * </p>
     * 
     * @param s3Configuration
     *        Specify this parameter to discover a schema from data in an Amazon S3 object.
     */

    public void setS3Configuration(S3Configuration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * Specify this parameter to discover a schema from data in an Amazon S3 object.
     * </p>
     * 
     * @return Specify this parameter to discover a schema from data in an Amazon S3 object.
     */

    public S3Configuration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * Specify this parameter to discover a schema from data in an Amazon S3 object.
     * </p>
     * 
     * @param s3Configuration
     *        Specify this parameter to discover a schema from data in an Amazon S3 object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInputSchemaRequest withS3Configuration(S3Configuration s3Configuration) {
        setS3Configuration(s3Configuration);
        return this;
    }

    /**
     * <p>
     * The <a>InputProcessingConfiguration</a> to use to preprocess the records before discovering the schema of the
     * records.
     * </p>
     * 
     * @param inputProcessingConfiguration
     *        The <a>InputProcessingConfiguration</a> to use to preprocess the records before discovering the schema of
     *        the records.
     */

    public void setInputProcessingConfiguration(InputProcessingConfiguration inputProcessingConfiguration) {
        this.inputProcessingConfiguration = inputProcessingConfiguration;
    }

    /**
     * <p>
     * The <a>InputProcessingConfiguration</a> to use to preprocess the records before discovering the schema of the
     * records.
     * </p>
     * 
     * @return The <a>InputProcessingConfiguration</a> to use to preprocess the records before discovering the schema of
     *         the records.
     */

    public InputProcessingConfiguration getInputProcessingConfiguration() {
        return this.inputProcessingConfiguration;
    }

    /**
     * <p>
     * The <a>InputProcessingConfiguration</a> to use to preprocess the records before discovering the schema of the
     * records.
     * </p>
     * 
     * @param inputProcessingConfiguration
     *        The <a>InputProcessingConfiguration</a> to use to preprocess the records before discovering the schema of
     *        the records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInputSchemaRequest withInputProcessingConfiguration(InputProcessingConfiguration inputProcessingConfiguration) {
        setInputProcessingConfiguration(inputProcessingConfiguration);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getInputStartingPositionConfiguration() != null)
            sb.append("InputStartingPositionConfiguration: ").append(getInputStartingPositionConfiguration()).append(",");
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration()).append(",");
        if (getInputProcessingConfiguration() != null)
            sb.append("InputProcessingConfiguration: ").append(getInputProcessingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoverInputSchemaRequest == false)
            return false;
        DiscoverInputSchemaRequest other = (DiscoverInputSchemaRequest) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getInputStartingPositionConfiguration() == null ^ this.getInputStartingPositionConfiguration() == null)
            return false;
        if (other.getInputStartingPositionConfiguration() != null
                && other.getInputStartingPositionConfiguration().equals(this.getInputStartingPositionConfiguration()) == false)
            return false;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getInputProcessingConfiguration() == null ^ this.getInputProcessingConfiguration() == null)
            return false;
        if (other.getInputProcessingConfiguration() != null && other.getInputProcessingConfiguration().equals(this.getInputProcessingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getInputStartingPositionConfiguration() == null) ? 0 : getInputStartingPositionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getInputProcessingConfiguration() == null) ? 0 : getInputProcessingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DiscoverInputSchemaRequest clone() {
        return (DiscoverInputSchemaRequest) super.clone();
    }

}
