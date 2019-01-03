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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartThingRegistrationTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The provisioning template.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     */
    private String inputFileBucket;
    /**
     * <p>
     * The name of input file within the S3 bucket. This file contains a newline delimited JSON file. Each line contains
     * the parameter values to provision one device (thing).
     * </p>
     */
    private String inputFileKey;
    /**
     * <p>
     * The IAM role ARN that grants permission the input file.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The provisioning template.
     * </p>
     * 
     * @param templateBody
     *        The provisioning template.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The provisioning template.
     * </p>
     * 
     * @return The provisioning template.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The provisioning template.
     * </p>
     * 
     * @param templateBody
     *        The provisioning template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartThingRegistrationTaskRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * 
     * @param inputFileBucket
     *        The S3 bucket that contains the input file.
     */

    public void setInputFileBucket(String inputFileBucket) {
        this.inputFileBucket = inputFileBucket;
    }

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * 
     * @return The S3 bucket that contains the input file.
     */

    public String getInputFileBucket() {
        return this.inputFileBucket;
    }

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * 
     * @param inputFileBucket
     *        The S3 bucket that contains the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartThingRegistrationTaskRequest withInputFileBucket(String inputFileBucket) {
        setInputFileBucket(inputFileBucket);
        return this;
    }

    /**
     * <p>
     * The name of input file within the S3 bucket. This file contains a newline delimited JSON file. Each line contains
     * the parameter values to provision one device (thing).
     * </p>
     * 
     * @param inputFileKey
     *        The name of input file within the S3 bucket. This file contains a newline delimited JSON file. Each line
     *        contains the parameter values to provision one device (thing).
     */

    public void setInputFileKey(String inputFileKey) {
        this.inputFileKey = inputFileKey;
    }

    /**
     * <p>
     * The name of input file within the S3 bucket. This file contains a newline delimited JSON file. Each line contains
     * the parameter values to provision one device (thing).
     * </p>
     * 
     * @return The name of input file within the S3 bucket. This file contains a newline delimited JSON file. Each line
     *         contains the parameter values to provision one device (thing).
     */

    public String getInputFileKey() {
        return this.inputFileKey;
    }

    /**
     * <p>
     * The name of input file within the S3 bucket. This file contains a newline delimited JSON file. Each line contains
     * the parameter values to provision one device (thing).
     * </p>
     * 
     * @param inputFileKey
     *        The name of input file within the S3 bucket. This file contains a newline delimited JSON file. Each line
     *        contains the parameter values to provision one device (thing).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartThingRegistrationTaskRequest withInputFileKey(String inputFileKey) {
        setInputFileKey(inputFileKey);
        return this;
    }

    /**
     * <p>
     * The IAM role ARN that grants permission the input file.
     * </p>
     * 
     * @param roleArn
     *        The IAM role ARN that grants permission the input file.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that grants permission the input file.
     * </p>
     * 
     * @return The IAM role ARN that grants permission the input file.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that grants permission the input file.
     * </p>
     * 
     * @param roleArn
     *        The IAM role ARN that grants permission the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartThingRegistrationTaskRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getInputFileBucket() != null)
            sb.append("InputFileBucket: ").append(getInputFileBucket()).append(",");
        if (getInputFileKey() != null)
            sb.append("InputFileKey: ").append(getInputFileKey()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartThingRegistrationTaskRequest == false)
            return false;
        StartThingRegistrationTaskRequest other = (StartThingRegistrationTaskRequest) obj;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getInputFileBucket() == null ^ this.getInputFileBucket() == null)
            return false;
        if (other.getInputFileBucket() != null && other.getInputFileBucket().equals(this.getInputFileBucket()) == false)
            return false;
        if (other.getInputFileKey() == null ^ this.getInputFileKey() == null)
            return false;
        if (other.getInputFileKey() != null && other.getInputFileKey().equals(this.getInputFileKey()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getInputFileBucket() == null) ? 0 : getInputFileBucket().hashCode());
        hashCode = prime * hashCode + ((getInputFileKey() == null) ? 0 : getInputFileKey().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public StartThingRegistrationTaskRequest clone() {
        return (StartThingRegistrationTaskRequest) super.clone();
    }

}
