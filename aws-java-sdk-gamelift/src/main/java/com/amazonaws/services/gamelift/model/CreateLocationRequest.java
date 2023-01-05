/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A descriptive name for the custom location.
     * </p>
     */
    private String locationName;
    /**
     * <p>
     * A list of labels to assign to the new matchmaking configuration resource. Tags are developer-defined key-value
     * pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost
     * allocation. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     * Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Rareference</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A descriptive name for the custom location.
     * </p>
     * 
     * @param locationName
     *        A descriptive name for the custom location.
     */

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * <p>
     * A descriptive name for the custom location.
     * </p>
     * 
     * @return A descriptive name for the custom location.
     */

    public String getLocationName() {
        return this.locationName;
    }

    /**
     * <p>
     * A descriptive name for the custom location.
     * </p>
     * 
     * @param locationName
     *        A descriptive name for the custom location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationRequest withLocationName(String locationName) {
        setLocationName(locationName);
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new matchmaking configuration resource. Tags are developer-defined key-value
     * pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost
     * allocation. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     * Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Rareference</i>.
     * </p>
     * 
     * @return A list of labels to assign to the new matchmaking configuration resource. Tags are developer-defined
     *         key-value pairs. Tagging Amazon Web Services resources are useful for resource management, access
     *         management and cost allocation. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web Services
     *         Resources</a> in the <i>Amazon Web Services General Rareference</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of labels to assign to the new matchmaking configuration resource. Tags are developer-defined key-value
     * pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost
     * allocation. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     * Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Rareference</i>.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new matchmaking configuration resource. Tags are developer-defined
     *        key-value pairs. Tagging Amazon Web Services resources are useful for resource management, access
     *        management and cost allocation. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web Services
     *        Resources</a> in the <i>Amazon Web Services General Rareference</i>.
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
     * A list of labels to assign to the new matchmaking configuration resource. Tags are developer-defined key-value
     * pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost
     * allocation. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     * Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Rareference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new matchmaking configuration resource. Tags are developer-defined
     *        key-value pairs. Tagging Amazon Web Services resources are useful for resource management, access
     *        management and cost allocation. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web Services
     *        Resources</a> in the <i>Amazon Web Services General Rareference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationRequest withTags(Tag... tags) {
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
     * A list of labels to assign to the new matchmaking configuration resource. Tags are developer-defined key-value
     * pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost
     * allocation. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     * Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Rareference</i>.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new matchmaking configuration resource. Tags are developer-defined
     *        key-value pairs. Tagging Amazon Web Services resources are useful for resource management, access
     *        management and cost allocation. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web Services
     *        Resources</a> in the <i>Amazon Web Services General Rareference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getLocationName() != null)
            sb.append("LocationName: ").append(getLocationName()).append(",");
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

        if (obj instanceof CreateLocationRequest == false)
            return false;
        CreateLocationRequest other = (CreateLocationRequest) obj;
        if (other.getLocationName() == null ^ this.getLocationName() == null)
            return false;
        if (other.getLocationName() != null && other.getLocationName().equals(this.getLocationName()) == false)
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

        hashCode = prime * hashCode + ((getLocationName() == null) ? 0 : getLocationName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationRequest clone() {
        return (CreateLocationRequest) super.clone();
    }

}
