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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to submit new account VDM attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountVdmAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccountVdmAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The VDM attributes that you wish to apply to your Amazon SES account.
     * </p>
     */
    private VdmAttributes vdmAttributes;

    /**
     * <p>
     * The VDM attributes that you wish to apply to your Amazon SES account.
     * </p>
     * 
     * @param vdmAttributes
     *        The VDM attributes that you wish to apply to your Amazon SES account.
     */

    public void setVdmAttributes(VdmAttributes vdmAttributes) {
        this.vdmAttributes = vdmAttributes;
    }

    /**
     * <p>
     * The VDM attributes that you wish to apply to your Amazon SES account.
     * </p>
     * 
     * @return The VDM attributes that you wish to apply to your Amazon SES account.
     */

    public VdmAttributes getVdmAttributes() {
        return this.vdmAttributes;
    }

    /**
     * <p>
     * The VDM attributes that you wish to apply to your Amazon SES account.
     * </p>
     * 
     * @param vdmAttributes
     *        The VDM attributes that you wish to apply to your Amazon SES account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountVdmAttributesRequest withVdmAttributes(VdmAttributes vdmAttributes) {
        setVdmAttributes(vdmAttributes);
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
        if (getVdmAttributes() != null)
            sb.append("VdmAttributes: ").append(getVdmAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccountVdmAttributesRequest == false)
            return false;
        PutAccountVdmAttributesRequest other = (PutAccountVdmAttributesRequest) obj;
        if (other.getVdmAttributes() == null ^ this.getVdmAttributes() == null)
            return false;
        if (other.getVdmAttributes() != null && other.getVdmAttributes().equals(this.getVdmAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVdmAttributes() == null) ? 0 : getVdmAttributes().hashCode());
        return hashCode;
    }

    @Override
    public PutAccountVdmAttributesRequest clone() {
        return (PutAccountVdmAttributesRequest) super.clone();
    }

}
