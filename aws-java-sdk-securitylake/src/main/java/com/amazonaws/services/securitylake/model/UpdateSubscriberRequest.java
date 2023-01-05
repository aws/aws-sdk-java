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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The external ID of the Security Lake account.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * A value created by Security Lake that uniquely identifies your subscription.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. For the list of supported Amazon Web
     * Services, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     */
    private java.util.List<SourceType> sourceTypes;
    /**
     * <p>
     * The description of the Security Lake account subscriber.
     * </p>
     */
    private String subscriberDescription;
    /**
     * <p>
     * The name of the Security Lake account subscriber.
     * </p>
     */
    private String subscriberName;

    /**
     * <p>
     * The external ID of the Security Lake account.
     * </p>
     * 
     * @param externalId
     *        The external ID of the Security Lake account.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID of the Security Lake account.
     * </p>
     * 
     * @return The external ID of the Security Lake account.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID of the Security Lake account.
     * </p>
     * 
     * @param externalId
     *        The external ID of the Security Lake account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * A value created by Security Lake that uniquely identifies your subscription.
     * </p>
     * 
     * @param id
     *        A value created by Security Lake that uniquely identifies your subscription.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A value created by Security Lake that uniquely identifies your subscription.
     * </p>
     * 
     * @return A value created by Security Lake that uniquely identifies your subscription.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A value created by Security Lake that uniquely identifies your subscription.
     * </p>
     * 
     * @param id
     *        A value created by Security Lake that uniquely identifies your subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. For the list of supported Amazon Web
     * Services, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     * 
     * @return The supported Amazon Web Services from which logs and events are collected. For the list of supported
     *         Amazon Web Services, see the <a
     *         href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security
     *         Lake User Guide</a>.
     */

    public java.util.List<SourceType> getSourceTypes() {
        return sourceTypes;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. For the list of supported Amazon Web
     * Services, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     * 
     * @param sourceTypes
     *        The supported Amazon Web Services from which logs and events are collected. For the list of supported
     *        Amazon Web Services, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security
     *        Lake User Guide</a>.
     */

    public void setSourceTypes(java.util.Collection<SourceType> sourceTypes) {
        if (sourceTypes == null) {
            this.sourceTypes = null;
            return;
        }

        this.sourceTypes = new java.util.ArrayList<SourceType>(sourceTypes);
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. For the list of supported Amazon Web
     * Services, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceTypes(java.util.Collection)} or {@link #withSourceTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourceTypes
     *        The supported Amazon Web Services from which logs and events are collected. For the list of supported
     *        Amazon Web Services, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security
     *        Lake User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withSourceTypes(SourceType... sourceTypes) {
        if (this.sourceTypes == null) {
            setSourceTypes(new java.util.ArrayList<SourceType>(sourceTypes.length));
        }
        for (SourceType ele : sourceTypes) {
            this.sourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. For the list of supported Amazon Web
     * Services, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     * 
     * @param sourceTypes
     *        The supported Amazon Web Services from which logs and events are collected. For the list of supported
     *        Amazon Web Services, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security
     *        Lake User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withSourceTypes(java.util.Collection<SourceType> sourceTypes) {
        setSourceTypes(sourceTypes);
        return this;
    }

    /**
     * <p>
     * The description of the Security Lake account subscriber.
     * </p>
     * 
     * @param subscriberDescription
     *        The description of the Security Lake account subscriber.
     */

    public void setSubscriberDescription(String subscriberDescription) {
        this.subscriberDescription = subscriberDescription;
    }

    /**
     * <p>
     * The description of the Security Lake account subscriber.
     * </p>
     * 
     * @return The description of the Security Lake account subscriber.
     */

    public String getSubscriberDescription() {
        return this.subscriberDescription;
    }

    /**
     * <p>
     * The description of the Security Lake account subscriber.
     * </p>
     * 
     * @param subscriberDescription
     *        The description of the Security Lake account subscriber.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withSubscriberDescription(String subscriberDescription) {
        setSubscriberDescription(subscriberDescription);
        return this;
    }

    /**
     * <p>
     * The name of the Security Lake account subscriber.
     * </p>
     * 
     * @param subscriberName
     *        The name of the Security Lake account subscriber.
     */

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    /**
     * <p>
     * The name of the Security Lake account subscriber.
     * </p>
     * 
     * @return The name of the Security Lake account subscriber.
     */

    public String getSubscriberName() {
        return this.subscriberName;
    }

    /**
     * <p>
     * The name of the Security Lake account subscriber.
     * </p>
     * 
     * @param subscriberName
     *        The name of the Security Lake account subscriber.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withSubscriberName(String subscriberName) {
        setSubscriberName(subscriberName);
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
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSourceTypes() != null)
            sb.append("SourceTypes: ").append(getSourceTypes()).append(",");
        if (getSubscriberDescription() != null)
            sb.append("SubscriberDescription: ").append(getSubscriberDescription()).append(",");
        if (getSubscriberName() != null)
            sb.append("SubscriberName: ").append(getSubscriberName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSubscriberRequest == false)
            return false;
        UpdateSubscriberRequest other = (UpdateSubscriberRequest) obj;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSourceTypes() == null ^ this.getSourceTypes() == null)
            return false;
        if (other.getSourceTypes() != null && other.getSourceTypes().equals(this.getSourceTypes()) == false)
            return false;
        if (other.getSubscriberDescription() == null ^ this.getSubscriberDescription() == null)
            return false;
        if (other.getSubscriberDescription() != null && other.getSubscriberDescription().equals(this.getSubscriberDescription()) == false)
            return false;
        if (other.getSubscriberName() == null ^ this.getSubscriberName() == null)
            return false;
        if (other.getSubscriberName() != null && other.getSubscriberName().equals(this.getSubscriberName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSourceTypes() == null) ? 0 : getSourceTypes().hashCode());
        hashCode = prime * hashCode + ((getSubscriberDescription() == null) ? 0 : getSubscriberDescription().hashCode());
        hashCode = prime * hashCode + ((getSubscriberName() == null) ? 0 : getSubscriberName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriberRequest clone() {
        return (UpdateSubscriberRequest) super.clone();
    }

}
