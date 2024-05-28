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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/PreviewPrivacyImpact" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PreviewPrivacyImpactResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An estimate of the number of aggregation functions that the member who can query can run given the epsilon and
     * noise parameters. This does not change the privacy budget.
     * </p>
     */
    private PrivacyImpact privacyImpact;

    /**
     * <p>
     * An estimate of the number of aggregation functions that the member who can query can run given the epsilon and
     * noise parameters. This does not change the privacy budget.
     * </p>
     * 
     * @param privacyImpact
     *        An estimate of the number of aggregation functions that the member who can query can run given the epsilon
     *        and noise parameters. This does not change the privacy budget.
     */

    public void setPrivacyImpact(PrivacyImpact privacyImpact) {
        this.privacyImpact = privacyImpact;
    }

    /**
     * <p>
     * An estimate of the number of aggregation functions that the member who can query can run given the epsilon and
     * noise parameters. This does not change the privacy budget.
     * </p>
     * 
     * @return An estimate of the number of aggregation functions that the member who can query can run given the
     *         epsilon and noise parameters. This does not change the privacy budget.
     */

    public PrivacyImpact getPrivacyImpact() {
        return this.privacyImpact;
    }

    /**
     * <p>
     * An estimate of the number of aggregation functions that the member who can query can run given the epsilon and
     * noise parameters. This does not change the privacy budget.
     * </p>
     * 
     * @param privacyImpact
     *        An estimate of the number of aggregation functions that the member who can query can run given the epsilon
     *        and noise parameters. This does not change the privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreviewPrivacyImpactResult withPrivacyImpact(PrivacyImpact privacyImpact) {
        setPrivacyImpact(privacyImpact);
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
        if (getPrivacyImpact() != null)
            sb.append("PrivacyImpact: ").append(getPrivacyImpact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PreviewPrivacyImpactResult == false)
            return false;
        PreviewPrivacyImpactResult other = (PreviewPrivacyImpactResult) obj;
        if (other.getPrivacyImpact() == null ^ this.getPrivacyImpact() == null)
            return false;
        if (other.getPrivacyImpact() != null && other.getPrivacyImpact().equals(this.getPrivacyImpact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrivacyImpact() == null) ? 0 : getPrivacyImpact().hashCode());
        return hashCode;
    }

    @Override
    public PreviewPrivacyImpactResult clone() {
        try {
            return (PreviewPrivacyImpactResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
