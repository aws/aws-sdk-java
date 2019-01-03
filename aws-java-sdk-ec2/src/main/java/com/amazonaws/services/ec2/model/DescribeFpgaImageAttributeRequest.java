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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeFpgaImageAttributeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFpgaImageAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeFpgaImageAttributeRequest> {

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     */
    private String fpgaImageId;
    /**
     * <p>
     * The AFI attribute.
     * </p>
     */
    private String attribute;

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     * 
     * @param fpgaImageId
     *        The ID of the AFI.
     */

    public void setFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
    }

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     * 
     * @return The ID of the AFI.
     */

    public String getFpgaImageId() {
        return this.fpgaImageId;
    }

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     * 
     * @param fpgaImageId
     *        The ID of the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImageAttributeRequest withFpgaImageId(String fpgaImageId) {
        setFpgaImageId(fpgaImageId);
        return this;
    }

    /**
     * <p>
     * The AFI attribute.
     * </p>
     * 
     * @param attribute
     *        The AFI attribute.
     * @see FpgaImageAttributeName
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The AFI attribute.
     * </p>
     * 
     * @return The AFI attribute.
     * @see FpgaImageAttributeName
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The AFI attribute.
     * </p>
     * 
     * @param attribute
     *        The AFI attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FpgaImageAttributeName
     */

    public DescribeFpgaImageAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The AFI attribute.
     * </p>
     * 
     * @param attribute
     *        The AFI attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FpgaImageAttributeName
     */

    public DescribeFpgaImageAttributeRequest withAttribute(FpgaImageAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeFpgaImageAttributeRequest> getDryRunRequest() {
        Request<DescribeFpgaImageAttributeRequest> request = new DescribeFpgaImageAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getFpgaImageId() != null)
            sb.append("FpgaImageId: ").append(getFpgaImageId()).append(",");
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFpgaImageAttributeRequest == false)
            return false;
        DescribeFpgaImageAttributeRequest other = (DescribeFpgaImageAttributeRequest) obj;
        if (other.getFpgaImageId() == null ^ this.getFpgaImageId() == null)
            return false;
        if (other.getFpgaImageId() != null && other.getFpgaImageId().equals(this.getFpgaImageId()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFpgaImageId() == null) ? 0 : getFpgaImageId().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFpgaImageAttributeRequest clone() {
        return (DescribeFpgaImageAttributeRequest) super.clone();
    }
}
