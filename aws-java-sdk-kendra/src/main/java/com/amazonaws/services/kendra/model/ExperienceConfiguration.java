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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information for your Amazon Kendra experience. This includes the data source IDs and/or
 * FAQ IDs, and user or group information to grant access to your Amazon Kendra experience.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ExperienceConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperienceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifiers of your data sources and FAQs. Or, you can specify that you want to use documents indexed via the
     * <code>BatchPutDocument</code> API. This is the content you want to use for your Amazon Kendra experience.
     * </p>
     */
    private ContentSourceConfiguration contentSourceConfiguration;
    /**
     * <p>
     * The IAM Identity Center field name that contains the identifiers of your users, such as their emails.
     * </p>
     */
    private UserIdentityConfiguration userIdentityConfiguration;

    /**
     * <p>
     * The identifiers of your data sources and FAQs. Or, you can specify that you want to use documents indexed via the
     * <code>BatchPutDocument</code> API. This is the content you want to use for your Amazon Kendra experience.
     * </p>
     * 
     * @param contentSourceConfiguration
     *        The identifiers of your data sources and FAQs. Or, you can specify that you want to use documents indexed
     *        via the <code>BatchPutDocument</code> API. This is the content you want to use for your Amazon Kendra
     *        experience.
     */

    public void setContentSourceConfiguration(ContentSourceConfiguration contentSourceConfiguration) {
        this.contentSourceConfiguration = contentSourceConfiguration;
    }

    /**
     * <p>
     * The identifiers of your data sources and FAQs. Or, you can specify that you want to use documents indexed via the
     * <code>BatchPutDocument</code> API. This is the content you want to use for your Amazon Kendra experience.
     * </p>
     * 
     * @return The identifiers of your data sources and FAQs. Or, you can specify that you want to use documents indexed
     *         via the <code>BatchPutDocument</code> API. This is the content you want to use for your Amazon Kendra
     *         experience.
     */

    public ContentSourceConfiguration getContentSourceConfiguration() {
        return this.contentSourceConfiguration;
    }

    /**
     * <p>
     * The identifiers of your data sources and FAQs. Or, you can specify that you want to use documents indexed via the
     * <code>BatchPutDocument</code> API. This is the content you want to use for your Amazon Kendra experience.
     * </p>
     * 
     * @param contentSourceConfiguration
     *        The identifiers of your data sources and FAQs. Or, you can specify that you want to use documents indexed
     *        via the <code>BatchPutDocument</code> API. This is the content you want to use for your Amazon Kendra
     *        experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperienceConfiguration withContentSourceConfiguration(ContentSourceConfiguration contentSourceConfiguration) {
        setContentSourceConfiguration(contentSourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The IAM Identity Center field name that contains the identifiers of your users, such as their emails.
     * </p>
     * 
     * @param userIdentityConfiguration
     *        The IAM Identity Center field name that contains the identifiers of your users, such as their emails.
     */

    public void setUserIdentityConfiguration(UserIdentityConfiguration userIdentityConfiguration) {
        this.userIdentityConfiguration = userIdentityConfiguration;
    }

    /**
     * <p>
     * The IAM Identity Center field name that contains the identifiers of your users, such as their emails.
     * </p>
     * 
     * @return The IAM Identity Center field name that contains the identifiers of your users, such as their emails.
     */

    public UserIdentityConfiguration getUserIdentityConfiguration() {
        return this.userIdentityConfiguration;
    }

    /**
     * <p>
     * The IAM Identity Center field name that contains the identifiers of your users, such as their emails.
     * </p>
     * 
     * @param userIdentityConfiguration
     *        The IAM Identity Center field name that contains the identifiers of your users, such as their emails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperienceConfiguration withUserIdentityConfiguration(UserIdentityConfiguration userIdentityConfiguration) {
        setUserIdentityConfiguration(userIdentityConfiguration);
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
        if (getContentSourceConfiguration() != null)
            sb.append("ContentSourceConfiguration: ").append(getContentSourceConfiguration()).append(",");
        if (getUserIdentityConfiguration() != null)
            sb.append("UserIdentityConfiguration: ").append(getUserIdentityConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperienceConfiguration == false)
            return false;
        ExperienceConfiguration other = (ExperienceConfiguration) obj;
        if (other.getContentSourceConfiguration() == null ^ this.getContentSourceConfiguration() == null)
            return false;
        if (other.getContentSourceConfiguration() != null && other.getContentSourceConfiguration().equals(this.getContentSourceConfiguration()) == false)
            return false;
        if (other.getUserIdentityConfiguration() == null ^ this.getUserIdentityConfiguration() == null)
            return false;
        if (other.getUserIdentityConfiguration() != null && other.getUserIdentityConfiguration().equals(this.getUserIdentityConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentSourceConfiguration() == null) ? 0 : getContentSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUserIdentityConfiguration() == null) ? 0 : getUserIdentityConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ExperienceConfiguration clone() {
        try {
            return (ExperienceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ExperienceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
