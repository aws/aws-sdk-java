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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetSparqlStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSparqlStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the maximum number of records to return. There is also a size limit of 10 MB on the response that can't
     * be modified and that takes precedence over the number of records specified in the <code>limit</code> parameter.
     * The response does include a threshold-breaching record if the 10 MB limit was reached.
     * </p>
     * <p>
     * The range for <code>limit</code> is 1 to 100,000, with a default of 10.
     * </p>
     */
    private Long limit;
    /**
     * <p>
     * Can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AT_SEQUENCE_NUMBER</code>   –   Indicates that reading should start from the event sequence number
     * specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_SEQUENCE_NUMBER</code>   –   Indicates that reading should start right after the event sequence
     * number specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code>   –   Indicates that reading should start at the last untrimmed record in the system,
     * which is the oldest unexpired (not yet deleted) record in the change-log stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST</code>   –   Indicates that reading should start at the most recent record in the system, which is
     * the latest unexpired (not yet deleted) record in the change-log stream.
     * </p>
     * </li>
     * </ul>
     */
    private String iteratorType;
    /**
     * <p>
     * The commit number of the starting record to read from the change-log stream. This parameter is required when
     * <code>iteratorType</code> is<code>AT_SEQUENCE_NUMBER</code> or <code>AFTER_SEQUENCE_NUMBER</code>, and ignored
     * when <code>iteratorType</code> is <code>TRIM_HORIZON</code> or <code>LATEST</code>.
     * </p>
     */
    private Long commitNum;
    /**
     * <p>
     * The operation sequence number within the specified commit to start reading from in the change-log stream data.
     * The default is <code>1</code>.
     * </p>
     */
    private Long opNum;
    /**
     * <p>
     * If set to TRUE, Neptune compresses the response using gzip encoding.
     * </p>
     */
    private String encoding;

    /**
     * <p>
     * Specifies the maximum number of records to return. There is also a size limit of 10 MB on the response that can't
     * be modified and that takes precedence over the number of records specified in the <code>limit</code> parameter.
     * The response does include a threshold-breaching record if the 10 MB limit was reached.
     * </p>
     * <p>
     * The range for <code>limit</code> is 1 to 100,000, with a default of 10.
     * </p>
     * 
     * @param limit
     *        Specifies the maximum number of records to return. There is also a size limit of 10 MB on the response
     *        that can't be modified and that takes precedence over the number of records specified in the
     *        <code>limit</code> parameter. The response does include a threshold-breaching record if the 10 MB limit
     *        was reached.</p>
     *        <p>
     *        The range for <code>limit</code> is 1 to 100,000, with a default of 10.
     */

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifies the maximum number of records to return. There is also a size limit of 10 MB on the response that can't
     * be modified and that takes precedence over the number of records specified in the <code>limit</code> parameter.
     * The response does include a threshold-breaching record if the 10 MB limit was reached.
     * </p>
     * <p>
     * The range for <code>limit</code> is 1 to 100,000, with a default of 10.
     * </p>
     * 
     * @return Specifies the maximum number of records to return. There is also a size limit of 10 MB on the response
     *         that can't be modified and that takes precedence over the number of records specified in the
     *         <code>limit</code> parameter. The response does include a threshold-breaching record if the 10 MB limit
     *         was reached.</p>
     *         <p>
     *         The range for <code>limit</code> is 1 to 100,000, with a default of 10.
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Specifies the maximum number of records to return. There is also a size limit of 10 MB on the response that can't
     * be modified and that takes precedence over the number of records specified in the <code>limit</code> parameter.
     * The response does include a threshold-breaching record if the 10 MB limit was reached.
     * </p>
     * <p>
     * The range for <code>limit</code> is 1 to 100,000, with a default of 10.
     * </p>
     * 
     * @param limit
     *        Specifies the maximum number of records to return. There is also a size limit of 10 MB on the response
     *        that can't be modified and that takes precedence over the number of records specified in the
     *        <code>limit</code> parameter. The response does include a threshold-breaching record if the 10 MB limit
     *        was reached.</p>
     *        <p>
     *        The range for <code>limit</code> is 1 to 100,000, with a default of 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSparqlStreamRequest withLimit(Long limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AT_SEQUENCE_NUMBER</code>   –   Indicates that reading should start from the event sequence number
     * specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_SEQUENCE_NUMBER</code>   –   Indicates that reading should start right after the event sequence
     * number specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code>   –   Indicates that reading should start at the last untrimmed record in the system,
     * which is the oldest unexpired (not yet deleted) record in the change-log stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST</code>   –   Indicates that reading should start at the most recent record in the system, which is
     * the latest unexpired (not yet deleted) record in the change-log stream.
     * </p>
     * </li>
     * </ul>
     * 
     * @param iteratorType
     *        Can be one of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AT_SEQUENCE_NUMBER</code>   –   Indicates that reading should start from the event sequence number
     *        specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AFTER_SEQUENCE_NUMBER</code>   –   Indicates that reading should start right after the event
     *        sequence number specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIM_HORIZON</code>   –   Indicates that reading should start at the last untrimmed record in the
     *        system, which is the oldest unexpired (not yet deleted) record in the change-log stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST</code>   –   Indicates that reading should start at the most recent record in the system,
     *        which is the latest unexpired (not yet deleted) record in the change-log stream.
     *        </p>
     *        </li>
     * @see IteratorType
     */

    public void setIteratorType(String iteratorType) {
        this.iteratorType = iteratorType;
    }

    /**
     * <p>
     * Can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AT_SEQUENCE_NUMBER</code>   –   Indicates that reading should start from the event sequence number
     * specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_SEQUENCE_NUMBER</code>   –   Indicates that reading should start right after the event sequence
     * number specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code>   –   Indicates that reading should start at the last untrimmed record in the system,
     * which is the oldest unexpired (not yet deleted) record in the change-log stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST</code>   –   Indicates that reading should start at the most recent record in the system, which is
     * the latest unexpired (not yet deleted) record in the change-log stream.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Can be one of:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AT_SEQUENCE_NUMBER</code>   –   Indicates that reading should start from the event sequence number
     *         specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AFTER_SEQUENCE_NUMBER</code>   –   Indicates that reading should start right after the event
     *         sequence number specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRIM_HORIZON</code>   –   Indicates that reading should start at the last untrimmed record in the
     *         system, which is the oldest unexpired (not yet deleted) record in the change-log stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LATEST</code>   –   Indicates that reading should start at the most recent record in the system,
     *         which is the latest unexpired (not yet deleted) record in the change-log stream.
     *         </p>
     *         </li>
     * @see IteratorType
     */

    public String getIteratorType() {
        return this.iteratorType;
    }

    /**
     * <p>
     * Can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AT_SEQUENCE_NUMBER</code>   –   Indicates that reading should start from the event sequence number
     * specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_SEQUENCE_NUMBER</code>   –   Indicates that reading should start right after the event sequence
     * number specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code>   –   Indicates that reading should start at the last untrimmed record in the system,
     * which is the oldest unexpired (not yet deleted) record in the change-log stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST</code>   –   Indicates that reading should start at the most recent record in the system, which is
     * the latest unexpired (not yet deleted) record in the change-log stream.
     * </p>
     * </li>
     * </ul>
     * 
     * @param iteratorType
     *        Can be one of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AT_SEQUENCE_NUMBER</code>   –   Indicates that reading should start from the event sequence number
     *        specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AFTER_SEQUENCE_NUMBER</code>   –   Indicates that reading should start right after the event
     *        sequence number specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIM_HORIZON</code>   –   Indicates that reading should start at the last untrimmed record in the
     *        system, which is the oldest unexpired (not yet deleted) record in the change-log stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST</code>   –   Indicates that reading should start at the most recent record in the system,
     *        which is the latest unexpired (not yet deleted) record in the change-log stream.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IteratorType
     */

    public GetSparqlStreamRequest withIteratorType(String iteratorType) {
        setIteratorType(iteratorType);
        return this;
    }

    /**
     * <p>
     * Can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AT_SEQUENCE_NUMBER</code>   –   Indicates that reading should start from the event sequence number
     * specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_SEQUENCE_NUMBER</code>   –   Indicates that reading should start right after the event sequence
     * number specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code>   –   Indicates that reading should start at the last untrimmed record in the system,
     * which is the oldest unexpired (not yet deleted) record in the change-log stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST</code>   –   Indicates that reading should start at the most recent record in the system, which is
     * the latest unexpired (not yet deleted) record in the change-log stream.
     * </p>
     * </li>
     * </ul>
     * 
     * @param iteratorType
     *        Can be one of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AT_SEQUENCE_NUMBER</code>   –   Indicates that reading should start from the event sequence number
     *        specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AFTER_SEQUENCE_NUMBER</code>   –   Indicates that reading should start right after the event
     *        sequence number specified jointly by the <code>commitNum</code> and <code>opNum</code> parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIM_HORIZON</code>   –   Indicates that reading should start at the last untrimmed record in the
     *        system, which is the oldest unexpired (not yet deleted) record in the change-log stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST</code>   –   Indicates that reading should start at the most recent record in the system,
     *        which is the latest unexpired (not yet deleted) record in the change-log stream.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IteratorType
     */

    public GetSparqlStreamRequest withIteratorType(IteratorType iteratorType) {
        this.iteratorType = iteratorType.toString();
        return this;
    }

    /**
     * <p>
     * The commit number of the starting record to read from the change-log stream. This parameter is required when
     * <code>iteratorType</code> is<code>AT_SEQUENCE_NUMBER</code> or <code>AFTER_SEQUENCE_NUMBER</code>, and ignored
     * when <code>iteratorType</code> is <code>TRIM_HORIZON</code> or <code>LATEST</code>.
     * </p>
     * 
     * @param commitNum
     *        The commit number of the starting record to read from the change-log stream. This parameter is required
     *        when <code>iteratorType</code> is<code>AT_SEQUENCE_NUMBER</code> or <code>AFTER_SEQUENCE_NUMBER</code>,
     *        and ignored when <code>iteratorType</code> is <code>TRIM_HORIZON</code> or <code>LATEST</code>.
     */

    public void setCommitNum(Long commitNum) {
        this.commitNum = commitNum;
    }

    /**
     * <p>
     * The commit number of the starting record to read from the change-log stream. This parameter is required when
     * <code>iteratorType</code> is<code>AT_SEQUENCE_NUMBER</code> or <code>AFTER_SEQUENCE_NUMBER</code>, and ignored
     * when <code>iteratorType</code> is <code>TRIM_HORIZON</code> or <code>LATEST</code>.
     * </p>
     * 
     * @return The commit number of the starting record to read from the change-log stream. This parameter is required
     *         when <code>iteratorType</code> is<code>AT_SEQUENCE_NUMBER</code> or <code>AFTER_SEQUENCE_NUMBER</code>,
     *         and ignored when <code>iteratorType</code> is <code>TRIM_HORIZON</code> or <code>LATEST</code>.
     */

    public Long getCommitNum() {
        return this.commitNum;
    }

    /**
     * <p>
     * The commit number of the starting record to read from the change-log stream. This parameter is required when
     * <code>iteratorType</code> is<code>AT_SEQUENCE_NUMBER</code> or <code>AFTER_SEQUENCE_NUMBER</code>, and ignored
     * when <code>iteratorType</code> is <code>TRIM_HORIZON</code> or <code>LATEST</code>.
     * </p>
     * 
     * @param commitNum
     *        The commit number of the starting record to read from the change-log stream. This parameter is required
     *        when <code>iteratorType</code> is<code>AT_SEQUENCE_NUMBER</code> or <code>AFTER_SEQUENCE_NUMBER</code>,
     *        and ignored when <code>iteratorType</code> is <code>TRIM_HORIZON</code> or <code>LATEST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSparqlStreamRequest withCommitNum(Long commitNum) {
        setCommitNum(commitNum);
        return this;
    }

    /**
     * <p>
     * The operation sequence number within the specified commit to start reading from in the change-log stream data.
     * The default is <code>1</code>.
     * </p>
     * 
     * @param opNum
     *        The operation sequence number within the specified commit to start reading from in the change-log stream
     *        data. The default is <code>1</code>.
     */

    public void setOpNum(Long opNum) {
        this.opNum = opNum;
    }

    /**
     * <p>
     * The operation sequence number within the specified commit to start reading from in the change-log stream data.
     * The default is <code>1</code>.
     * </p>
     * 
     * @return The operation sequence number within the specified commit to start reading from in the change-log stream
     *         data. The default is <code>1</code>.
     */

    public Long getOpNum() {
        return this.opNum;
    }

    /**
     * <p>
     * The operation sequence number within the specified commit to start reading from in the change-log stream data.
     * The default is <code>1</code>.
     * </p>
     * 
     * @param opNum
     *        The operation sequence number within the specified commit to start reading from in the change-log stream
     *        data. The default is <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSparqlStreamRequest withOpNum(Long opNum) {
        setOpNum(opNum);
        return this;
    }

    /**
     * <p>
     * If set to TRUE, Neptune compresses the response using gzip encoding.
     * </p>
     * 
     * @param encoding
     *        If set to TRUE, Neptune compresses the response using gzip encoding.
     * @see Encoding
     */

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * <p>
     * If set to TRUE, Neptune compresses the response using gzip encoding.
     * </p>
     * 
     * @return If set to TRUE, Neptune compresses the response using gzip encoding.
     * @see Encoding
     */

    public String getEncoding() {
        return this.encoding;
    }

    /**
     * <p>
     * If set to TRUE, Neptune compresses the response using gzip encoding.
     * </p>
     * 
     * @param encoding
     *        If set to TRUE, Neptune compresses the response using gzip encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Encoding
     */

    public GetSparqlStreamRequest withEncoding(String encoding) {
        setEncoding(encoding);
        return this;
    }

    /**
     * <p>
     * If set to TRUE, Neptune compresses the response using gzip encoding.
     * </p>
     * 
     * @param encoding
     *        If set to TRUE, Neptune compresses the response using gzip encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Encoding
     */

    public GetSparqlStreamRequest withEncoding(Encoding encoding) {
        this.encoding = encoding.toString();
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getIteratorType() != null)
            sb.append("IteratorType: ").append(getIteratorType()).append(",");
        if (getCommitNum() != null)
            sb.append("CommitNum: ").append(getCommitNum()).append(",");
        if (getOpNum() != null)
            sb.append("OpNum: ").append(getOpNum()).append(",");
        if (getEncoding() != null)
            sb.append("Encoding: ").append(getEncoding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSparqlStreamRequest == false)
            return false;
        GetSparqlStreamRequest other = (GetSparqlStreamRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getIteratorType() == null ^ this.getIteratorType() == null)
            return false;
        if (other.getIteratorType() != null && other.getIteratorType().equals(this.getIteratorType()) == false)
            return false;
        if (other.getCommitNum() == null ^ this.getCommitNum() == null)
            return false;
        if (other.getCommitNum() != null && other.getCommitNum().equals(this.getCommitNum()) == false)
            return false;
        if (other.getOpNum() == null ^ this.getOpNum() == null)
            return false;
        if (other.getOpNum() != null && other.getOpNum().equals(this.getOpNum()) == false)
            return false;
        if (other.getEncoding() == null ^ this.getEncoding() == null)
            return false;
        if (other.getEncoding() != null && other.getEncoding().equals(this.getEncoding()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getIteratorType() == null) ? 0 : getIteratorType().hashCode());
        hashCode = prime * hashCode + ((getCommitNum() == null) ? 0 : getCommitNum().hashCode());
        hashCode = prime * hashCode + ((getOpNum() == null) ? 0 : getOpNum().hashCode());
        hashCode = prime * hashCode + ((getEncoding() == null) ? 0 : getEncoding().hashCode());
        return hashCode;
    }

    @Override
    public GetSparqlStreamRequest clone() {
        return (GetSparqlStreamRequest) super.clone();
    }

}
