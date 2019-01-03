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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the <code>MergeDeveloperIdentities</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/MergeDeveloperIdentities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MergeDeveloperIdentitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * User identifier for the source user. The value should be a <code>DeveloperUserIdentifier</code>.
     * </p>
     */
    private String sourceUserIdentifier;
    /**
     * <p>
     * User identifier for the destination user. The value should be a <code>DeveloperUserIdentifier</code>.
     * </p>
     */
    private String destinationUserIdentifier;
    /**
     * <p>
     * The "domain" by which Cognito will refer to your users. This is a (pseudo) domain name that you provide while
     * creating an identity pool. This name acts as a placeholder that allows your backend and the Cognito service to
     * communicate about the developer provider. For the <code>DeveloperProviderName</code>, you can use letters as well
     * as period (.), underscore (_), and dash (-).
     * </p>
     */
    private String developerProviderName;
    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     */
    private String identityPoolId;

    /**
     * <p>
     * User identifier for the source user. The value should be a <code>DeveloperUserIdentifier</code>.
     * </p>
     * 
     * @param sourceUserIdentifier
     *        User identifier for the source user. The value should be a <code>DeveloperUserIdentifier</code>.
     */

    public void setSourceUserIdentifier(String sourceUserIdentifier) {
        this.sourceUserIdentifier = sourceUserIdentifier;
    }

    /**
     * <p>
     * User identifier for the source user. The value should be a <code>DeveloperUserIdentifier</code>.
     * </p>
     * 
     * @return User identifier for the source user. The value should be a <code>DeveloperUserIdentifier</code>.
     */

    public String getSourceUserIdentifier() {
        return this.sourceUserIdentifier;
    }

    /**
     * <p>
     * User identifier for the source user. The value should be a <code>DeveloperUserIdentifier</code>.
     * </p>
     * 
     * @param sourceUserIdentifier
     *        User identifier for the source user. The value should be a <code>DeveloperUserIdentifier</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeDeveloperIdentitiesRequest withSourceUserIdentifier(String sourceUserIdentifier) {
        setSourceUserIdentifier(sourceUserIdentifier);
        return this;
    }

    /**
     * <p>
     * User identifier for the destination user. The value should be a <code>DeveloperUserIdentifier</code>.
     * </p>
     * 
     * @param destinationUserIdentifier
     *        User identifier for the destination user. The value should be a <code>DeveloperUserIdentifier</code>.
     */

    public void setDestinationUserIdentifier(String destinationUserIdentifier) {
        this.destinationUserIdentifier = destinationUserIdentifier;
    }

    /**
     * <p>
     * User identifier for the destination user. The value should be a <code>DeveloperUserIdentifier</code>.
     * </p>
     * 
     * @return User identifier for the destination user. The value should be a <code>DeveloperUserIdentifier</code>.
     */

    public String getDestinationUserIdentifier() {
        return this.destinationUserIdentifier;
    }

    /**
     * <p>
     * User identifier for the destination user. The value should be a <code>DeveloperUserIdentifier</code>.
     * </p>
     * 
     * @param destinationUserIdentifier
     *        User identifier for the destination user. The value should be a <code>DeveloperUserIdentifier</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeDeveloperIdentitiesRequest withDestinationUserIdentifier(String destinationUserIdentifier) {
        setDestinationUserIdentifier(destinationUserIdentifier);
        return this;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users. This is a (pseudo) domain name that you provide while
     * creating an identity pool. This name acts as a placeholder that allows your backend and the Cognito service to
     * communicate about the developer provider. For the <code>DeveloperProviderName</code>, you can use letters as well
     * as period (.), underscore (_), and dash (-).
     * </p>
     * 
     * @param developerProviderName
     *        The "domain" by which Cognito will refer to your users. This is a (pseudo) domain name that you provide
     *        while creating an identity pool. This name acts as a placeholder that allows your backend and the Cognito
     *        service to communicate about the developer provider. For the <code>DeveloperProviderName</code>, you can
     *        use letters as well as period (.), underscore (_), and dash (-).
     */

    public void setDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users. This is a (pseudo) domain name that you provide while
     * creating an identity pool. This name acts as a placeholder that allows your backend and the Cognito service to
     * communicate about the developer provider. For the <code>DeveloperProviderName</code>, you can use letters as well
     * as period (.), underscore (_), and dash (-).
     * </p>
     * 
     * @return The "domain" by which Cognito will refer to your users. This is a (pseudo) domain name that you provide
     *         while creating an identity pool. This name acts as a placeholder that allows your backend and the Cognito
     *         service to communicate about the developer provider. For the <code>DeveloperProviderName</code>, you can
     *         use letters as well as period (.), underscore (_), and dash (-).
     */

    public String getDeveloperProviderName() {
        return this.developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users. This is a (pseudo) domain name that you provide while
     * creating an identity pool. This name acts as a placeholder that allows your backend and the Cognito service to
     * communicate about the developer provider. For the <code>DeveloperProviderName</code>, you can use letters as well
     * as period (.), underscore (_), and dash (-).
     * </p>
     * 
     * @param developerProviderName
     *        The "domain" by which Cognito will refer to your users. This is a (pseudo) domain name that you provide
     *        while creating an identity pool. This name acts as a placeholder that allows your backend and the Cognito
     *        service to communicate about the developer provider. For the <code>DeveloperProviderName</code>, you can
     *        use letters as well as period (.), underscore (_), and dash (-).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeDeveloperIdentitiesRequest withDeveloperProviderName(String developerProviderName) {
        setDeveloperProviderName(developerProviderName);
        return this;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @return An identity pool ID in the format REGION:GUID.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeDeveloperIdentitiesRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
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
        if (getSourceUserIdentifier() != null)
            sb.append("SourceUserIdentifier: ").append(getSourceUserIdentifier()).append(",");
        if (getDestinationUserIdentifier() != null)
            sb.append("DestinationUserIdentifier: ").append(getDestinationUserIdentifier()).append(",");
        if (getDeveloperProviderName() != null)
            sb.append("DeveloperProviderName: ").append(getDeveloperProviderName()).append(",");
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeDeveloperIdentitiesRequest == false)
            return false;
        MergeDeveloperIdentitiesRequest other = (MergeDeveloperIdentitiesRequest) obj;
        if (other.getSourceUserIdentifier() == null ^ this.getSourceUserIdentifier() == null)
            return false;
        if (other.getSourceUserIdentifier() != null && other.getSourceUserIdentifier().equals(this.getSourceUserIdentifier()) == false)
            return false;
        if (other.getDestinationUserIdentifier() == null ^ this.getDestinationUserIdentifier() == null)
            return false;
        if (other.getDestinationUserIdentifier() != null && other.getDestinationUserIdentifier().equals(this.getDestinationUserIdentifier()) == false)
            return false;
        if (other.getDeveloperProviderName() == null ^ this.getDeveloperProviderName() == null)
            return false;
        if (other.getDeveloperProviderName() != null && other.getDeveloperProviderName().equals(this.getDeveloperProviderName()) == false)
            return false;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceUserIdentifier() == null) ? 0 : getSourceUserIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDestinationUserIdentifier() == null) ? 0 : getDestinationUserIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeveloperProviderName() == null) ? 0 : getDeveloperProviderName().hashCode());
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        return hashCode;
    }

    @Override
    public MergeDeveloperIdentitiesRequest clone() {
        return (MergeDeveloperIdentitiesRequest) super.clone();
    }

}
