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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an application-specific calculation result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CalculationResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location of the <code>stdout</code> file for the calculation.
     * </p>
     */
    private String stdOutS3Uri;
    /**
     * <p>
     * The Amazon S3 location of the <code>stderr</code> error messages file for the calculation.
     * </p>
     */
    private String stdErrorS3Uri;
    /**
     * <p>
     * The Amazon S3 location of the folder for the calculation results.
     * </p>
     */
    private String resultS3Uri;
    /**
     * <p>
     * The data format of the calculation result.
     * </p>
     */
    private String resultType;

    /**
     * <p>
     * The Amazon S3 location of the <code>stdout</code> file for the calculation.
     * </p>
     * 
     * @param stdOutS3Uri
     *        The Amazon S3 location of the <code>stdout</code> file for the calculation.
     */

    public void setStdOutS3Uri(String stdOutS3Uri) {
        this.stdOutS3Uri = stdOutS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the <code>stdout</code> file for the calculation.
     * </p>
     * 
     * @return The Amazon S3 location of the <code>stdout</code> file for the calculation.
     */

    public String getStdOutS3Uri() {
        return this.stdOutS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the <code>stdout</code> file for the calculation.
     * </p>
     * 
     * @param stdOutS3Uri
     *        The Amazon S3 location of the <code>stdout</code> file for the calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculationResult withStdOutS3Uri(String stdOutS3Uri) {
        setStdOutS3Uri(stdOutS3Uri);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the <code>stderr</code> error messages file for the calculation.
     * </p>
     * 
     * @param stdErrorS3Uri
     *        The Amazon S3 location of the <code>stderr</code> error messages file for the calculation.
     */

    public void setStdErrorS3Uri(String stdErrorS3Uri) {
        this.stdErrorS3Uri = stdErrorS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the <code>stderr</code> error messages file for the calculation.
     * </p>
     * 
     * @return The Amazon S3 location of the <code>stderr</code> error messages file for the calculation.
     */

    public String getStdErrorS3Uri() {
        return this.stdErrorS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the <code>stderr</code> error messages file for the calculation.
     * </p>
     * 
     * @param stdErrorS3Uri
     *        The Amazon S3 location of the <code>stderr</code> error messages file for the calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculationResult withStdErrorS3Uri(String stdErrorS3Uri) {
        setStdErrorS3Uri(stdErrorS3Uri);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the folder for the calculation results.
     * </p>
     * 
     * @param resultS3Uri
     *        The Amazon S3 location of the folder for the calculation results.
     */

    public void setResultS3Uri(String resultS3Uri) {
        this.resultS3Uri = resultS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the folder for the calculation results.
     * </p>
     * 
     * @return The Amazon S3 location of the folder for the calculation results.
     */

    public String getResultS3Uri() {
        return this.resultS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the folder for the calculation results.
     * </p>
     * 
     * @param resultS3Uri
     *        The Amazon S3 location of the folder for the calculation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculationResult withResultS3Uri(String resultS3Uri) {
        setResultS3Uri(resultS3Uri);
        return this;
    }

    /**
     * <p>
     * The data format of the calculation result.
     * </p>
     * 
     * @param resultType
     *        The data format of the calculation result.
     */

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    /**
     * <p>
     * The data format of the calculation result.
     * </p>
     * 
     * @return The data format of the calculation result.
     */

    public String getResultType() {
        return this.resultType;
    }

    /**
     * <p>
     * The data format of the calculation result.
     * </p>
     * 
     * @param resultType
     *        The data format of the calculation result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculationResult withResultType(String resultType) {
        setResultType(resultType);
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
        if (getStdOutS3Uri() != null)
            sb.append("StdOutS3Uri: ").append(getStdOutS3Uri()).append(",");
        if (getStdErrorS3Uri() != null)
            sb.append("StdErrorS3Uri: ").append(getStdErrorS3Uri()).append(",");
        if (getResultS3Uri() != null)
            sb.append("ResultS3Uri: ").append(getResultS3Uri()).append(",");
        if (getResultType() != null)
            sb.append("ResultType: ").append(getResultType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculationResult == false)
            return false;
        CalculationResult other = (CalculationResult) obj;
        if (other.getStdOutS3Uri() == null ^ this.getStdOutS3Uri() == null)
            return false;
        if (other.getStdOutS3Uri() != null && other.getStdOutS3Uri().equals(this.getStdOutS3Uri()) == false)
            return false;
        if (other.getStdErrorS3Uri() == null ^ this.getStdErrorS3Uri() == null)
            return false;
        if (other.getStdErrorS3Uri() != null && other.getStdErrorS3Uri().equals(this.getStdErrorS3Uri()) == false)
            return false;
        if (other.getResultS3Uri() == null ^ this.getResultS3Uri() == null)
            return false;
        if (other.getResultS3Uri() != null && other.getResultS3Uri().equals(this.getResultS3Uri()) == false)
            return false;
        if (other.getResultType() == null ^ this.getResultType() == null)
            return false;
        if (other.getResultType() != null && other.getResultType().equals(this.getResultType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStdOutS3Uri() == null) ? 0 : getStdOutS3Uri().hashCode());
        hashCode = prime * hashCode + ((getStdErrorS3Uri() == null) ? 0 : getStdErrorS3Uri().hashCode());
        hashCode = prime * hashCode + ((getResultS3Uri() == null) ? 0 : getResultS3Uri().hashCode());
        hashCode = prime * hashCode + ((getResultType() == null) ? 0 : getResultType().hashCode());
        return hashCode;
    }

    @Override
    public CalculationResult clone() {
        try {
            return (CalculationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.CalculationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
