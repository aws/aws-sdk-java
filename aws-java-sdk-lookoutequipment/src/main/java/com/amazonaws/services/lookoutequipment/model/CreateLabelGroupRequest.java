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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateLabelGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLabelGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Names a group of labels.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     */
    private String labelGroupName;
    /**
     * <p>
     * The acceptable fault codes (indicating the type of anomaly associated with the label) that can be used with this
     * label group.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     */
    private java.util.List<String> faultCodes;
    /**
     * <p>
     * A unique identifier for the request to create a label group. If you do not set the client request token, Lookout
     * for Equipment generates one.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Tags that provide metadata about the label group you are creating.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Names a group of labels.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param labelGroupName
     *        Names a group of labels.</p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     */

    public void setLabelGroupName(String labelGroupName) {
        this.labelGroupName = labelGroupName;
    }

    /**
     * <p>
     * Names a group of labels.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @return Names a group of labels.</p>
     *         <p>
     *         Data in this field will be retained for service usage. Follow best practices for the security of your
     *         data.
     */

    public String getLabelGroupName() {
        return this.labelGroupName;
    }

    /**
     * <p>
     * Names a group of labels.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param labelGroupName
     *        Names a group of labels.</p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelGroupRequest withLabelGroupName(String labelGroupName) {
        setLabelGroupName(labelGroupName);
        return this;
    }

    /**
     * <p>
     * The acceptable fault codes (indicating the type of anomaly associated with the label) that can be used with this
     * label group.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @return The acceptable fault codes (indicating the type of anomaly associated with the label) that can be used
     *         with this label group.</p>
     *         <p>
     *         Data in this field will be retained for service usage. Follow best practices for the security of your
     *         data.
     */

    public java.util.List<String> getFaultCodes() {
        return faultCodes;
    }

    /**
     * <p>
     * The acceptable fault codes (indicating the type of anomaly associated with the label) that can be used with this
     * label group.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param faultCodes
     *        The acceptable fault codes (indicating the type of anomaly associated with the label) that can be used
     *        with this label group.</p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     */

    public void setFaultCodes(java.util.Collection<String> faultCodes) {
        if (faultCodes == null) {
            this.faultCodes = null;
            return;
        }

        this.faultCodes = new java.util.ArrayList<String>(faultCodes);
    }

    /**
     * <p>
     * The acceptable fault codes (indicating the type of anomaly associated with the label) that can be used with this
     * label group.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaultCodes(java.util.Collection)} or {@link #withFaultCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param faultCodes
     *        The acceptable fault codes (indicating the type of anomaly associated with the label) that can be used
     *        with this label group.</p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelGroupRequest withFaultCodes(String... faultCodes) {
        if (this.faultCodes == null) {
            setFaultCodes(new java.util.ArrayList<String>(faultCodes.length));
        }
        for (String ele : faultCodes) {
            this.faultCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The acceptable fault codes (indicating the type of anomaly associated with the label) that can be used with this
     * label group.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param faultCodes
     *        The acceptable fault codes (indicating the type of anomaly associated with the label) that can be used
     *        with this label group.</p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelGroupRequest withFaultCodes(java.util.Collection<String> faultCodes) {
        setFaultCodes(faultCodes);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request to create a label group. If you do not set the client request token, Lookout
     * for Equipment generates one.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for the request to create a label group. If you do not set the client request token,
     *        Lookout for Equipment generates one.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request to create a label group. If you do not set the client request token, Lookout
     * for Equipment generates one.
     * </p>
     * 
     * @return A unique identifier for the request to create a label group. If you do not set the client request token,
     *         Lookout for Equipment generates one.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request to create a label group. If you do not set the client request token, Lookout
     * for Equipment generates one.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for the request to create a label group. If you do not set the client request token,
     *        Lookout for Equipment generates one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelGroupRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Tags that provide metadata about the label group you are creating.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @return Tags that provide metadata about the label group you are creating. </p>
     *         <p>
     *         Data in this field will be retained for service usage. Follow best practices for the security of your
     *         data.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags that provide metadata about the label group you are creating.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param tags
     *        Tags that provide metadata about the label group you are creating. </p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
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
     * Tags that provide metadata about the label group you are creating.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags that provide metadata about the label group you are creating. </p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelGroupRequest withTags(Tag... tags) {
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
     * Tags that provide metadata about the label group you are creating.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param tags
     *        Tags that provide metadata about the label group you are creating. </p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLabelGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getLabelGroupName() != null)
            sb.append("LabelGroupName: ").append(getLabelGroupName()).append(",");
        if (getFaultCodes() != null)
            sb.append("FaultCodes: ").append(getFaultCodes()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CreateLabelGroupRequest == false)
            return false;
        CreateLabelGroupRequest other = (CreateLabelGroupRequest) obj;
        if (other.getLabelGroupName() == null ^ this.getLabelGroupName() == null)
            return false;
        if (other.getLabelGroupName() != null && other.getLabelGroupName().equals(this.getLabelGroupName()) == false)
            return false;
        if (other.getFaultCodes() == null ^ this.getFaultCodes() == null)
            return false;
        if (other.getFaultCodes() != null && other.getFaultCodes().equals(this.getFaultCodes()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getLabelGroupName() == null) ? 0 : getLabelGroupName().hashCode());
        hashCode = prime * hashCode + ((getFaultCodes() == null) ? 0 : getFaultCodes().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLabelGroupRequest clone() {
        return (CreateLabelGroupRequest) super.clone();
    }

}
