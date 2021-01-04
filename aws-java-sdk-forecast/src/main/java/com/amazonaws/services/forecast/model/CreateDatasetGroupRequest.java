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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDatasetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the dataset group.
     * </p>
     */
    private String datasetGroupName;
    /**
     * <p>
     * The domain associated with the dataset group. When you add a dataset to a dataset group, this value and the value
     * specified for the <code>Domain</code> parameter of the <a>CreateDataset</a> operation must match.
     * </p>
     * <p>
     * The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be present in
     * training data that you import to a dataset. For example, if you choose the <code>RETAIL</code> domain and
     * <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires that
     * <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields are present in your data. For more
     * information, see <a>howitworks-datasets-groups</a>.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     * </p>
     */
    private java.util.List<String> datasetArns;
    /**
     * <p>
     * The optional metadata that you apply to the dataset group to help you categorize and organize them. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A name for the dataset group.
     * </p>
     * 
     * @param datasetGroupName
     *        A name for the dataset group.
     */

    public void setDatasetGroupName(String datasetGroupName) {
        this.datasetGroupName = datasetGroupName;
    }

    /**
     * <p>
     * A name for the dataset group.
     * </p>
     * 
     * @return A name for the dataset group.
     */

    public String getDatasetGroupName() {
        return this.datasetGroupName;
    }

    /**
     * <p>
     * A name for the dataset group.
     * </p>
     * 
     * @param datasetGroupName
     *        A name for the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetGroupRequest withDatasetGroupName(String datasetGroupName) {
        setDatasetGroupName(datasetGroupName);
        return this;
    }

    /**
     * <p>
     * The domain associated with the dataset group. When you add a dataset to a dataset group, this value and the value
     * specified for the <code>Domain</code> parameter of the <a>CreateDataset</a> operation must match.
     * </p>
     * <p>
     * The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be present in
     * training data that you import to a dataset. For example, if you choose the <code>RETAIL</code> domain and
     * <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires that
     * <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields are present in your data. For more
     * information, see <a>howitworks-datasets-groups</a>.
     * </p>
     * 
     * @param domain
     *        The domain associated with the dataset group. When you add a dataset to a dataset group, this value and
     *        the value specified for the <code>Domain</code> parameter of the <a>CreateDataset</a> operation must
     *        match.</p>
     *        <p>
     *        The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be
     *        present in training data that you import to a dataset. For example, if you choose the <code>RETAIL</code>
     *        domain and <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires that
     *        <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields are present in your data. For
     *        more information, see <a>howitworks-datasets-groups</a>.
     * @see Domain
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain associated with the dataset group. When you add a dataset to a dataset group, this value and the value
     * specified for the <code>Domain</code> parameter of the <a>CreateDataset</a> operation must match.
     * </p>
     * <p>
     * The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be present in
     * training data that you import to a dataset. For example, if you choose the <code>RETAIL</code> domain and
     * <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires that
     * <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields are present in your data. For more
     * information, see <a>howitworks-datasets-groups</a>.
     * </p>
     * 
     * @return The domain associated with the dataset group. When you add a dataset to a dataset group, this value and
     *         the value specified for the <code>Domain</code> parameter of the <a>CreateDataset</a> operation must
     *         match.</p>
     *         <p>
     *         The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be
     *         present in training data that you import to a dataset. For example, if you choose the <code>RETAIL</code>
     *         domain and <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires that
     *         <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields are present in your data.
     *         For more information, see <a>howitworks-datasets-groups</a>.
     * @see Domain
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain associated with the dataset group. When you add a dataset to a dataset group, this value and the value
     * specified for the <code>Domain</code> parameter of the <a>CreateDataset</a> operation must match.
     * </p>
     * <p>
     * The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be present in
     * training data that you import to a dataset. For example, if you choose the <code>RETAIL</code> domain and
     * <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires that
     * <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields are present in your data. For more
     * information, see <a>howitworks-datasets-groups</a>.
     * </p>
     * 
     * @param domain
     *        The domain associated with the dataset group. When you add a dataset to a dataset group, this value and
     *        the value specified for the <code>Domain</code> parameter of the <a>CreateDataset</a> operation must
     *        match.</p>
     *        <p>
     *        The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be
     *        present in training data that you import to a dataset. For example, if you choose the <code>RETAIL</code>
     *        domain and <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires that
     *        <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields are present in your data. For
     *        more information, see <a>howitworks-datasets-groups</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public CreateDatasetGroupRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The domain associated with the dataset group. When you add a dataset to a dataset group, this value and the value
     * specified for the <code>Domain</code> parameter of the <a>CreateDataset</a> operation must match.
     * </p>
     * <p>
     * The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be present in
     * training data that you import to a dataset. For example, if you choose the <code>RETAIL</code> domain and
     * <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires that
     * <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields are present in your data. For more
     * information, see <a>howitworks-datasets-groups</a>.
     * </p>
     * 
     * @param domain
     *        The domain associated with the dataset group. When you add a dataset to a dataset group, this value and
     *        the value specified for the <code>Domain</code> parameter of the <a>CreateDataset</a> operation must
     *        match.</p>
     *        <p>
     *        The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be
     *        present in training data that you import to a dataset. For example, if you choose the <code>RETAIL</code>
     *        domain and <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires that
     *        <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields are present in your data. For
     *        more information, see <a>howitworks-datasets-groups</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public CreateDatasetGroupRequest withDomain(Domain domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     * </p>
     * 
     * @return An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     */

    public java.util.List<String> getDatasetArns() {
        return datasetArns;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     * </p>
     * 
     * @param datasetArns
     *        An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     */

    public void setDatasetArns(java.util.Collection<String> datasetArns) {
        if (datasetArns == null) {
            this.datasetArns = null;
            return;
        }

        this.datasetArns = new java.util.ArrayList<String>(datasetArns);
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetArns(java.util.Collection)} or {@link #withDatasetArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param datasetArns
     *        An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetGroupRequest withDatasetArns(String... datasetArns) {
        if (this.datasetArns == null) {
            setDatasetArns(new java.util.ArrayList<String>(datasetArns.length));
        }
        for (String ele : datasetArns) {
            this.datasetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     * </p>
     * 
     * @param datasetArns
     *        An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetGroupRequest withDatasetArns(java.util.Collection<String> datasetArns) {
        setDatasetArns(datasetArns);
        return this;
    }

    /**
     * <p>
     * The optional metadata that you apply to the dataset group to help you categorize and organize them. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The optional metadata that you apply to the dataset group to help you categorize and organize them. Each
     *         tag consists of a key and an optional value, both of which you define.</p>
     *         <p>
     *         The following basic restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource - 50.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique, and each tag key can have only one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length - 128 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length - 256 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your tagging schema is used across multiple services and resources, remember that other services may
     *         have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *         representable in UTF-8, and the following characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a
     *         prefix for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix.
     *         Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then
     *         Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the
     *         key prefix of <code>aws</code> do not count against your tags per resource limit.
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The optional metadata that you apply to the dataset group to help you categorize and organize them. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The optional metadata that you apply to the dataset group to help you categorize and organize them. Each
     *        tag consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can
     *        have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast
     *        considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix
     *        of <code>aws</code> do not count against your tags per resource limit.
     *        </p>
     *        </li>
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
     * The optional metadata that you apply to the dataset group to help you categorize and organize them. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The optional metadata that you apply to the dataset group to help you categorize and organize them. Each
     *        tag consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can
     *        have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast
     *        considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix
     *        of <code>aws</code> do not count against your tags per resource limit.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetGroupRequest withTags(Tag... tags) {
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
     * The optional metadata that you apply to the dataset group to help you categorize and organize them. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The optional metadata that you apply to the dataset group to help you categorize and organize them. Each
     *        tag consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can
     *        have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast
     *        considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix
     *        of <code>aws</code> do not count against your tags per resource limit.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDatasetGroupName() != null)
            sb.append("DatasetGroupName: ").append(getDatasetGroupName()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDatasetArns() != null)
            sb.append("DatasetArns: ").append(getDatasetArns()).append(",");
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

        if (obj instanceof CreateDatasetGroupRequest == false)
            return false;
        CreateDatasetGroupRequest other = (CreateDatasetGroupRequest) obj;
        if (other.getDatasetGroupName() == null ^ this.getDatasetGroupName() == null)
            return false;
        if (other.getDatasetGroupName() != null && other.getDatasetGroupName().equals(this.getDatasetGroupName()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDatasetArns() == null ^ this.getDatasetArns() == null)
            return false;
        if (other.getDatasetArns() != null && other.getDatasetArns().equals(this.getDatasetArns()) == false)
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

        hashCode = prime * hashCode + ((getDatasetGroupName() == null) ? 0 : getDatasetGroupName().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDatasetArns() == null) ? 0 : getDatasetArns().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetGroupRequest clone() {
        return (CreateDatasetGroupRequest) super.clone();
    }

}
