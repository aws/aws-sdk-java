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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A policy configures behavior that you allow or disallow for your account. For information about MediaConvert
 * policies, see the user guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Policy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Policy implements Serializable, Cloneable, StructuredPojo {

    /** Allow or disallow jobs that specify HTTP inputs. */
    private String httpInputs;
    /** Allow or disallow jobs that specify HTTPS inputs. */
    private String httpsInputs;
    /** Allow or disallow jobs that specify Amazon S3 inputs. */
    private String s3Inputs;

    /**
     * Allow or disallow jobs that specify HTTP inputs.
     * 
     * @param httpInputs
     *        Allow or disallow jobs that specify HTTP inputs.
     * @see InputPolicy
     */

    public void setHttpInputs(String httpInputs) {
        this.httpInputs = httpInputs;
    }

    /**
     * Allow or disallow jobs that specify HTTP inputs.
     * 
     * @return Allow or disallow jobs that specify HTTP inputs.
     * @see InputPolicy
     */

    public String getHttpInputs() {
        return this.httpInputs;
    }

    /**
     * Allow or disallow jobs that specify HTTP inputs.
     * 
     * @param httpInputs
     *        Allow or disallow jobs that specify HTTP inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPolicy
     */

    public Policy withHttpInputs(String httpInputs) {
        setHttpInputs(httpInputs);
        return this;
    }

    /**
     * Allow or disallow jobs that specify HTTP inputs.
     * 
     * @param httpInputs
     *        Allow or disallow jobs that specify HTTP inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPolicy
     */

    public Policy withHttpInputs(InputPolicy httpInputs) {
        this.httpInputs = httpInputs.toString();
        return this;
    }

    /**
     * Allow or disallow jobs that specify HTTPS inputs.
     * 
     * @param httpsInputs
     *        Allow or disallow jobs that specify HTTPS inputs.
     * @see InputPolicy
     */

    public void setHttpsInputs(String httpsInputs) {
        this.httpsInputs = httpsInputs;
    }

    /**
     * Allow or disallow jobs that specify HTTPS inputs.
     * 
     * @return Allow or disallow jobs that specify HTTPS inputs.
     * @see InputPolicy
     */

    public String getHttpsInputs() {
        return this.httpsInputs;
    }

    /**
     * Allow or disallow jobs that specify HTTPS inputs.
     * 
     * @param httpsInputs
     *        Allow or disallow jobs that specify HTTPS inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPolicy
     */

    public Policy withHttpsInputs(String httpsInputs) {
        setHttpsInputs(httpsInputs);
        return this;
    }

    /**
     * Allow or disallow jobs that specify HTTPS inputs.
     * 
     * @param httpsInputs
     *        Allow or disallow jobs that specify HTTPS inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPolicy
     */

    public Policy withHttpsInputs(InputPolicy httpsInputs) {
        this.httpsInputs = httpsInputs.toString();
        return this;
    }

    /**
     * Allow or disallow jobs that specify Amazon S3 inputs.
     * 
     * @param s3Inputs
     *        Allow or disallow jobs that specify Amazon S3 inputs.
     * @see InputPolicy
     */

    public void setS3Inputs(String s3Inputs) {
        this.s3Inputs = s3Inputs;
    }

    /**
     * Allow or disallow jobs that specify Amazon S3 inputs.
     * 
     * @return Allow or disallow jobs that specify Amazon S3 inputs.
     * @see InputPolicy
     */

    public String getS3Inputs() {
        return this.s3Inputs;
    }

    /**
     * Allow or disallow jobs that specify Amazon S3 inputs.
     * 
     * @param s3Inputs
     *        Allow or disallow jobs that specify Amazon S3 inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPolicy
     */

    public Policy withS3Inputs(String s3Inputs) {
        setS3Inputs(s3Inputs);
        return this;
    }

    /**
     * Allow or disallow jobs that specify Amazon S3 inputs.
     * 
     * @param s3Inputs
     *        Allow or disallow jobs that specify Amazon S3 inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPolicy
     */

    public Policy withS3Inputs(InputPolicy s3Inputs) {
        this.s3Inputs = s3Inputs.toString();
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
        if (getHttpInputs() != null)
            sb.append("HttpInputs: ").append(getHttpInputs()).append(",");
        if (getHttpsInputs() != null)
            sb.append("HttpsInputs: ").append(getHttpsInputs()).append(",");
        if (getS3Inputs() != null)
            sb.append("S3Inputs: ").append(getS3Inputs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Policy == false)
            return false;
        Policy other = (Policy) obj;
        if (other.getHttpInputs() == null ^ this.getHttpInputs() == null)
            return false;
        if (other.getHttpInputs() != null && other.getHttpInputs().equals(this.getHttpInputs()) == false)
            return false;
        if (other.getHttpsInputs() == null ^ this.getHttpsInputs() == null)
            return false;
        if (other.getHttpsInputs() != null && other.getHttpsInputs().equals(this.getHttpsInputs()) == false)
            return false;
        if (other.getS3Inputs() == null ^ this.getS3Inputs() == null)
            return false;
        if (other.getS3Inputs() != null && other.getS3Inputs().equals(this.getS3Inputs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpInputs() == null) ? 0 : getHttpInputs().hashCode());
        hashCode = prime * hashCode + ((getHttpsInputs() == null) ? 0 : getHttpsInputs().hashCode());
        hashCode = prime * hashCode + ((getS3Inputs() == null) ? 0 : getS3Inputs().hashCode());
        return hashCode;
    }

    @Override
    public Policy clone() {
        try {
            return (Policy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.PolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
