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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TestType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of the extension to test.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the extension to test.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The version of the extension to test.
     * </p>
     * <p>
     * You can specify the version id with either <code>Arn</code>, or with <code>TypeName</code> and <code>Type</code>.
     * </p>
     * <p>
     * If you do not specify a version, CloudFormation uses the default version of the extension in this account and
     * region for testing.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * The S3 bucket to which CloudFormation delivers the contract test execution logs.
     * </p>
     * <p>
     * CloudFormation delivers the logs by the time contract testing has completed and the extension has been assigned a
     * test type status of <code>PASSED</code> or <code>FAILED</code>.
     * </p>
     * <p>
     * The user calling <code>TestType</code> must be able to access items in the specified S3 bucket. Specifically, the
     * user needs the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetObject
     * </p>
     * </li>
     * <li>
     * <p>
     * PutObject
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html">Actions, Resources,
     * and Condition Keys for Amazon S3</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     */
    private String logDeliveryBucket;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Number (ARN) of the extension.</p>
     *        <p>
     *        Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the extension.</p>
     *         <p>
     *         Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Number (ARN) of the extension.</p>
     *        <p>
     *        Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestTypeRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of the extension to test.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param type
     *        The type of the extension to test.</p>
     *        <p>
     *        Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * @see ThirdPartyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the extension to test.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @return The type of the extension to test.</p>
     *         <p>
     *         Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * @see ThirdPartyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the extension to test.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param type
     *        The type of the extension to test.</p>
     *        <p>
     *        Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyType
     */

    public TestTypeRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the extension to test.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param type
     *        The type of the extension to test.</p>
     *        <p>
     *        Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyType
     */

    public TestTypeRequest withType(ThirdPartyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the extension to test.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the extension to test.</p>
     *        <p>
     *        Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the extension to test.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @return The name of the extension to test.</p>
     *         <p>
     *         Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the extension to test.
     * </p>
     * <p>
     * Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the extension to test.</p>
     *        <p>
     *        Conditional: You must specify <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestTypeRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The version of the extension to test.
     * </p>
     * <p>
     * You can specify the version id with either <code>Arn</code>, or with <code>TypeName</code> and <code>Type</code>.
     * </p>
     * <p>
     * If you do not specify a version, CloudFormation uses the default version of the extension in this account and
     * region for testing.
     * </p>
     * 
     * @param versionId
     *        The version of the extension to test.</p>
     *        <p>
     *        You can specify the version id with either <code>Arn</code>, or with <code>TypeName</code> and
     *        <code>Type</code>.
     *        </p>
     *        <p>
     *        If you do not specify a version, CloudFormation uses the default version of the extension in this account
     *        and region for testing.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The version of the extension to test.
     * </p>
     * <p>
     * You can specify the version id with either <code>Arn</code>, or with <code>TypeName</code> and <code>Type</code>.
     * </p>
     * <p>
     * If you do not specify a version, CloudFormation uses the default version of the extension in this account and
     * region for testing.
     * </p>
     * 
     * @return The version of the extension to test.</p>
     *         <p>
     *         You can specify the version id with either <code>Arn</code>, or with <code>TypeName</code> and
     *         <code>Type</code>.
     *         </p>
     *         <p>
     *         If you do not specify a version, CloudFormation uses the default version of the extension in this account
     *         and region for testing.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The version of the extension to test.
     * </p>
     * <p>
     * You can specify the version id with either <code>Arn</code>, or with <code>TypeName</code> and <code>Type</code>.
     * </p>
     * <p>
     * If you do not specify a version, CloudFormation uses the default version of the extension in this account and
     * region for testing.
     * </p>
     * 
     * @param versionId
     *        The version of the extension to test.</p>
     *        <p>
     *        You can specify the version id with either <code>Arn</code>, or with <code>TypeName</code> and
     *        <code>Type</code>.
     *        </p>
     *        <p>
     *        If you do not specify a version, CloudFormation uses the default version of the extension in this account
     *        and region for testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestTypeRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * The S3 bucket to which CloudFormation delivers the contract test execution logs.
     * </p>
     * <p>
     * CloudFormation delivers the logs by the time contract testing has completed and the extension has been assigned a
     * test type status of <code>PASSED</code> or <code>FAILED</code>.
     * </p>
     * <p>
     * The user calling <code>TestType</code> must be able to access items in the specified S3 bucket. Specifically, the
     * user needs the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetObject
     * </p>
     * </li>
     * <li>
     * <p>
     * PutObject
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html">Actions, Resources,
     * and Condition Keys for Amazon S3</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param logDeliveryBucket
     *        The S3 bucket to which CloudFormation delivers the contract test execution logs.</p>
     *        <p>
     *        CloudFormation delivers the logs by the time contract testing has completed and the extension has been
     *        assigned a test type status of <code>PASSED</code> or <code>FAILED</code>.
     *        </p>
     *        <p>
     *        The user calling <code>TestType</code> must be able to access items in the specified S3 bucket.
     *        Specifically, the user needs the following permissions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        GetObject
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PutObject
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html">Actions,
     *        Resources, and Condition Keys for Amazon S3</a> in the <i>AWS Identity and Access Management User
     *        Guide</i>.
     */

    public void setLogDeliveryBucket(String logDeliveryBucket) {
        this.logDeliveryBucket = logDeliveryBucket;
    }

    /**
     * <p>
     * The S3 bucket to which CloudFormation delivers the contract test execution logs.
     * </p>
     * <p>
     * CloudFormation delivers the logs by the time contract testing has completed and the extension has been assigned a
     * test type status of <code>PASSED</code> or <code>FAILED</code>.
     * </p>
     * <p>
     * The user calling <code>TestType</code> must be able to access items in the specified S3 bucket. Specifically, the
     * user needs the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetObject
     * </p>
     * </li>
     * <li>
     * <p>
     * PutObject
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html">Actions, Resources,
     * and Condition Keys for Amazon S3</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @return The S3 bucket to which CloudFormation delivers the contract test execution logs.</p>
     *         <p>
     *         CloudFormation delivers the logs by the time contract testing has completed and the extension has been
     *         assigned a test type status of <code>PASSED</code> or <code>FAILED</code>.
     *         </p>
     *         <p>
     *         The user calling <code>TestType</code> must be able to access items in the specified S3 bucket.
     *         Specifically, the user needs the following permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         GetObject
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PutObject
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html">Actions,
     *         Resources, and Condition Keys for Amazon S3</a> in the <i>AWS Identity and Access Management User
     *         Guide</i>.
     */

    public String getLogDeliveryBucket() {
        return this.logDeliveryBucket;
    }

    /**
     * <p>
     * The S3 bucket to which CloudFormation delivers the contract test execution logs.
     * </p>
     * <p>
     * CloudFormation delivers the logs by the time contract testing has completed and the extension has been assigned a
     * test type status of <code>PASSED</code> or <code>FAILED</code>.
     * </p>
     * <p>
     * The user calling <code>TestType</code> must be able to access items in the specified S3 bucket. Specifically, the
     * user needs the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * GetObject
     * </p>
     * </li>
     * <li>
     * <p>
     * PutObject
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html">Actions, Resources,
     * and Condition Keys for Amazon S3</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param logDeliveryBucket
     *        The S3 bucket to which CloudFormation delivers the contract test execution logs.</p>
     *        <p>
     *        CloudFormation delivers the logs by the time contract testing has completed and the extension has been
     *        assigned a test type status of <code>PASSED</code> or <code>FAILED</code>.
     *        </p>
     *        <p>
     *        The user calling <code>TestType</code> must be able to access items in the specified S3 bucket.
     *        Specifically, the user needs the following permissions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        GetObject
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PutObject
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html">Actions,
     *        Resources, and Condition Keys for Amazon S3</a> in the <i>AWS Identity and Access Management User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestTypeRequest withLogDeliveryBucket(String logDeliveryBucket) {
        setLogDeliveryBucket(logDeliveryBucket);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getLogDeliveryBucket() != null)
            sb.append("LogDeliveryBucket: ").append(getLogDeliveryBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestTypeRequest == false)
            return false;
        TestTypeRequest other = (TestTypeRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getLogDeliveryBucket() == null ^ this.getLogDeliveryBucket() == null)
            return false;
        if (other.getLogDeliveryBucket() != null && other.getLogDeliveryBucket().equals(this.getLogDeliveryBucket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getLogDeliveryBucket() == null) ? 0 : getLogDeliveryBucket().hashCode());
        return hashCode;
    }

    @Override
    public TestTypeRequest clone() {
        return (TestTypeRequest) super.clone();
    }

}
