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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon S3 or Lake Formation access type.
     * </p>
     */
    private java.util.List<String> accessTypes;
    /**
     * <p>
     * The Amazon Web Services account ID used to access your data.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The external ID of the subscriber. This lets the user that is assuming the role assert the circumstances in which
     * they are operating. It also provides a way for the account owner to permit the role to be assumed only under
     * specific circumstances.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and event
     * collection for natively supported Amazon Web Services.
     * </p>
     */
    private java.util.List<SourceType> sourceTypes;
    /**
     * <p>
     * The description for your subscriber account in Security Lake.
     * </p>
     */
    private String subscriberDescription;
    /**
     * <p>
     * The name of your Security Lake subscriber account.
     * </p>
     */
    private String subscriberName;

    /**
     * <p>
     * The Amazon S3 or Lake Formation access type.
     * </p>
     * 
     * @return The Amazon S3 or Lake Formation access type.
     * @see AccessType
     */

    public java.util.List<String> getAccessTypes() {
        return accessTypes;
    }

    /**
     * <p>
     * The Amazon S3 or Lake Formation access type.
     * </p>
     * 
     * @param accessTypes
     *        The Amazon S3 or Lake Formation access type.
     * @see AccessType
     */

    public void setAccessTypes(java.util.Collection<String> accessTypes) {
        if (accessTypes == null) {
            this.accessTypes = null;
            return;
        }

        this.accessTypes = new java.util.ArrayList<String>(accessTypes);
    }

    /**
     * <p>
     * The Amazon S3 or Lake Formation access type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessTypes(java.util.Collection)} or {@link #withAccessTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accessTypes
     *        The Amazon S3 or Lake Formation access type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public CreateSubscriberRequest withAccessTypes(String... accessTypes) {
        if (this.accessTypes == null) {
            setAccessTypes(new java.util.ArrayList<String>(accessTypes.length));
        }
        for (String ele : accessTypes) {
            this.accessTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon S3 or Lake Formation access type.
     * </p>
     * 
     * @param accessTypes
     *        The Amazon S3 or Lake Formation access type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public CreateSubscriberRequest withAccessTypes(java.util.Collection<String> accessTypes) {
        setAccessTypes(accessTypes);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 or Lake Formation access type.
     * </p>
     * 
     * @param accessTypes
     *        The Amazon S3 or Lake Formation access type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public CreateSubscriberRequest withAccessTypes(AccessType... accessTypes) {
        java.util.ArrayList<String> accessTypesCopy = new java.util.ArrayList<String>(accessTypes.length);
        for (AccessType value : accessTypes) {
            accessTypesCopy.add(value.toString());
        }
        if (getAccessTypes() == null) {
            setAccessTypes(accessTypesCopy);
        } else {
            getAccessTypes().addAll(accessTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID used to access your data.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID used to access your data.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID used to access your data.
     * </p>
     * 
     * @return The Amazon Web Services account ID used to access your data.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID used to access your data.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID used to access your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The external ID of the subscriber. This lets the user that is assuming the role assert the circumstances in which
     * they are operating. It also provides a way for the account owner to permit the role to be assumed only under
     * specific circumstances.
     * </p>
     * 
     * @param externalId
     *        The external ID of the subscriber. This lets the user that is assuming the role assert the circumstances
     *        in which they are operating. It also provides a way for the account owner to permit the role to be assumed
     *        only under specific circumstances.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID of the subscriber. This lets the user that is assuming the role assert the circumstances in which
     * they are operating. It also provides a way for the account owner to permit the role to be assumed only under
     * specific circumstances.
     * </p>
     * 
     * @return The external ID of the subscriber. This lets the user that is assuming the role assert the circumstances
     *         in which they are operating. It also provides a way for the account owner to permit the role to be
     *         assumed only under specific circumstances.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID of the subscriber. This lets the user that is assuming the role assert the circumstances in which
     * they are operating. It also provides a way for the account owner to permit the role to be assumed only under
     * specific circumstances.
     * </p>
     * 
     * @param externalId
     *        The external ID of the subscriber. This lets the user that is assuming the role assert the circumstances
     *        in which they are operating. It also provides a way for the account owner to permit the role to be assumed
     *        only under specific circumstances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and event
     * collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @return The supported Amazon Web Services from which logs and events are collected. Security Lake supports log
     *         and event collection for natively supported Amazon Web Services.
     */

    public java.util.List<SourceType> getSourceTypes() {
        return sourceTypes;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and event
     * collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @param sourceTypes
     *        The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and
     *        event collection for natively supported Amazon Web Services.
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
     * The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and event
     * collection for natively supported Amazon Web Services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceTypes(java.util.Collection)} or {@link #withSourceTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourceTypes
     *        The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and
     *        event collection for natively supported Amazon Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withSourceTypes(SourceType... sourceTypes) {
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
     * The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and event
     * collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @param sourceTypes
     *        The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and
     *        event collection for natively supported Amazon Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withSourceTypes(java.util.Collection<SourceType> sourceTypes) {
        setSourceTypes(sourceTypes);
        return this;
    }

    /**
     * <p>
     * The description for your subscriber account in Security Lake.
     * </p>
     * 
     * @param subscriberDescription
     *        The description for your subscriber account in Security Lake.
     */

    public void setSubscriberDescription(String subscriberDescription) {
        this.subscriberDescription = subscriberDescription;
    }

    /**
     * <p>
     * The description for your subscriber account in Security Lake.
     * </p>
     * 
     * @return The description for your subscriber account in Security Lake.
     */

    public String getSubscriberDescription() {
        return this.subscriberDescription;
    }

    /**
     * <p>
     * The description for your subscriber account in Security Lake.
     * </p>
     * 
     * @param subscriberDescription
     *        The description for your subscriber account in Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withSubscriberDescription(String subscriberDescription) {
        setSubscriberDescription(subscriberDescription);
        return this;
    }

    /**
     * <p>
     * The name of your Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberName
     *        The name of your Security Lake subscriber account.
     */

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    /**
     * <p>
     * The name of your Security Lake subscriber account.
     * </p>
     * 
     * @return The name of your Security Lake subscriber account.
     */

    public String getSubscriberName() {
        return this.subscriberName;
    }

    /**
     * <p>
     * The name of your Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberName
     *        The name of your Security Lake subscriber account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withSubscriberName(String subscriberName) {
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
        if (getAccessTypes() != null)
            sb.append("AccessTypes: ").append(getAccessTypes()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
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

        if (obj instanceof CreateSubscriberRequest == false)
            return false;
        CreateSubscriberRequest other = (CreateSubscriberRequest) obj;
        if (other.getAccessTypes() == null ^ this.getAccessTypes() == null)
            return false;
        if (other.getAccessTypes() != null && other.getAccessTypes().equals(this.getAccessTypes()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
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

        hashCode = prime * hashCode + ((getAccessTypes() == null) ? 0 : getAccessTypes().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getSourceTypes() == null) ? 0 : getSourceTypes().hashCode());
        hashCode = prime * hashCode + ((getSubscriberDescription() == null) ? 0 : getSubscriberDescription().hashCode());
        hashCode = prime * hashCode + ((getSubscriberName() == null) ? 0 : getSubscriberName().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubscriberRequest clone() {
        return (CreateSubscriberRequest) super.clone();
    }

}
