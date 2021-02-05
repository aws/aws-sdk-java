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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateDataCatalog" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataCatalogRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum
     * of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of data catalog to create: <code>LAMBDA</code> for a federated catalog or <code>HIVE</code> for an
     * external hive metastore.
     * </p>
     * <note>
     * <p>
     * Do not use the <code>GLUE</code> type. This refers to the <code>AwsDataCatalog</code> that already exists in your
     * account, of which you can have only one. Specifying the <code>GLUE</code> type will result in an
     * <code>INVALID_INPUT</code> error.
     * </p>
     * </note>
     */
    private String type;
    /**
     * <p>
     * A description of the data catalog to be created.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose values
     * depend on the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     * parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently supported
     * version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but not
     * both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for reading the actual data, use the
     * following syntax. Both parameters are required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and data, use the following syntax to
     * specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * A list of comma separated tags to add to the data catalog that is created.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum
     * of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * </p>
     * 
     * @param name
     *        The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a
     *        maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum
     * of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * </p>
     * 
     * @return The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a
     *         maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum
     * of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * </p>
     * 
     * @param name
     *        The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a
     *        maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataCatalogRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of data catalog to create: <code>LAMBDA</code> for a federated catalog or <code>HIVE</code> for an
     * external hive metastore.
     * </p>
     * <note>
     * <p>
     * Do not use the <code>GLUE</code> type. This refers to the <code>AwsDataCatalog</code> that already exists in your
     * account, of which you can have only one. Specifying the <code>GLUE</code> type will result in an
     * <code>INVALID_INPUT</code> error.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of data catalog to create: <code>LAMBDA</code> for a federated catalog or <code>HIVE</code> for
     *        an external hive metastore.</p> <note>
     *        <p>
     *        Do not use the <code>GLUE</code> type. This refers to the <code>AwsDataCatalog</code> that already exists
     *        in your account, of which you can have only one. Specifying the <code>GLUE</code> type will result in an
     *        <code>INVALID_INPUT</code> error.
     *        </p>
     * @see DataCatalogType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data catalog to create: <code>LAMBDA</code> for a federated catalog or <code>HIVE</code> for an
     * external hive metastore.
     * </p>
     * <note>
     * <p>
     * Do not use the <code>GLUE</code> type. This refers to the <code>AwsDataCatalog</code> that already exists in your
     * account, of which you can have only one. Specifying the <code>GLUE</code> type will result in an
     * <code>INVALID_INPUT</code> error.
     * </p>
     * </note>
     * 
     * @return The type of data catalog to create: <code>LAMBDA</code> for a federated catalog or <code>HIVE</code> for
     *         an external hive metastore.</p> <note>
     *         <p>
     *         Do not use the <code>GLUE</code> type. This refers to the <code>AwsDataCatalog</code> that already exists
     *         in your account, of which you can have only one. Specifying the <code>GLUE</code> type will result in an
     *         <code>INVALID_INPUT</code> error.
     *         </p>
     * @see DataCatalogType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of data catalog to create: <code>LAMBDA</code> for a federated catalog or <code>HIVE</code> for an
     * external hive metastore.
     * </p>
     * <note>
     * <p>
     * Do not use the <code>GLUE</code> type. This refers to the <code>AwsDataCatalog</code> that already exists in your
     * account, of which you can have only one. Specifying the <code>GLUE</code> type will result in an
     * <code>INVALID_INPUT</code> error.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of data catalog to create: <code>LAMBDA</code> for a federated catalog or <code>HIVE</code> for
     *        an external hive metastore.</p> <note>
     *        <p>
     *        Do not use the <code>GLUE</code> type. This refers to the <code>AwsDataCatalog</code> that already exists
     *        in your account, of which you can have only one. Specifying the <code>GLUE</code> type will result in an
     *        <code>INVALID_INPUT</code> error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataCatalogType
     */

    public CreateDataCatalogRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of data catalog to create: <code>LAMBDA</code> for a federated catalog or <code>HIVE</code> for an
     * external hive metastore.
     * </p>
     * <note>
     * <p>
     * Do not use the <code>GLUE</code> type. This refers to the <code>AwsDataCatalog</code> that already exists in your
     * account, of which you can have only one. Specifying the <code>GLUE</code> type will result in an
     * <code>INVALID_INPUT</code> error.
     * </p>
     * </note>
     * 
     * @param type
     *        The type of data catalog to create: <code>LAMBDA</code> for a federated catalog or <code>HIVE</code> for
     *        an external hive metastore.</p> <note>
     *        <p>
     *        Do not use the <code>GLUE</code> type. This refers to the <code>AwsDataCatalog</code> that already exists
     *        in your account, of which you can have only one. Specifying the <code>GLUE</code> type will result in an
     *        <code>INVALID_INPUT</code> error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataCatalogType
     */

    public CreateDataCatalogRequest withType(DataCatalogType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A description of the data catalog to be created.
     * </p>
     * 
     * @param description
     *        A description of the data catalog to be created.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the data catalog to be created.
     * </p>
     * 
     * @return A description of the data catalog to be created.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the data catalog to be created.
     * </p>
     * 
     * @param description
     *        A description of the data catalog to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataCatalogRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose values
     * depend on the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     * parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently supported
     * version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but not
     * both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for reading the actual data, use the
     * following syntax. Both parameters are required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and data, use the following syntax to
     * specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose
     *         values depend on the catalog type. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     *         parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently
     *         supported version.
     *         </p>
     *         <p>
     *         <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but
     *         not both.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you have one Lambda function that processes metadata and another for reading the actual data, use the
     *         following syntax. Both parameters are required.
     *         </p>
     *         <p>
     *         <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you have a composite Lambda function that processes both metadata and data, use the following syntax
     *         to specify your Lambda function.
     *         </p>
     *         <p>
     *         <code>function=<i>lambda_arn</i> </code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose values
     * depend on the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     * parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently supported
     * version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but not
     * both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for reading the actual data, use the
     * following syntax. Both parameters are required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and data, use the following syntax to
     * specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param parameters
     *        Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose
     *        values depend on the catalog type. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     *        parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently
     *        supported version.
     *        </p>
     *        <p>
     *        <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but
     *        not both.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you have one Lambda function that processes metadata and another for reading the actual data, use the
     *        following syntax. Both parameters are required.
     *        </p>
     *        <p>
     *        <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have a composite Lambda function that processes both metadata and data, use the following syntax to
     *        specify your Lambda function.
     *        </p>
     *        <p>
     *        <code>function=<i>lambda_arn</i> </code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose values
     * depend on the catalog type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     * parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently supported
     * version.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but not
     * both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have one Lambda function that processes metadata and another for reading the actual data, use the
     * following syntax. Both parameters are required.
     * </p>
     * <p>
     * <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have a composite Lambda function that processes both metadata and data, use the following syntax to
     * specify your Lambda function.
     * </p>
     * <p>
     * <code>function=<i>lambda_arn</i> </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param parameters
     *        Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose
     *        values depend on the catalog type. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>HIVE</code> data catalog type, use the following syntax. The <code>metadata-function</code>
     *        parameter is required. <code>The sdk-version</code> parameter is optional and defaults to the currently
     *        supported version.
     *        </p>
     *        <p>
     *        <code>metadata-function=<i>lambda_arn</i>, sdk-version=<i>version_number</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>LAMBDA</code> data catalog type, use one of the following sets of required parameters, but
     *        not both.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you have one Lambda function that processes metadata and another for reading the actual data, use the
     *        following syntax. Both parameters are required.
     *        </p>
     *        <p>
     *        <code>metadata-function=<i>lambda_arn</i>, record-function=<i>lambda_arn</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have a composite Lambda function that processes both metadata and data, use the following syntax to
     *        specify your Lambda function.
     *        </p>
     *        <p>
     *        <code>function=<i>lambda_arn</i> </code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataCatalogRequest withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see CreateDataCatalogRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataCatalogRequest addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataCatalogRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * A list of comma separated tags to add to the data catalog that is created.
     * </p>
     * 
     * @return A list of comma separated tags to add to the data catalog that is created.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of comma separated tags to add to the data catalog that is created.
     * </p>
     * 
     * @param tags
     *        A list of comma separated tags to add to the data catalog that is created.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of comma separated tags to add to the data catalog that is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of comma separated tags to add to the data catalog that is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataCatalogRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of comma separated tags to add to the data catalog that is created.
     * </p>
     * 
     * @param tags
     *        A list of comma separated tags to add to the data catalog that is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataCatalogRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataCatalogRequest == false)
            return false;
        CreateDataCatalogRequest other = (CreateDataCatalogRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataCatalogRequest clone() {
        return (CreateDataCatalogRequest) super.clone();
    }

}
