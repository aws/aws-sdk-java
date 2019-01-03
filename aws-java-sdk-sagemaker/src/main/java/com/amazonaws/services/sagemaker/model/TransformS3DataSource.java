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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the S3 data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TransformS3DataSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformS3DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all
     * objects with the specified key name prefix for batch transform.
     * </p>
     * <p>
     * If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     * containing a list of object keys that you want Amazon SageMaker to use for batch transform.
     * </p>
     */
    private String s3DataType;
    /**
     * <p>
     * Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or a
     * manifest. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     * </p>
     * <p>
     * The manifest is an S3 object which is a JSON file with the following format:
     * </p>
     * <p>
     * <code>[</code>
     * </p>
     * <p>
     * <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     * </p>
     * <p>
     * <code> "relative/path/to/custdata-1",</code>
     * </p>
     * <p>
     * <code> "relative/path/custdata-2",</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * The preceding JSON matches the following <code>S3Uris</code>:
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/custdata-1</code>
     * </p>
     * <p>
     * <code>...</code>
     * </p>
     * <p>
     * The complete set of <code>S3Uris</code> in this manifest constitutes the input data for the channel for this
     * datasource. The object that each <code>S3Uris</code> points to must be readable by the IAM role that Amazon
     * SageMaker uses to perform tasks on your behalf.
     * </p>
     * </li>
     * </ul>
     */
    private String s3Uri;

    /**
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all
     * objects with the specified key name prefix for batch transform.
     * </p>
     * <p>
     * If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     * containing a list of object keys that you want Amazon SageMaker to use for batch transform.
     * </p>
     * 
     * @param s3DataType
     *        If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker
     *        uses all objects with the specified key name prefix for batch transform. </p>
     *        <p>
     *        If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     *        containing a list of object keys that you want Amazon SageMaker to use for batch transform.
     * @see S3DataType
     */

    public void setS3DataType(String s3DataType) {
        this.s3DataType = s3DataType;
    }

    /**
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all
     * objects with the specified key name prefix for batch transform.
     * </p>
     * <p>
     * If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     * containing a list of object keys that you want Amazon SageMaker to use for batch transform.
     * </p>
     * 
     * @return If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker
     *         uses all objects with the specified key name prefix for batch transform. </p>
     *         <p>
     *         If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     *         containing a list of object keys that you want Amazon SageMaker to use for batch transform.
     * @see S3DataType
     */

    public String getS3DataType() {
        return this.s3DataType;
    }

    /**
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all
     * objects with the specified key name prefix for batch transform.
     * </p>
     * <p>
     * If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     * containing a list of object keys that you want Amazon SageMaker to use for batch transform.
     * </p>
     * 
     * @param s3DataType
     *        If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker
     *        uses all objects with the specified key name prefix for batch transform. </p>
     *        <p>
     *        If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     *        containing a list of object keys that you want Amazon SageMaker to use for batch transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3DataType
     */

    public TransformS3DataSource withS3DataType(String s3DataType) {
        setS3DataType(s3DataType);
        return this;
    }

    /**
     * <p>
     * If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses all
     * objects with the specified key name prefix for batch transform.
     * </p>
     * <p>
     * If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     * containing a list of object keys that you want Amazon SageMaker to use for batch transform.
     * </p>
     * 
     * @param s3DataType
     *        If you choose <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker
     *        uses all objects with the specified key name prefix for batch transform. </p>
     *        <p>
     *        If you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an object that is a manifest file
     *        containing a list of object keys that you want Amazon SageMaker to use for batch transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3DataType
     */

    public TransformS3DataSource withS3DataType(S3DataType s3DataType) {
        this.s3DataType = s3DataType.toString();
        return this;
    }

    /**
     * <p>
     * Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or a
     * manifest. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     * </p>
     * <p>
     * The manifest is an S3 object which is a JSON file with the following format:
     * </p>
     * <p>
     * <code>[</code>
     * </p>
     * <p>
     * <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     * </p>
     * <p>
     * <code> "relative/path/to/custdata-1",</code>
     * </p>
     * <p>
     * <code> "relative/path/custdata-2",</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * The preceding JSON matches the following <code>S3Uris</code>:
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/custdata-1</code>
     * </p>
     * <p>
     * <code>...</code>
     * </p>
     * <p>
     * The complete set of <code>S3Uris</code> in this manifest constitutes the input data for the channel for this
     * datasource. The object that each <code>S3Uris</code> points to must be readable by the IAM role that Amazon
     * SageMaker uses to perform tasks on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @param s3Uri
     *        Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or a
     *        manifest. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     *        </p>
     *        <p>
     *        The manifest is an S3 object which is a JSON file with the following format:
     *        </p>
     *        <p>
     *        <code>[</code>
     *        </p>
     *        <p>
     *        <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     *        </p>
     *        <p>
     *        <code> "relative/path/to/custdata-1",</code>
     *        </p>
     *        <p>
     *        <code> "relative/path/custdata-2",</code>
     *        </p>
     *        <p>
     *        <code> ...</code>
     *        </p>
     *        <p>
     *        <code> ]</code>
     *        </p>
     *        <p>
     *        The preceding JSON matches the following <code>S3Uris</code>:
     *        </p>
     *        <p>
     *        <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     *        </p>
     *        <p>
     *        <code>s3://customer_bucket/some/prefix/relative/path/custdata-1</code>
     *        </p>
     *        <p>
     *        <code>...</code>
     *        </p>
     *        <p>
     *        The complete set of <code>S3Uris</code> in this manifest constitutes the input data for the channel for
     *        this datasource. The object that each <code>S3Uris</code> points to must be readable by the IAM role that
     *        Amazon SageMaker uses to perform tasks on your behalf.
     *        </p>
     *        </li>
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or a
     * manifest. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     * </p>
     * <p>
     * The manifest is an S3 object which is a JSON file with the following format:
     * </p>
     * <p>
     * <code>[</code>
     * </p>
     * <p>
     * <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     * </p>
     * <p>
     * <code> "relative/path/to/custdata-1",</code>
     * </p>
     * <p>
     * <code> "relative/path/custdata-2",</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * The preceding JSON matches the following <code>S3Uris</code>:
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/custdata-1</code>
     * </p>
     * <p>
     * <code>...</code>
     * </p>
     * <p>
     * The complete set of <code>S3Uris</code> in this manifest constitutes the input data for the channel for this
     * datasource. The object that each <code>S3Uris</code> points to must be readable by the IAM role that Amazon
     * SageMaker uses to perform tasks on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or
     *         a manifest. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     *         </p>
     *         <p>
     *         The manifest is an S3 object which is a JSON file with the following format:
     *         </p>
     *         <p>
     *         <code>[</code>
     *         </p>
     *         <p>
     *         <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     *         </p>
     *         <p>
     *         <code> "relative/path/to/custdata-1",</code>
     *         </p>
     *         <p>
     *         <code> "relative/path/custdata-2",</code>
     *         </p>
     *         <p>
     *         <code> ...</code>
     *         </p>
     *         <p>
     *         <code> ]</code>
     *         </p>
     *         <p>
     *         The preceding JSON matches the following <code>S3Uris</code>:
     *         </p>
     *         <p>
     *         <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     *         </p>
     *         <p>
     *         <code>s3://customer_bucket/some/prefix/relative/path/custdata-1</code>
     *         </p>
     *         <p>
     *         <code>...</code>
     *         </p>
     *         <p>
     *         The complete set of <code>S3Uris</code> in this manifest constitutes the input data for the channel for
     *         this datasource. The object that each <code>S3Uris</code> points to must be readable by the IAM role that
     *         Amazon SageMaker uses to perform tasks on your behalf.
     *         </p>
     *         </li>
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or a
     * manifest. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     * </p>
     * <p>
     * The manifest is an S3 object which is a JSON file with the following format:
     * </p>
     * <p>
     * <code>[</code>
     * </p>
     * <p>
     * <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     * </p>
     * <p>
     * <code> "relative/path/to/custdata-1",</code>
     * </p>
     * <p>
     * <code> "relative/path/custdata-2",</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * The preceding JSON matches the following <code>S3Uris</code>:
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     * </p>
     * <p>
     * <code>s3://customer_bucket/some/prefix/relative/path/custdata-1</code>
     * </p>
     * <p>
     * <code>...</code>
     * </p>
     * <p>
     * The complete set of <code>S3Uris</code> in this manifest constitutes the input data for the channel for this
     * datasource. The object that each <code>S3Uris</code> points to must be readable by the IAM role that Amazon
     * SageMaker uses to perform tasks on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @param s3Uri
     *        Depending on the value specified for the <code>S3DataType</code>, identifies either a key name prefix or a
     *        manifest. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A key name prefix might look like this: <code>s3://bucketname/exampleprefix</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A manifest might look like this: <code>s3://bucketname/example.manifest</code>
     *        </p>
     *        <p>
     *        The manifest is an S3 object which is a JSON file with the following format:
     *        </p>
     *        <p>
     *        <code>[</code>
     *        </p>
     *        <p>
     *        <code> {"prefix": "s3://customer_bucket/some/prefix/"},</code>
     *        </p>
     *        <p>
     *        <code> "relative/path/to/custdata-1",</code>
     *        </p>
     *        <p>
     *        <code> "relative/path/custdata-2",</code>
     *        </p>
     *        <p>
     *        <code> ...</code>
     *        </p>
     *        <p>
     *        <code> ]</code>
     *        </p>
     *        <p>
     *        The preceding JSON matches the following <code>S3Uris</code>:
     *        </p>
     *        <p>
     *        <code>s3://customer_bucket/some/prefix/relative/path/to/custdata-1</code>
     *        </p>
     *        <p>
     *        <code>s3://customer_bucket/some/prefix/relative/path/custdata-1</code>
     *        </p>
     *        <p>
     *        <code>...</code>
     *        </p>
     *        <p>
     *        The complete set of <code>S3Uris</code> in this manifest constitutes the input data for the channel for
     *        this datasource. The object that each <code>S3Uris</code> points to must be readable by the IAM role that
     *        Amazon SageMaker uses to perform tasks on your behalf.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformS3DataSource withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
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
        if (getS3DataType() != null)
            sb.append("S3DataType: ").append(getS3DataType()).append(",");
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformS3DataSource == false)
            return false;
        TransformS3DataSource other = (TransformS3DataSource) obj;
        if (other.getS3DataType() == null ^ this.getS3DataType() == null)
            return false;
        if (other.getS3DataType() != null && other.getS3DataType().equals(this.getS3DataType()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3DataType() == null) ? 0 : getS3DataType().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public TransformS3DataSource clone() {
        try {
            return (TransformS3DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TransformS3DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
