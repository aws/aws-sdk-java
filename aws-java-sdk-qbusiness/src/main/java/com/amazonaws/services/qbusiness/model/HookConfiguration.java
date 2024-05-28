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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information for invoking a Lambda function in Lambda to alter document metadata and
 * content when ingesting documents into Amazon Q Business.
 * </p>
 * <p>
 * You can configure your Lambda function using the <code>PreExtractionHookConfiguration</code> parameter if you want to
 * apply advanced alterations on the original or raw documents.
 * </p>
 * <p>
 * If you want to apply advanced alterations on the Amazon Q Business structured documents, you must configure your
 * Lambda function using <code>PostExtractionHookConfiguration</code>.
 * </p>
 * <p>
 * You can only invoke one Lambda function. However, this function can invoke other functions it requires.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html">Custom document
 * enrichment</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/HookConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HookConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The condition used for when a Lambda function should be invoked.
     * </p>
     * <p>
     * For example, you can specify a condition that if there are empty date-time values, then Amazon Q Business should
     * invoke a function that inserts the current date-time.
     * </p>
     */
    private DocumentAttributeCondition invocationCondition;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/iam-roles.html#cde-iam-role">IAM roles for
     * Custom Document Enrichment (CDE)</a>.
     * </p>
     */
    private String lambdaArn;
    /**
     * <p>
     * Stores the original, raw documents or the structured, parsed documents before and after altering them. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html#cde-lambda-operations-data-contracts"
     * >Data contracts for Lambda functions</a>.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run <code>PreExtractionHookConfiguration</code> and
     * <code>PostExtractionHookConfiguration</code> for altering document metadata and content during the document
     * ingestion process.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The condition used for when a Lambda function should be invoked.
     * </p>
     * <p>
     * For example, you can specify a condition that if there are empty date-time values, then Amazon Q Business should
     * invoke a function that inserts the current date-time.
     * </p>
     * 
     * @param invocationCondition
     *        The condition used for when a Lambda function should be invoked.</p>
     *        <p>
     *        For example, you can specify a condition that if there are empty date-time values, then Amazon Q Business
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
     * For example, you can specify a condition that if there are empty date-time values, then Amazon Q Business should
     * invoke a function that inserts the current date-time.
     * </p>
     * 
     * @return The condition used for when a Lambda function should be invoked.</p>
     *         <p>
     *         For example, you can specify a condition that if there are empty date-time values, then Amazon Q Business
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
     * For example, you can specify a condition that if there are empty date-time values, then Amazon Q Business should
     * invoke a function that inserts the current date-time.
     * </p>
     * 
     * @param invocationCondition
     *        The condition used for when a Lambda function should be invoked.</p>
     *        <p>
     *        For example, you can specify a condition that if there are empty date-time values, then Amazon Q Business
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
     * information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/iam-roles.html#cde-iam-role">IAM roles for
     * Custom Document Enrichment (CDE)</a>.
     * </p>
     * 
     * @param lambdaArn
     *        The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/iam-roles.html#cde-iam-role">IAM roles
     *        for Custom Document Enrichment (CDE)</a>.
     */

    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/iam-roles.html#cde-iam-role">IAM roles for
     * Custom Document Enrichment (CDE)</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/iam-roles.html#cde-iam-role">IAM roles
     *         for Custom Document Enrichment (CDE)</a>.
     */

    public String getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/iam-roles.html#cde-iam-role">IAM roles for
     * Custom Document Enrichment (CDE)</a>.
     * </p>
     * 
     * @param lambdaArn
     *        The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/iam-roles.html#cde-iam-role">IAM roles
     *        for Custom Document Enrichment (CDE)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HookConfiguration withLambdaArn(String lambdaArn) {
        setLambdaArn(lambdaArn);
        return this;
    }

    /**
     * <p>
     * Stores the original, raw documents or the structured, parsed documents before and after altering them. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html#cde-lambda-operations-data-contracts"
     * >Data contracts for Lambda functions</a>.
     * </p>
     * 
     * @param s3BucketName
     *        Stores the original, raw documents or the structured, parsed documents before and after altering them. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html#cde-lambda-operations-data-contracts"
     *        >Data contracts for Lambda functions</a>.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * Stores the original, raw documents or the structured, parsed documents before and after altering them. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html#cde-lambda-operations-data-contracts"
     * >Data contracts for Lambda functions</a>.
     * </p>
     * 
     * @return Stores the original, raw documents or the structured, parsed documents before and after altering them.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html#cde-lambda-operations-data-contracts"
     *         >Data contracts for Lambda functions</a>.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * Stores the original, raw documents or the structured, parsed documents before and after altering them. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html#cde-lambda-operations-data-contracts"
     * >Data contracts for Lambda functions</a>.
     * </p>
     * 
     * @param s3BucketName
     *        Stores the original, raw documents or the structured, parsed documents before and after altering them. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html#cde-lambda-operations-data-contracts"
     *        >Data contracts for Lambda functions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HookConfiguration withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run <code>PreExtractionHookConfiguration</code> and
     * <code>PostExtractionHookConfiguration</code> for altering document metadata and content during the document
     * ingestion process.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to run
     *        <code>PreExtractionHookConfiguration</code> and <code>PostExtractionHookConfiguration</code> for altering
     *        document metadata and content during the document ingestion process.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run <code>PreExtractionHookConfiguration</code> and
     * <code>PostExtractionHookConfiguration</code> for altering document metadata and content during the document
     * ingestion process.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to run
     *         <code>PreExtractionHookConfiguration</code> and <code>PostExtractionHookConfiguration</code> for altering
     *         document metadata and content during the document ingestion process.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to run <code>PreExtractionHookConfiguration</code> and
     * <code>PostExtractionHookConfiguration</code> for altering document metadata and content during the document
     * ingestion process.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to run
     *        <code>PreExtractionHookConfiguration</code> and <code>PostExtractionHookConfiguration</code> for altering
     *        document metadata and content during the document ingestion process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HookConfiguration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
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
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvocationCondition() == null) ? 0 : getInvocationCondition().hashCode());
        hashCode = prime * hashCode + ((getLambdaArn() == null) ? 0 : getLambdaArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
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
        com.amazonaws.services.qbusiness.model.transform.HookConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
