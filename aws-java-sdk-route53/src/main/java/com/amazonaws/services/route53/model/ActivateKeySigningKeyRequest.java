/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ActivateKeySigningKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivateKeySigningKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string used to identify a hosted zone.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * A string used to identify a key-signing key (KSK). <code>Name</code> can include numbers, letters, and
     * underscores (_). <code>Name</code> must be unique for each key-signing key in the same hosted zone.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A unique string used to identify a hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        A unique string used to identify a hosted zone.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * A unique string used to identify a hosted zone.
     * </p>
     * 
     * @return A unique string used to identify a hosted zone.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * A unique string used to identify a hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        A unique string used to identify a hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateKeySigningKeyRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * A string used to identify a key-signing key (KSK). <code>Name</code> can include numbers, letters, and
     * underscores (_). <code>Name</code> must be unique for each key-signing key in the same hosted zone.
     * </p>
     * 
     * @param name
     *        A string used to identify a key-signing key (KSK). <code>Name</code> can include numbers, letters, and
     *        underscores (_). <code>Name</code> must be unique for each key-signing key in the same hosted zone.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A string used to identify a key-signing key (KSK). <code>Name</code> can include numbers, letters, and
     * underscores (_). <code>Name</code> must be unique for each key-signing key in the same hosted zone.
     * </p>
     * 
     * @return A string used to identify a key-signing key (KSK). <code>Name</code> can include numbers, letters, and
     *         underscores (_). <code>Name</code> must be unique for each key-signing key in the same hosted zone.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A string used to identify a key-signing key (KSK). <code>Name</code> can include numbers, letters, and
     * underscores (_). <code>Name</code> must be unique for each key-signing key in the same hosted zone.
     * </p>
     * 
     * @param name
     *        A string used to identify a key-signing key (KSK). <code>Name</code> can include numbers, letters, and
     *        underscores (_). <code>Name</code> must be unique for each key-signing key in the same hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateKeySigningKeyRequest withName(String name) {
        setName(name);
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivateKeySigningKeyRequest == false)
            return false;
        ActivateKeySigningKeyRequest other = (ActivateKeySigningKeyRequest) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ActivateKeySigningKeyRequest clone() {
        return (ActivateKeySigningKeyRequest) super.clone();
    }

}
