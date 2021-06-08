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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List of signing profiles that can sign a code package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AllowedPublishers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllowedPublishers implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can
     * sign a code package.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> signingProfileVersionArns;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can
     * sign a code package.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user
     *         who can sign a code package.
     */

    public java.util.List<String> getSigningProfileVersionArns() {
        if (signingProfileVersionArns == null) {
            signingProfileVersionArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return signingProfileVersionArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can
     * sign a code package.
     * </p>
     * 
     * @param signingProfileVersionArns
     *        The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user
     *        who can sign a code package.
     */

    public void setSigningProfileVersionArns(java.util.Collection<String> signingProfileVersionArns) {
        if (signingProfileVersionArns == null) {
            this.signingProfileVersionArns = null;
            return;
        }

        this.signingProfileVersionArns = new com.amazonaws.internal.SdkInternalList<String>(signingProfileVersionArns);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can
     * sign a code package.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSigningProfileVersionArns(java.util.Collection)} or
     * {@link #withSigningProfileVersionArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param signingProfileVersionArns
     *        The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user
     *        who can sign a code package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowedPublishers withSigningProfileVersionArns(String... signingProfileVersionArns) {
        if (this.signingProfileVersionArns == null) {
            setSigningProfileVersionArns(new com.amazonaws.internal.SdkInternalList<String>(signingProfileVersionArns.length));
        }
        for (String ele : signingProfileVersionArns) {
            this.signingProfileVersionArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can
     * sign a code package.
     * </p>
     * 
     * @param signingProfileVersionArns
     *        The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user
     *        who can sign a code package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowedPublishers withSigningProfileVersionArns(java.util.Collection<String> signingProfileVersionArns) {
        setSigningProfileVersionArns(signingProfileVersionArns);
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
        if (getSigningProfileVersionArns() != null)
            sb.append("SigningProfileVersionArns: ").append(getSigningProfileVersionArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllowedPublishers == false)
            return false;
        AllowedPublishers other = (AllowedPublishers) obj;
        if (other.getSigningProfileVersionArns() == null ^ this.getSigningProfileVersionArns() == null)
            return false;
        if (other.getSigningProfileVersionArns() != null && other.getSigningProfileVersionArns().equals(this.getSigningProfileVersionArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSigningProfileVersionArns() == null) ? 0 : getSigningProfileVersionArns().hashCode());
        return hashCode;
    }

    @Override
    public AllowedPublishers clone() {
        try {
            return (AllowedPublishers) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.AllowedPublishersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
