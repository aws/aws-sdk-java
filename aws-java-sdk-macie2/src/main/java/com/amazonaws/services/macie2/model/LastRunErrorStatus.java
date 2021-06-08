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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies whether any account- or bucket-level access errors occurred when a classification job ran. For information
 * about using logging data to investigate these errors, see <a
 * href="https://docs.aws.amazon.com/macie/latest/user/discovery-jobs-monitor-cw-logs.html">Monitoring sensitive data
 * discovery jobs</a> in the <i>Amazon Macie User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/LastRunErrorStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LastRunErrorStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this
     * value indicates the error status of the job's most recent run. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ERROR - One or more errors occurred. Amazon Macie didn't process all the data specified for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE - No errors occurred. Macie processed all the data specified for the job.
     * </p>
     * </li>
     * </ul>
     */
    private String code;

    /**
     * <p>
     * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this
     * value indicates the error status of the job's most recent run. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ERROR - One or more errors occurred. Amazon Macie didn't process all the data specified for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE - No errors occurred. Macie processed all the data specified for the job.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring
     *        job, this value indicates the error status of the job's most recent run. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ERROR - One or more errors occurred. Amazon Macie didn't process all the data specified for the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NONE - No errors occurred. Macie processed all the data specified for the job.
     *        </p>
     *        </li>
     * @see LastRunErrorStatusCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this
     * value indicates the error status of the job's most recent run. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ERROR - One or more errors occurred. Amazon Macie didn't process all the data specified for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE - No errors occurred. Macie processed all the data specified for the job.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring
     *         job, this value indicates the error status of the job's most recent run. Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ERROR - One or more errors occurred. Amazon Macie didn't process all the data specified for the job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NONE - No errors occurred. Macie processed all the data specified for the job.
     *         </p>
     *         </li>
     * @see LastRunErrorStatusCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this
     * value indicates the error status of the job's most recent run. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ERROR - One or more errors occurred. Amazon Macie didn't process all the data specified for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE - No errors occurred. Macie processed all the data specified for the job.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring
     *        job, this value indicates the error status of the job's most recent run. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ERROR - One or more errors occurred. Amazon Macie didn't process all the data specified for the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NONE - No errors occurred. Macie processed all the data specified for the job.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastRunErrorStatusCode
     */

    public LastRunErrorStatus withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this
     * value indicates the error status of the job's most recent run. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ERROR - One or more errors occurred. Amazon Macie didn't process all the data specified for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE - No errors occurred. Macie processed all the data specified for the job.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring
     *        job, this value indicates the error status of the job's most recent run. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ERROR - One or more errors occurred. Amazon Macie didn't process all the data specified for the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NONE - No errors occurred. Macie processed all the data specified for the job.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastRunErrorStatusCode
     */

    public LastRunErrorStatus withCode(LastRunErrorStatusCode code) {
        this.code = code.toString();
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastRunErrorStatus == false)
            return false;
        LastRunErrorStatus other = (LastRunErrorStatus) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        return hashCode;
    }

    @Override
    public LastRunErrorStatus clone() {
        try {
            return (LastRunErrorStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.LastRunErrorStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
