/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides limits of code size and concurrency associated with the current account and region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AccountLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Maximum size, in bytes, of a code package you can upload per region. The default size is 75 GB.
     * </p>
     */
    private Long totalCodeSize;
    /**
     * <p>
     * Size, in bytes, of code/dependencies that you can zip into a deployment package (uncompressed zip/jar size) for
     * uploading. The default limit is 250 MB.
     * </p>
     */
    private Long codeSizeUnzipped;
    /**
     * <p>
     * Size, in bytes, of a single zipped code/dependencies package you can upload for your Lambda function(.zip/.jar
     * file). Try using Amazon S3 for uploading larger files. Default limit is 50 MB.
     * </p>
     */
    private Long codeSizeZipped;
    /**
     * <p>
     * Number of simultaneous executions of your function per region. For more information or to request a limit
     * increase for concurrent executions, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Lambda Function Concurrent
     * Executions</a>. The default limit is 1000.
     * </p>
     */
    private Integer concurrentExecutions;
    /**
     * <p>
     * The number of concurrent executions available to functions that do not have concurrency limits set. For more
     * information, see <a>concurrent-executions</a>.
     * </p>
     */
    private Integer unreservedConcurrentExecutions;

    /**
     * <p>
     * Maximum size, in bytes, of a code package you can upload per region. The default size is 75 GB.
     * </p>
     * 
     * @param totalCodeSize
     *        Maximum size, in bytes, of a code package you can upload per region. The default size is 75 GB.
     */

    public void setTotalCodeSize(Long totalCodeSize) {
        this.totalCodeSize = totalCodeSize;
    }

    /**
     * <p>
     * Maximum size, in bytes, of a code package you can upload per region. The default size is 75 GB.
     * </p>
     * 
     * @return Maximum size, in bytes, of a code package you can upload per region. The default size is 75 GB.
     */

    public Long getTotalCodeSize() {
        return this.totalCodeSize;
    }

    /**
     * <p>
     * Maximum size, in bytes, of a code package you can upload per region. The default size is 75 GB.
     * </p>
     * 
     * @param totalCodeSize
     *        Maximum size, in bytes, of a code package you can upload per region. The default size is 75 GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withTotalCodeSize(Long totalCodeSize) {
        setTotalCodeSize(totalCodeSize);
        return this;
    }

    /**
     * <p>
     * Size, in bytes, of code/dependencies that you can zip into a deployment package (uncompressed zip/jar size) for
     * uploading. The default limit is 250 MB.
     * </p>
     * 
     * @param codeSizeUnzipped
     *        Size, in bytes, of code/dependencies that you can zip into a deployment package (uncompressed zip/jar
     *        size) for uploading. The default limit is 250 MB.
     */

    public void setCodeSizeUnzipped(Long codeSizeUnzipped) {
        this.codeSizeUnzipped = codeSizeUnzipped;
    }

    /**
     * <p>
     * Size, in bytes, of code/dependencies that you can zip into a deployment package (uncompressed zip/jar size) for
     * uploading. The default limit is 250 MB.
     * </p>
     * 
     * @return Size, in bytes, of code/dependencies that you can zip into a deployment package (uncompressed zip/jar
     *         size) for uploading. The default limit is 250 MB.
     */

    public Long getCodeSizeUnzipped() {
        return this.codeSizeUnzipped;
    }

    /**
     * <p>
     * Size, in bytes, of code/dependencies that you can zip into a deployment package (uncompressed zip/jar size) for
     * uploading. The default limit is 250 MB.
     * </p>
     * 
     * @param codeSizeUnzipped
     *        Size, in bytes, of code/dependencies that you can zip into a deployment package (uncompressed zip/jar
     *        size) for uploading. The default limit is 250 MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withCodeSizeUnzipped(Long codeSizeUnzipped) {
        setCodeSizeUnzipped(codeSizeUnzipped);
        return this;
    }

    /**
     * <p>
     * Size, in bytes, of a single zipped code/dependencies package you can upload for your Lambda function(.zip/.jar
     * file). Try using Amazon S3 for uploading larger files. Default limit is 50 MB.
     * </p>
     * 
     * @param codeSizeZipped
     *        Size, in bytes, of a single zipped code/dependencies package you can upload for your Lambda
     *        function(.zip/.jar file). Try using Amazon S3 for uploading larger files. Default limit is 50 MB.
     */

    public void setCodeSizeZipped(Long codeSizeZipped) {
        this.codeSizeZipped = codeSizeZipped;
    }

    /**
     * <p>
     * Size, in bytes, of a single zipped code/dependencies package you can upload for your Lambda function(.zip/.jar
     * file). Try using Amazon S3 for uploading larger files. Default limit is 50 MB.
     * </p>
     * 
     * @return Size, in bytes, of a single zipped code/dependencies package you can upload for your Lambda
     *         function(.zip/.jar file). Try using Amazon S3 for uploading larger files. Default limit is 50 MB.
     */

    public Long getCodeSizeZipped() {
        return this.codeSizeZipped;
    }

    /**
     * <p>
     * Size, in bytes, of a single zipped code/dependencies package you can upload for your Lambda function(.zip/.jar
     * file). Try using Amazon S3 for uploading larger files. Default limit is 50 MB.
     * </p>
     * 
     * @param codeSizeZipped
     *        Size, in bytes, of a single zipped code/dependencies package you can upload for your Lambda
     *        function(.zip/.jar file). Try using Amazon S3 for uploading larger files. Default limit is 50 MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withCodeSizeZipped(Long codeSizeZipped) {
        setCodeSizeZipped(codeSizeZipped);
        return this;
    }

    /**
     * <p>
     * Number of simultaneous executions of your function per region. For more information or to request a limit
     * increase for concurrent executions, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Lambda Function Concurrent
     * Executions</a>. The default limit is 1000.
     * </p>
     * 
     * @param concurrentExecutions
     *        Number of simultaneous executions of your function per region. For more information or to request a limit
     *        increase for concurrent executions, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Lambda Function Concurrent
     *        Executions</a>. The default limit is 1000.
     */

    public void setConcurrentExecutions(Integer concurrentExecutions) {
        this.concurrentExecutions = concurrentExecutions;
    }

    /**
     * <p>
     * Number of simultaneous executions of your function per region. For more information or to request a limit
     * increase for concurrent executions, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Lambda Function Concurrent
     * Executions</a>. The default limit is 1000.
     * </p>
     * 
     * @return Number of simultaneous executions of your function per region. For more information or to request a limit
     *         increase for concurrent executions, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Lambda Function Concurrent
     *         Executions</a>. The default limit is 1000.
     */

    public Integer getConcurrentExecutions() {
        return this.concurrentExecutions;
    }

    /**
     * <p>
     * Number of simultaneous executions of your function per region. For more information or to request a limit
     * increase for concurrent executions, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Lambda Function Concurrent
     * Executions</a>. The default limit is 1000.
     * </p>
     * 
     * @param concurrentExecutions
     *        Number of simultaneous executions of your function per region. For more information or to request a limit
     *        increase for concurrent executions, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Lambda Function Concurrent
     *        Executions</a>. The default limit is 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withConcurrentExecutions(Integer concurrentExecutions) {
        setConcurrentExecutions(concurrentExecutions);
        return this;
    }

    /**
     * <p>
     * The number of concurrent executions available to functions that do not have concurrency limits set. For more
     * information, see <a>concurrent-executions</a>.
     * </p>
     * 
     * @param unreservedConcurrentExecutions
     *        The number of concurrent executions available to functions that do not have concurrency limits set. For
     *        more information, see <a>concurrent-executions</a>.
     */

    public void setUnreservedConcurrentExecutions(Integer unreservedConcurrentExecutions) {
        this.unreservedConcurrentExecutions = unreservedConcurrentExecutions;
    }

    /**
     * <p>
     * The number of concurrent executions available to functions that do not have concurrency limits set. For more
     * information, see <a>concurrent-executions</a>.
     * </p>
     * 
     * @return The number of concurrent executions available to functions that do not have concurrency limits set. For
     *         more information, see <a>concurrent-executions</a>.
     */

    public Integer getUnreservedConcurrentExecutions() {
        return this.unreservedConcurrentExecutions;
    }

    /**
     * <p>
     * The number of concurrent executions available to functions that do not have concurrency limits set. For more
     * information, see <a>concurrent-executions</a>.
     * </p>
     * 
     * @param unreservedConcurrentExecutions
     *        The number of concurrent executions available to functions that do not have concurrency limits set. For
     *        more information, see <a>concurrent-executions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLimit withUnreservedConcurrentExecutions(Integer unreservedConcurrentExecutions) {
        setUnreservedConcurrentExecutions(unreservedConcurrentExecutions);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
