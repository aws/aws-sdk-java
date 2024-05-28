/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Lambda function involved in the finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/LambdaDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     */
    private String functionArn;
    /**
     * <p>
     * Name of the Lambda function.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Description of the Lambda function.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The timestamp when the Lambda function was last modified. This field is in the UTC date string format
     * <code>(2023-03-22T19:37:20.168Z)</code>.
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * The revision ID of the Lambda function version.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     */
    private String functionVersion;
    /**
     * <p>
     * The execution role of the Lambda function.
     * </p>
     */
    private String role;
    /**
     * <p>
     * Amazon Virtual Private Cloud configuration details associated with your Lambda function.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * A list of tags attached to this resource, listed in the format of <code>key</code>:<code>value</code> pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * 
     * @param functionArn
     *        Amazon Resource Name (ARN) of the Lambda function.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the Lambda function.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * 
     * @param functionArn
     *        Amazon Resource Name (ARN) of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaDetails withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * <p>
     * Name of the Lambda function.
     * </p>
     * 
     * @param functionName
     *        Name of the Lambda function.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * Name of the Lambda function.
     * </p>
     * 
     * @return Name of the Lambda function.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * Name of the Lambda function.
     * </p>
     * 
     * @param functionName
     *        Name of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaDetails withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Description of the Lambda function.
     * </p>
     * 
     * @param description
     *        Description of the Lambda function.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the Lambda function.
     * </p>
     * 
     * @return Description of the Lambda function.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the Lambda function.
     * </p>
     * 
     * @param description
     *        Description of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The timestamp when the Lambda function was last modified. This field is in the UTC date string format
     * <code>(2023-03-22T19:37:20.168Z)</code>.
     * </p>
     * 
     * @param lastModifiedAt
     *        The timestamp when the Lambda function was last modified. This field is in the UTC date string format
     *        <code>(2023-03-22T19:37:20.168Z)</code>.
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * The timestamp when the Lambda function was last modified. This field is in the UTC date string format
     * <code>(2023-03-22T19:37:20.168Z)</code>.
     * </p>
     * 
     * @return The timestamp when the Lambda function was last modified. This field is in the UTC date string format
     *         <code>(2023-03-22T19:37:20.168Z)</code>.
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * The timestamp when the Lambda function was last modified. This field is in the UTC date string format
     * <code>(2023-03-22T19:37:20.168Z)</code>.
     * </p>
     * 
     * @param lastModifiedAt
     *        The timestamp when the Lambda function was last modified. This field is in the UTC date string format
     *        <code>(2023-03-22T19:37:20.168Z)</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaDetails withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * The revision ID of the Lambda function version.
     * </p>
     * 
     * @param revisionId
     *        The revision ID of the Lambda function version.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The revision ID of the Lambda function version.
     * </p>
     * 
     * @return The revision ID of the Lambda function version.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The revision ID of the Lambda function version.
     * </p>
     * 
     * @param revisionId
     *        The revision ID of the Lambda function version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaDetails withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * 
     * @param functionVersion
     *        The version of the Lambda function.
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * 
     * @return The version of the Lambda function.
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * 
     * @param functionVersion
     *        The version of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaDetails withFunctionVersion(String functionVersion) {
        setFunctionVersion(functionVersion);
        return this;
    }

    /**
     * <p>
     * The execution role of the Lambda function.
     * </p>
     * 
     * @param role
     *        The execution role of the Lambda function.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The execution role of the Lambda function.
     * </p>
     * 
     * @return The execution role of the Lambda function.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The execution role of the Lambda function.
     * </p>
     * 
     * @param role
     *        The execution role of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaDetails withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * Amazon Virtual Private Cloud configuration details associated with your Lambda function.
     * </p>
     * 
     * @param vpcConfig
     *        Amazon Virtual Private Cloud configuration details associated with your Lambda function.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * Amazon Virtual Private Cloud configuration details associated with your Lambda function.
     * </p>
     * 
     * @return Amazon Virtual Private Cloud configuration details associated with your Lambda function.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * Amazon Virtual Private Cloud configuration details associated with your Lambda function.
     * </p>
     * 
     * @param vpcConfig
     *        Amazon Virtual Private Cloud configuration details associated with your Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaDetails withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * A list of tags attached to this resource, listed in the format of <code>key</code>:<code>value</code> pair.
     * </p>
     * 
     * @return A list of tags attached to this resource, listed in the format of <code>key</code>:<code>value</code>
     *         pair.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags attached to this resource, listed in the format of <code>key</code>:<code>value</code> pair.
     * </p>
     * 
     * @param tags
     *        A list of tags attached to this resource, listed in the format of <code>key</code>:<code>value</code>
     *        pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags attached to this resource, listed in the format of <code>key</code>:<code>value</code> pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags attached to this resource, listed in the format of <code>key</code>:<code>value</code>
     *        pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaDetails withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags attached to this resource, listed in the format of <code>key</code>:<code>value</code> pair.
     * </p>
     * 
     * @param tags
     *        A list of tags attached to this resource, listed in the format of <code>key</code>:<code>value</code>
     *        pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaDetails withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getFunctionVersion() != null)
            sb.append("FunctionVersion: ").append(getFunctionVersion()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaDetails == false)
            return false;
        LambdaDetails other = (LambdaDetails) obj;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getFunctionVersion() == null ^ this.getFunctionVersion() == null)
            return false;
        if (other.getFunctionVersion() != null && other.getFunctionVersion().equals(this.getFunctionVersion()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getFunctionVersion() == null) ? 0 : getFunctionVersion().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public LambdaDetails clone() {
        try {
            return (LambdaDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.LambdaDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
