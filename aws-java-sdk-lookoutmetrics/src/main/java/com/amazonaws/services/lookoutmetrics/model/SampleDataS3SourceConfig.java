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
 * Contains information about the source configuration in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/SampleDataS3SourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SampleDataS3SourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An array of strings containing the list of templated paths.
     * </p>
     */
    private java.util.List<String> templatedPathList;
    /**
     * <p>
     * An array of strings containing the historical set of data paths.
     * </p>
     */
    private java.util.List<String> historicalDataPathList;

    private FileFormatDescriptor fileFormatDescriptor;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleDataS3SourceConfig withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An array of strings containing the list of templated paths.
     * </p>
     * 
     * @return An array of strings containing the list of templated paths.
     */

    public java.util.List<String> getTemplatedPathList() {
        return templatedPathList;
    }

    /**
     * <p>
     * An array of strings containing the list of templated paths.
     * </p>
     * 
     * @param templatedPathList
     *        An array of strings containing the list of templated paths.
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
     * An array of strings containing the list of templated paths.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplatedPathList(java.util.Collection)} or {@link #withTemplatedPathList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param templatedPathList
     *        An array of strings containing the list of templated paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleDataS3SourceConfig withTemplatedPathList(String... templatedPathList) {
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
     * An array of strings containing the list of templated paths.
     * </p>
     * 
     * @param templatedPathList
     *        An array of strings containing the list of templated paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleDataS3SourceConfig withTemplatedPathList(java.util.Collection<String> templatedPathList) {
        setTemplatedPathList(templatedPathList);
        return this;
    }

    /**
     * <p>
     * An array of strings containing the historical set of data paths.
     * </p>
     * 
     * @return An array of strings containing the historical set of data paths.
     */

    public java.util.List<String> getHistoricalDataPathList() {
        return historicalDataPathList;
    }

    /**
     * <p>
     * An array of strings containing the historical set of data paths.
     * </p>
     * 
     * @param historicalDataPathList
     *        An array of strings containing the historical set of data paths.
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
     * An array of strings containing the historical set of data paths.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHistoricalDataPathList(java.util.Collection)} or
     * {@link #withHistoricalDataPathList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param historicalDataPathList
     *        An array of strings containing the historical set of data paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleDataS3SourceConfig withHistoricalDataPathList(String... historicalDataPathList) {
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
     * An array of strings containing the historical set of data paths.
     * </p>
     * 
     * @param historicalDataPathList
     *        An array of strings containing the historical set of data paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleDataS3SourceConfig withHistoricalDataPathList(java.util.Collection<String> historicalDataPathList) {
        setHistoricalDataPathList(historicalDataPathList);
        return this;
    }

    /**
     * @param fileFormatDescriptor
     */

    public void setFileFormatDescriptor(FileFormatDescriptor fileFormatDescriptor) {
        this.fileFormatDescriptor = fileFormatDescriptor;
    }

    /**
     * @return
     */

    public FileFormatDescriptor getFileFormatDescriptor() {
        return this.fileFormatDescriptor;
    }

    /**
     * @param fileFormatDescriptor
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleDataS3SourceConfig withFileFormatDescriptor(FileFormatDescriptor fileFormatDescriptor) {
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

        if (obj instanceof SampleDataS3SourceConfig == false)
            return false;
        SampleDataS3SourceConfig other = (SampleDataS3SourceConfig) obj;
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
    public SampleDataS3SourceConfig clone() {
        try {
            return (SampleDataS3SourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.SampleDataS3SourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
