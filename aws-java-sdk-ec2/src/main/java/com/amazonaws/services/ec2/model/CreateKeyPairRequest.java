/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateKeyPairRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKeyPairRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateKeyPairRequest> {

    /**
     * <p>
     * A unique name for the key pair.
     * </p>
     * <p>
     * Constraints: Up to 255 ASCII characters
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * The tags to apply to the new key pair.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * Default constructor for CreateKeyPairRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateKeyPairRequest() {
    }

    /**
     * Constructs a new CreateKeyPairRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param keyName
     *        A unique name for the key pair.</p>
     *        <p>
     *        Constraints: Up to 255 ASCII characters
     */
    public CreateKeyPairRequest(String keyName) {
        setKeyName(keyName);
    }

    /**
     * <p>
     * A unique name for the key pair.
     * </p>
     * <p>
     * Constraints: Up to 255 ASCII characters
     * </p>
     * 
     * @param keyName
     *        A unique name for the key pair.</p>
     *        <p>
     *        Constraints: Up to 255 ASCII characters
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * A unique name for the key pair.
     * </p>
     * <p>
     * Constraints: Up to 255 ASCII characters
     * </p>
     * 
     * @return A unique name for the key pair.</p>
     *         <p>
     *         Constraints: Up to 255 ASCII characters
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * A unique name for the key pair.
     * </p>
     * <p>
     * Constraints: Up to 255 ASCII characters
     * </p>
     * 
     * @param keyName
     *        A unique name for the key pair.</p>
     *        <p>
     *        Constraints: Up to 255 ASCII characters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyPairRequest withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the new key pair.
     * </p>
     * 
     * @return The tags to apply to the new key pair.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the new key pair.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the new key pair.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the new key pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the new key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyPairRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the new key pair.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the new key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyPairRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateKeyPairRequest> getDryRunRequest() {
        Request<CreateKeyPairRequest> request = new CreateKeyPairRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyPairRequest == false)
            return false;
        CreateKeyPairRequest other = (CreateKeyPairRequest) obj;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeyPairRequest clone() {
        return (CreateKeyPairRequest) super.clone();
    }
}
