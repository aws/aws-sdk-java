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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Limits that are related to concurrency and code storage. All file and storage sizes are in bytes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AccountLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of storage space that you can use for all deployment packages and layer archives.
     * </p>
     */
    private Long totalCodeSize;
    /**
     * <p>
     * The maximum size of your function's code and layers when they're extracted.
     * </p>
     */
    private Long codeSizeUnzipped;
    /**
     * <p>
     * The maximum size of a deployment package when it's uploaded directly to AWS Lambda. Use Amazon S3 for larger
     * files.
     * </p>
     */
    private Long codeSizeZipped;
    /**
     * <p>
     * The maximum number of simultaneous function executions.
     * </p>
     */
    private Integer concurrentExecutions;
    /**
     * <p>
     * The maximum number of simultaneous function executions, minus the capacity that's reserved for individual
     * functions with <a>PutFunctionConcurrency</a>.
     * </p>
     */
    private Integer unreservedConcurrentExecutions;

    /**
     * <p>
     * The amount of storage space that you can use for all deployment packages and layer archives.
     * </p>
     * 
     * @param totalCodeSize
     *        The amount of storage space that you can use for all deployment packages and layer archives.
     */

    public void setTotalCodeSize(Long totalCodeSize) {
        this.totalCodeSize = totalCodeSize;
    }

    /**
     * <p>
     * The amount of storage space that you can use for all deployment packages and layer archives.
     * </p>
     * 
     * @return The amount of storage space that you can use for all deployment packages and layer archives.
     */

    public Long getTotalCodeSize() {
        return this.totalCodeSize;
    }

    /**
     * <p>
     * The amount of storage space that you can use for all deployment packages and layer archives.
     * </p>
     * 
     * @param totalCodeSize
     *        The amount of storage space that you can use for all deployment packages and layer archives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withTotalCodeSize(Long totalCodeSize) {
        setTotalCodeSize(totalCodeSize);
        return this;
    }

    /**
     * <p>
     * The maximum size of your function's code and layers when they're extracted.
     * </p>
     * 
     * @param codeSizeUnzipped
     *        The maximum size of your function's code and layers when they're extracted.
     */

    public void setCodeSizeUnzipped(Long codeSizeUnzipped) {
        this.codeSizeUnzipped = codeSizeUnzipped;
    }

    /**
     * <p>
     * The maximum size of your function's code and layers when they're extracted.
     * </p>
     * 
     * @return The maximum size of your function's code and layers when they're extracted.
     */

    public Long getCodeSizeUnzipped() {
        return this.codeSizeUnzipped;
    }

    /**
     * <p>
     * The maximum size of your function's code and layers when they're extracted.
     * </p>
     * 
     * @param codeSizeUnzipped
     *        The maximum size of your function's code and layers when they're extracted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withCodeSizeUnzipped(Long codeSizeUnzipped) {
        setCodeSizeUnzipped(codeSizeUnzipped);
        return this;
    }

    /**
     * <p>
     * The maximum size of a deployment package when it's uploaded directly to AWS Lambda. Use Amazon S3 for larger
     * files.
     * </p>
     * 
     * @param codeSizeZipped
     *        The maximum size of a deployment package when it's uploaded directly to AWS Lambda. Use Amazon S3 for
     *        larger files.
     */

    public void setCodeSizeZipped(Long codeSizeZipped) {
        this.codeSizeZipped = codeSizeZipped;
    }

    /**
     * <p>
     * The maximum size of a deployment package when it's uploaded directly to AWS Lambda. Use Amazon S3 for larger
     * files.
     * </p>
     * 
     * @return The maximum size of a deployment package when it's uploaded directly to AWS Lambda. Use Amazon S3 for
     *         larger files.
     */

    public Long getCodeSizeZipped() {
        return this.codeSizeZipped;
    }

    /**
     * <p>
     * The maximum size of a deployment package when it's uploaded directly to AWS Lambda. Use Amazon S3 for larger
     * files.
     * </p>
     * 
     * @param codeSizeZipped
     *        The maximum size of a deployment package when it's uploaded directly to AWS Lambda. Use Amazon S3 for
     *        larger files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withCodeSizeZipped(Long codeSizeZipped) {
        setCodeSizeZipped(codeSizeZipped);
        return this;
    }

    /**
     * <p>
     * The maximum number of simultaneous function executions.
     * </p>
     * 
     * @param concurrentExecutions
     *        The maximum number of simultaneous function executions.
     */

    public void setConcurrentExecutions(Integer concurrentExecutions) {
        this.concurrentExecutions = concurrentExecutions;
    }

    /**
     * <p>
     * The maximum number of simultaneous function executions.
     * </p>
     * 
     * @return The maximum number of simultaneous function executions.
     */

    public Integer getConcurrentExecutions() {
        return this.concurrentExecutions;
    }

    /**
     * <p>
     * The maximum number of simultaneous function executions.
     * </p>
     * 
     * @param concurrentExecutions
     *        The maximum number of simultaneous function executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withConcurrentExecutions(Integer concurrentExecutions) {
        setConcurrentExecutions(concurrentExecutions);
        return this;
    }

    /**
     * <p>
     * The maximum number of simultaneous function executions, minus the capacity that's reserved for individual
     * functions with <a>PutFunctionConcurrency</a>.
     * </p>
     * 
     * @param unreservedConcurrentExecutions
     *        The maximum number of simultaneous function executions, minus the capacity that's reserved for individual
     *        functions with <a>PutFunctionConcurrency</a>.
     */

    public void setUnreservedConcurrentExecutions(Integer unreservedConcurrentExecutions) {
        this.unreservedConcurrentExecutions = unreservedConcurrentExecutions;
    }

    /**
     * <p>
     * The maximum number of simultaneous function executions, minus the capacity that's reserved for individual
     * functions with <a>PutFunctionConcurrency</a>.
     * </p>
     * 
     * @return The maximum number of simultaneous function executions, minus the capacity that's reserved for individual
     *         functions with <a>PutFunctionConcurrency</a>.
     */

    public Integer getUnreservedConcurrentExecutions() {
        return this.unreservedConcurrentExecutions;
    }

    /**
     * <p>
     * The maximum number of simultaneous function executions, minus the capacity that's reserved for individual
     * functions with <a>PutFunctionConcurrency</a>.
     * </p>
     * 
     * @param unreservedConcurrentExecutions
     *        The maximum number of simultaneous function executions, minus the capacity that's reserved for individual
     *        functions with <a>PutFunctionConcurrency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withUnreservedConcurrentExecutions(Integer unreservedConcurrentExecutions) {
        setUnreservedConcurrentExecutions(unreservedConcurrentExecutions);
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
        if (getTotalCodeSize() != null)
            sb.append("TotalCodeSize: ").append(getTotalCodeSize()).append(",");
        if (getCodeSizeUnzipped() != null)
            sb.append("CodeSizeUnzipped: ").append(getCodeSizeUnzipped()).append(",");
        if (getCodeSizeZipped() != null)
            sb.append("CodeSizeZipped: ").append(getCodeSizeZipped()).append(",");
        if (getConcurrentExecutions() != null)
            sb.append("ConcurrentExecutions: ").append(getConcurrentExecutions()).append(",");
        if (getUnreservedConcurrentExecutions() != null)
            sb.append("UnreservedConcurrentExecutions: ").append(getUnreservedConcurrentExecutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountLimit == false)
            return false;
        AccountLimit other = (AccountLimit) obj;
        if (other.getTotalCodeSize() == null ^ this.getTotalCodeSize() == null)
            return false;
        if (other.getTotalCodeSize() != null && other.getTotalCodeSize().equals(this.getTotalCodeSize()) == false)
            return false;
        if (other.getCodeSizeUnzipped() == null ^ this.getCodeSizeUnzipped() == null)
            return false;
        if (other.getCodeSizeUnzipped() != null && other.getCodeSizeUnzipped().equals(this.getCodeSizeUnzipped()) == false)
            return false;
        if (other.getCodeSizeZipped() == null ^ this.getCodeSizeZipped() == null)
            return false;
        if (other.getCodeSizeZipped() != null && other.getCodeSizeZipped().equals(this.getCodeSizeZipped()) == false)
            return false;
        if (other.getConcurrentExecutions() == null ^ this.getConcurrentExecutions() == null)
            return false;
        if (other.getConcurrentExecutions() != null && other.getConcurrentExecutions().equals(this.getConcurrentExecutions()) == false)
            return false;
        if (other.getUnreservedConcurrentExecutions() == null ^ this.getUnreservedConcurrentExecutions() == null)
            return false;
        if (other.getUnreservedConcurrentExecutions() != null
                && other.getUnreservedConcurrentExecutions().equals(this.getUnreservedConcurrentExecutions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalCodeSize() == null) ? 0 : getTotalCodeSize().hashCode());
        hashCode = prime * hashCode + ((getCodeSizeUnzipped() == null) ? 0 : getCodeSizeUnzipped().hashCode());
        hashCode = prime * hashCode + ((getCodeSizeZipped() == null) ? 0 : getCodeSizeZipped().hashCode());
        hashCode = prime * hashCode + ((getConcurrentExecutions() == null) ? 0 : getConcurrentExecutions().hashCode());
        hashCode = prime * hashCode + ((getUnreservedConcurrentExecutions() == null) ? 0 : getUnreservedConcurrentExecutions().hashCode());
        return hashCode;
    }

    @Override
    public AccountLimit clone() {
        try {
            return (AccountLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.AccountLimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
