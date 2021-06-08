/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the configuration of the S3 bucket that contains source files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/S3SourceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3SourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of an IAM role that has read and write access permissions to the source S3 bucket.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A list of templated paths to the source files.
     * </p>
     */
    private java.util.List<String> templatedPathList;
    /**
     * <p>
     * A list of paths to the historical data files.
     * </p>
     */
    private java.util.List<String> historicalDataPathList;
    /**
     * <p>
     * Contains information about a source file's formatting.
     * </p>
     */
    private FileFormatDescriptor fileFormatDescriptor;

    /**
     * <p>
     * The ARN of an IAM role that has read and write access permissions to the source S3 bucket.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that has read and write access permissions to the source S3 bucket.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that has read and write access permissions to the source S3 bucket.
     * </p>
     * 
     * @return The ARN of an IAM role that has read and write access permissions to the source S3 bucket.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that has read and write access permissions to the source S3 bucket.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that has read and write access permissions to the source S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SourceConfig withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A list of templated paths to the source files.
     * </p>
     * 
     * @return A list of templated paths to the source files.
     */

    public java.util.List<String> getTemplatedPathList() {
        return templatedPathList;
    }

    /**
     * <p>
     * A list of templated paths to the source files.
     * </p>
     * 
     * @param templatedPathList
     *        A list of templated paths to the source files.
     */

    public void setTemplatedPathList(java.util.Collection<String> templatedPathList) {
        if (templatedPathList == null) {
            this.templatedPathList = null;
            return;
        }

        this.templatedPathList = new java.util.ArrayList<String>(templatedPathList);
    }

    /**
     * <p>
     * A list of templated paths to the source files.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplatedPathList(java.util.Collection)} or {@link #withTemplatedPathList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param templatedPathList
     *        A list of templated paths to the source files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SourceConfig withTemplatedPathList(String... templatedPathList) {
        if (this.templatedPathList == null) {
            setTemplatedPathList(new java.util.ArrayList<String>(templatedPathList.length));
        }
        for (String ele : templatedPathList) {
            this.templatedPathList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of templated paths to the source files.
     * </p>
     * 
     * @param templatedPathList
     *        A list of templated paths to the source files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SourceConfig withTemplatedPathList(java.util.Collection<String> templatedPathList) {
        setTemplatedPathList(templatedPathList);
        return this;
    }

    /**
     * <p>
     * A list of paths to the historical data files.
     * </p>
     * 
     * @return A list of paths to the historical data files.
     */

    public java.util.List<String> getHistoricalDataPathList() {
        return historicalDataPathList;
    }

    /**
     * <p>
     * A list of paths to the historical data files.
     * </p>
     * 
     * @param historicalDataPathList
     *        A list of paths to the historical data files.
     */

    public void setHistoricalDataPathList(java.util.Collection<String> historicalDataPathList) {
        if (historicalDataPathList == null) {
            this.historicalDataPathList = null;
            return;
        }

        this.historicalDataPathList = new java.util.ArrayList<String>(historicalDataPathList);
    }

    /**
     * <p>
     * A list of paths to the historical data files.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHistoricalDataPathList(java.util.Collection)} or
     * {@link #withHistoricalDataPathList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param historicalDataPathList
     *        A list of paths to the historical data files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SourceConfig withHistoricalDataPathList(String... historicalDataPathList) {
        if (this.historicalDataPathList == null) {
            setHistoricalDataPathList(new java.util.ArrayList<String>(historicalDataPathList.length));
        }
        for (String ele : historicalDataPathList) {
            this.historicalDataPathList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of paths to the historical data files.
     * </p>
     * 
     * @param historicalDataPathList
     *        A list of paths to the historical data files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SourceConfig withHistoricalDataPathList(java.util.Collection<String> historicalDataPathList) {
        setHistoricalDataPathList(historicalDataPathList);
        return this;
    }

    /**
     * <p>
     * Contains information about a source file's formatting.
     * </p>
     * 
     * @param fileFormatDescriptor
     *        Contains information about a source file's formatting.
     */

    public void setFileFormatDescriptor(FileFormatDescriptor fileFormatDescriptor) {
        this.fileFormatDescriptor = fileFormatDescriptor;
    }

    /**
     * <p>
     * Contains information about a source file's formatting.
     * </p>
     * 
     * @return Contains information about a source file's formatting.
     */

    public FileFormatDescriptor getFileFormatDescriptor() {
        return this.fileFormatDescriptor;
    }

    /**
     * <p>
     * Contains information about a source file's formatting.
     * </p>
     * 
     * @param fileFormatDescriptor
     *        Contains information about a source file's formatting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SourceConfig withFileFormatDescriptor(FileFormatDescriptor fileFormatDescriptor) {
        setFileFormatDescriptor(fileFormatDescriptor);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTemplatedPathList() != null)
            sb.append("TemplatedPathList: ").append(getTemplatedPathList()).append(",");
        if (getHistoricalDataPathList() != null)
            sb.append("HistoricalDataPathList: ").append(getHistoricalDataPathList()).append(",");
        if (getFileFormatDescriptor() != null)
            sb.append("FileFormatDescriptor: ").append(getFileFormatDescriptor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3SourceConfig == false)
            return false;
        S3SourceConfig other = (S3SourceConfig) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTemplatedPathList() == null ^ this.getTemplatedPathList() == null)
            return false;
        if (other.getTemplatedPathList() != null && other.getTemplatedPathList().equals(this.getTemplatedPathList()) == false)
            return false;
        if (other.getHistoricalDataPathList() == null ^ this.getHistoricalDataPathList() == null)
            return false;
        if (other.getHistoricalDataPathList() != null && other.getHistoricalDataPathList().equals(this.getHistoricalDataPathList()) == false)
            return false;
        if (other.getFileFormatDescriptor() == null ^ this.getFileFormatDescriptor() == null)
            return false;
        if (other.getFileFormatDescriptor() != null && other.getFileFormatDescriptor().equals(this.getFileFormatDescriptor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTemplatedPathList() == null) ? 0 : getTemplatedPathList().hashCode());
        hashCode = prime * hashCode + ((getHistoricalDataPathList() == null) ? 0 : getHistoricalDataPathList().hashCode());
        hashCode = prime * hashCode + ((getFileFormatDescriptor() == null) ? 0 : getFileFormatDescriptor().hashCode());
        return hashCode;
    }

    @Override
    public S3SourceConfig clone() {
        try {
            return (S3SourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.S3SourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
