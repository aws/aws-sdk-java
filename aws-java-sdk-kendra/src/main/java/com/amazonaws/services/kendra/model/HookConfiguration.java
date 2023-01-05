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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information for invoking a Lambda function in Lambda to alter document metadata and
 * content when ingesting documents into Amazon Kendra. You can configure your Lambda function using <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/API_CustomDocumentEnrichmentConfiguration.html"
 * >PreExtractionHookConfiguration</a> if you want to apply advanced alterations on the original or raw documents. If
 * you want to apply advanced alterations on the Amazon Kendra structured documents, you must configure your Lambda
 * function using <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_CustomDocumentEnrichmentConfiguration.html">
 * PostExtractionHookConfiguration</a>. You can only invoke one Lambda function. However, this function can invoke other
 * functions it requires.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
 * during the ingestion process</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/HookConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HookConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The condition used for when a Lambda function should be invoked.
     * </p>
     * <p>
     * For example, you can specify a condition that if there are empty date-time values, then Amazon Kendra should
     * invoke a function that inserts the current date-time.
     * </p>
     */
    private DocumentAttributeCondition invocationCondition;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon
     * Kendra</a>.
     * </p>
     */
    private String lambdaArn;
    /**
     * <p>
     * Stores the original, raw documents or the structured, parsed documents before and after altering them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda"
     * >Data contracts for Lambda functions</a>.
     * </p>
     */
    private String s3Bucket;

    /**
     * <p>
     * The condition used for when a Lambda function should be invoked.
     * </p>
     * <p>
     * For example, you can specify a condition that if there are empty date-time values, then Amazon Kendra should
     * invoke a function that inserts the current date-time.
     * </p>
     * 
     * @param invocationCondition
     *        The condition used for when a Lambda function should be invoked.</p>
     *        <p>
     *        For example, you can specify a condition that if there are empty date-time values, then Amazon Kendra
     *        should invoke a function that inserts the current date-time.
     */

    public void setInvocationCondition(DocumentAttributeCondition invocationCondition) {
        this.invocationCondition = invocationCondition;
    }

    /**
     * <p>
     * The condition used for when a Lambda function should be invoked.
     * </p>
     * <p>
     * For example, you can specify a condition that if there are empty date-time values, then Amazon Kendra should
     * invoke a function that inserts the current date-time.
     * </p>
     * 
     * @return The condition used for when a Lambda function should be invoked.</p>
     *         <p>
     *         For example, you can specify a condition that if there are empty date-time values, then Amazon Kendra
     *         should invoke a function that inserts the current date-time.
     */

    public DocumentAttributeCondition getInvocationCondition() {
        return this.invocationCondition;
    }

    /**
     * <p>
     * The condition used for when a Lambda function should be invoked.
     * </p>
     * <p>
     * For example, you can specify a condition that if there are empty date-time values, then Amazon Kendra should
     * invoke a function that inserts the current date-time.
     * </p>
     * 
     * @param invocationCondition
     *        The condition used for when a Lambda function should be invoked.</p>
     *        <p>
     *        For example, you can specify a condition that if there are empty date-time values, then Amazon Kendra
     *        should invoke a function that inserts the current date-time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HookConfiguration withInvocationCondition(DocumentAttributeCondition invocationCondition) {
        setInvocationCondition(invocationCondition);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @param lambdaArn
     *        The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For
     *        more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for
     *        Amazon Kendra</a>.
     */

    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For
     *         more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for
     *         Amazon Kendra</a>.
     */

    public String getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @param lambdaArn
     *        The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For
     *        more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for
     *        Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HookConfiguration withLambdaArn(String lambdaArn) {
        setLambdaArn(lambdaArn);
        return this;
    }

    /**
     * <p>
     * Stores the original, raw documents or the structured, parsed documents before and after altering them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda"
     * >Data contracts for Lambda functions</a>.
     * </p>
     * 
     * @param s3Bucket
     *        Stores the original, raw documents or the structured, parsed documents before and after altering them. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda"
     *        >Data contracts for Lambda functions</a>.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * Stores the original, raw documents or the structured, parsed documents before and after altering them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda"
     * >Data contracts for Lambda functions</a>.
     * </p>
     * 
     * @return Stores the original, raw documents or the structured, parsed documents before and after altering them.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda"
     *         >Data contracts for Lambda functions</a>.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * Stores the original, raw documents or the structured, parsed documents before and after altering them. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda"
     * >Data contracts for Lambda functions</a>.
     * </p>
     * 
     * @param s3Bucket
     *        Stores the original, raw documents or the structured, parsed documents before and after altering them. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda"
     *        >Data contracts for Lambda functions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HookConfiguration withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
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
        if (getInvocationCondition() != null)
            sb.append("InvocationCondition: ").append(getInvocationCondition()).append(",");
        if (getLambdaArn() != null)
            sb.append("LambdaArn: ").append(getLambdaArn()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HookConfiguration == false)
            return false;
        HookConfiguration other = (HookConfiguration) obj;
        if (other.getInvocationCondition() == null ^ this.getInvocationCondition() == null)
            return false;
        if (other.getInvocationCondition() != null && other.getInvocationCondition().equals(this.getInvocationCondition()) == false)
            return false;
        if (other.getLambdaArn() == null ^ this.getLambdaArn() == null)
            return false;
        if (other.getLambdaArn() != null && other.getLambdaArn().equals(this.getLambdaArn()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvocationCondition() == null) ? 0 : getInvocationCondition().hashCode());
        hashCode = prime * hashCode + ((getLambdaArn() == null) ? 0 : getLambdaArn().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        return hashCode;
    }

    @Override
    public HookConfiguration clone() {
        try {
            return (HookConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.HookConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
