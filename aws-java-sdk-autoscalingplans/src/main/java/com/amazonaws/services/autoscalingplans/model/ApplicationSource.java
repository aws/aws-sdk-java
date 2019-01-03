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
package com.amazonaws.services.autoscalingplans.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an application source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/ApplicationSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
     * </p>
     */
    private String cloudFormationStackARN;
    /**
     * <p>
     * A set of tags (up to 50).
     * </p>
     */
    private java.util.List<TagFilter> tagFilters;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
     * </p>
     * 
     * @param cloudFormationStackARN
     *        The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
     */

    public void setCloudFormationStackARN(String cloudFormationStackARN) {
        this.cloudFormationStackARN = cloudFormationStackARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
     */

    public String getCloudFormationStackARN() {
        return this.cloudFormationStackARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
     * </p>
     * 
     * @param cloudFormationStackARN
     *        The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSource withCloudFormationStackARN(String cloudFormationStackARN) {
        setCloudFormationStackARN(cloudFormationStackARN);
        return this;
    }

    /**
     * <p>
     * A set of tags (up to 50).
     * </p>
     * 
     * @return A set of tags (up to 50).
     */

    public java.util.List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * <p>
     * A set of tags (up to 50).
     * </p>
     * 
     * @param tagFilters
     *        A set of tags (up to 50).
     */

    public void setTagFilters(java.util.Collection<TagFilter> tagFilters) {
        if (tagFilters == null) {
            this.tagFilters = null;
            return;
        }

        this.tagFilters = new java.util.ArrayList<TagFilter>(tagFilters);
    }

    /**
     * <p>
     * A set of tags (up to 50).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagFilters(java.util.Collection)} or {@link #withTagFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagFilters
     *        A set of tags (up to 50).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSource withTagFilters(TagFilter... tagFilters) {
        if (this.tagFilters == null) {
            setTagFilters(new java.util.ArrayList<TagFilter>(tagFilters.length));
        }
        for (TagFilter ele : tagFilters) {
            this.tagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of tags (up to 50).
     * </p>
     * 
     * @param tagFilters
     *        A set of tags (up to 50).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSource withTagFilters(java.util.Collection<TagFilter> tagFilters) {
        setTagFilters(tagFilters);
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
        if (getCloudFormationStackARN() != null)
            sb.append("CloudFormationStackARN: ").append(getCloudFormationStackARN()).append(",");
        if (getTagFilters() != null)
            sb.append("TagFilters: ").append(getTagFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationSource == false)
            return false;
        ApplicationSource other = (ApplicationSource) obj;
        if (other.getCloudFormationStackARN() == null ^ this.getCloudFormationStackARN() == null)
            return false;
        if (other.getCloudFormationStackARN() != null && other.getCloudFormationStackARN().equals(this.getCloudFormationStackARN()) == false)
            return false;
        if (other.getTagFilters() == null ^ this.getTagFilters() == null)
            return false;
        if (other.getTagFilters() != null && other.getTagFilters().equals(this.getTagFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudFormationStackARN() == null) ? 0 : getCloudFormationStackARN().hashCode());
        hashCode = prime * hashCode + ((getTagFilters() == null) ? 0 : getTagFilters().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSource clone() {
        try {
            return (ApplicationSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.autoscalingplans.model.transform.ApplicationSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
