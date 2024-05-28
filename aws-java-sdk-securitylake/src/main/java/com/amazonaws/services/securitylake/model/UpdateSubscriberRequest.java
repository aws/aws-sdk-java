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
     * The supported Amazon Web Services from which logs and events are collected. For the list of supported Amazon Web
     * Services, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     */
    private java.util.List<LogSourceResource> sources;
    /**
     * <p>
     * The description of the Security Lake account subscriber.
     * </p>
     */
    private String subscriberDescription;
    /**
     * <p>
     * A value created by Security Lake that uniquely identifies your subscription.
     * </p>
     */
    private String subscriberId;
    /**
     * <p>
     * The AWS identity used to access your data.
     * </p>
     */
    private AwsIdentity subscriberIdentity;
    /**
     * <p>
     * The name of the Security Lake account subscriber.
     * </p>
     */
    private String subscriberName;

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

    public java.util.List<LogSourceResource> getSources() {
        return sources;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. For the list of supported Amazon Web
     * Services, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     * 
     * @param sources
     *        The supported Amazon Web Services from which logs and events are collected. For the list of supported
     *        Amazon Web Services, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security
     *        Lake User Guide</a>.
     */

    public void setSources(java.util.Collection<LogSourceResource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<LogSourceResource>(sources);
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
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The supported Amazon Web Services from which logs and events are collected. For the list of supported
     *        Amazon Web Services, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security
     *        Lake User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withSources(LogSourceResource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<LogSourceResource>(sources.length));
        }
        for (LogSourceResource ele : sources) {
            this.sources.add(ele);
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
     * @param sources
     *        The supported Amazon Web Services from which logs and events are collected. For the list of supported
     *        Amazon Web Services, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security
     *        Lake User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withSources(java.util.Collection<LogSourceResource> sources) {
        setSources(sources);
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
     * A value created by Security Lake that uniquely identifies your subscription.
     * </p>
     * 
     * @param subscriberId
     *        A value created by Security Lake that uniquely identifies your subscription.
     */

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    /**
     * <p>
     * A value created by Security Lake that uniquely identifies your subscription.
     * </p>
     * 
     * @return A value created by Security Lake that uniquely identifies your subscription.
     */

    public String getSubscriberId() {
        return this.subscriberId;
    }

    /**
     * <p>
     * A value created by Security Lake that uniquely identifies your subscription.
     * </p>
     * 
     * @param subscriberId
     *        A value created by Security Lake that uniquely identifies your subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withSubscriberId(String subscriberId) {
        setSubscriberId(subscriberId);
        return this;
    }

    /**
     * <p>
     * The AWS identity used to access your data.
     * </p>
     * 
     * @param subscriberIdentity
     *        The AWS identity used to access your data.
     */

    public void setSubscriberIdentity(AwsIdentity subscriberIdentity) {
        this.subscriberIdentity = subscriberIdentity;
    }

    /**
     * <p>
     * The AWS identity used to access your data.
     * </p>
     * 
     * @return The AWS identity used to access your data.
     */

    public AwsIdentity getSubscriberIdentity() {
        return this.subscriberIdentity;
    }

    /**
     * <p>
     * The AWS identity used to access your data.
     * </p>
     * 
     * @param subscriberIdentity
     *        The AWS identity used to access your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withSubscriberIdentity(AwsIdentity subscriberIdentity) {
        setSubscriberIdentity(subscriberIdentity);
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
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getSubscriberDescription() != null)
            sb.append("SubscriberDescription: ").append(getSubscriberDescription()).append(",");
        if (getSubscriberId() != null)
            sb.append("SubscriberId: ").append(getSubscriberId()).append(",");
        if (getSubscriberIdentity() != null)
            sb.append("SubscriberIdentity: ").append(getSubscriberIdentity()).append(",");
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
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getSubscriberDescription() == null ^ this.getSubscriberDescription() == null)
            return false;
        if (other.getSubscriberDescription() != null && other.getSubscriberDescription().equals(this.getSubscriberDescription()) == false)
            return false;
        if (other.getSubscriberId() == null ^ this.getSubscriberId() == null)
            return false;
        if (other.getSubscriberId() != null && other.getSubscriberId().equals(this.getSubscriberId()) == false)
            return false;
        if (other.getSubscriberIdentity() == null ^ this.getSubscriberIdentity() == null)
            return false;
        if (other.getSubscriberIdentity() != null && other.getSubscriberIdentity().equals(this.getSubscriberIdentity()) == false)
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

        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getSubscriberDescription() == null) ? 0 : getSubscriberDescription().hashCode());
        hashCode = prime * hashCode + ((getSubscriberId() == null) ? 0 : getSubscriberId().hashCode());
        hashCode = prime * hashCode + ((getSubscriberIdentity() == null) ? 0 : getSubscriberIdentity().hashCode());
        hashCode = prime * hashCode + ((getSubscriberName() == null) ? 0 : getSubscriberName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriberRequest clone() {
        return (UpdateSubscriberRequest) super.clone();
    }

}
