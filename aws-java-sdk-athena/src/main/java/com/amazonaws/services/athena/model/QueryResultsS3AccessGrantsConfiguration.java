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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies whether Amazon S3 access grants are enabled for query results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/QueryResultsS3AccessGrantsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryResultsS3AccessGrantsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether Amazon S3 access grants are enabled for query results.
     * </p>
     */
    private Boolean enableS3AccessGrants;
    /**
     * <p>
     * When enabled, appends the user ID as an Amazon S3 path prefix to the query result output location.
     * </p>
     */
    private Boolean createUserLevelPrefix;
    /**
     * <p>
     * The authentication type used for Amazon S3 access grants. Currently, only <code>DIRECTORY_IDENTITY</code> is
     * supported.
     * </p>
     */
    private String authenticationType;

    /**
     * <p>
     * Specifies whether Amazon S3 access grants are enabled for query results.
     * </p>
     * 
     * @param enableS3AccessGrants
     *        Specifies whether Amazon S3 access grants are enabled for query results.
     */

    public void setEnableS3AccessGrants(Boolean enableS3AccessGrants) {
        this.enableS3AccessGrants = enableS3AccessGrants;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 access grants are enabled for query results.
     * </p>
     * 
     * @return Specifies whether Amazon S3 access grants are enabled for query results.
     */

    public Boolean getEnableS3AccessGrants() {
        return this.enableS3AccessGrants;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 access grants are enabled for query results.
     * </p>
     * 
     * @param enableS3AccessGrants
     *        Specifies whether Amazon S3 access grants are enabled for query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResultsS3AccessGrantsConfiguration withEnableS3AccessGrants(Boolean enableS3AccessGrants) {
        setEnableS3AccessGrants(enableS3AccessGrants);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 access grants are enabled for query results.
     * </p>
     * 
     * @return Specifies whether Amazon S3 access grants are enabled for query results.
     */

    public Boolean isEnableS3AccessGrants() {
        return this.enableS3AccessGrants;
    }

    /**
     * <p>
     * When enabled, appends the user ID as an Amazon S3 path prefix to the query result output location.
     * </p>
     * 
     * @param createUserLevelPrefix
     *        When enabled, appends the user ID as an Amazon S3 path prefix to the query result output location.
     */

    public void setCreateUserLevelPrefix(Boolean createUserLevelPrefix) {
        this.createUserLevelPrefix = createUserLevelPrefix;
    }

    /**
     * <p>
     * When enabled, appends the user ID as an Amazon S3 path prefix to the query result output location.
     * </p>
     * 
     * @return When enabled, appends the user ID as an Amazon S3 path prefix to the query result output location.
     */

    public Boolean getCreateUserLevelPrefix() {
        return this.createUserLevelPrefix;
    }

    /**
     * <p>
     * When enabled, appends the user ID as an Amazon S3 path prefix to the query result output location.
     * </p>
     * 
     * @param createUserLevelPrefix
     *        When enabled, appends the user ID as an Amazon S3 path prefix to the query result output location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryResultsS3AccessGrantsConfiguration withCreateUserLevelPrefix(Boolean createUserLevelPrefix) {
        setCreateUserLevelPrefix(createUserLevelPrefix);
        return this;
    }

    /**
     * <p>
     * When enabled, appends the user ID as an Amazon S3 path prefix to the query result output location.
     * </p>
     * 
     * @return When enabled, appends the user ID as an Amazon S3 path prefix to the query result output location.
     */

    public Boolean isCreateUserLevelPrefix() {
        return this.createUserLevelPrefix;
    }

    /**
     * <p>
     * The authentication type used for Amazon S3 access grants. Currently, only <code>DIRECTORY_IDENTITY</code> is
     * supported.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type used for Amazon S3 access grants. Currently, only <code>DIRECTORY_IDENTITY</code>
     *        is supported.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication type used for Amazon S3 access grants. Currently, only <code>DIRECTORY_IDENTITY</code> is
     * supported.
     * </p>
     * 
     * @return The authentication type used for Amazon S3 access grants. Currently, only <code>DIRECTORY_IDENTITY</code>
     *         is supported.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication type used for Amazon S3 access grants. Currently, only <code>DIRECTORY_IDENTITY</code> is
     * supported.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type used for Amazon S3 access grants. Currently, only <code>DIRECTORY_IDENTITY</code>
     *        is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public QueryResultsS3AccessGrantsConfiguration withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication type used for Amazon S3 access grants. Currently, only <code>DIRECTORY_IDENTITY</code> is
     * supported.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type used for Amazon S3 access grants. Currently, only <code>DIRECTORY_IDENTITY</code>
     *        is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public QueryResultsS3AccessGrantsConfiguration withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
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
        if (getEnableS3AccessGrants() != null)
            sb.append("EnableS3AccessGrants: ").append(getEnableS3AccessGrants()).append(",");
        if (getCreateUserLevelPrefix() != null)
            sb.append("CreateUserLevelPrefix: ").append(getCreateUserLevelPrefix()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryResultsS3AccessGrantsConfiguration == false)
            return false;
        QueryResultsS3AccessGrantsConfiguration other = (QueryResultsS3AccessGrantsConfiguration) obj;
        if (other.getEnableS3AccessGrants() == null ^ this.getEnableS3AccessGrants() == null)
            return false;
        if (other.getEnableS3AccessGrants() != null && other.getEnableS3AccessGrants().equals(this.getEnableS3AccessGrants()) == false)
            return false;
        if (other.getCreateUserLevelPrefix() == null ^ this.getCreateUserLevelPrefix() == null)
            return false;
        if (other.getCreateUserLevelPrefix() != null && other.getCreateUserLevelPrefix().equals(this.getCreateUserLevelPrefix()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableS3AccessGrants() == null) ? 0 : getEnableS3AccessGrants().hashCode());
        hashCode = prime * hashCode + ((getCreateUserLevelPrefix() == null) ? 0 : getCreateUserLevelPrefix().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        return hashCode;
    }

    @Override
    public QueryResultsS3AccessGrantsConfiguration clone() {
        try {
            return (QueryResultsS3AccessGrantsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.QueryResultsS3AccessGrantsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
