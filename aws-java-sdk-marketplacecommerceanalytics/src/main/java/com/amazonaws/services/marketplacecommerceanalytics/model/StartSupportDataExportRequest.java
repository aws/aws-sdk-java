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
package com.amazonaws.services.marketplacecommerceanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the StartSupportDataExport operation.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplacecommerceanalytics-2015-07-01/StartSupportDataExport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSupportDataExportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the data set type to be written to the output csv file. The data set types
     * customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file containing the
     * following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription Start Date,
     * Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country Code, ZIP Code,
     * Operation Type, and Operation Time.
     * </p>
     * <p>
     * <ul>
     * <li><i>customer_support_contacts_data</i> Customer support contact data. The data set will contain all changes
     * (Creates, Updates, and Deletes) to customer support contact data from the date specified in the from_date
     * parameter.</li>
     * <li><i>test_customer_support_contacts_data</i> An example data set containing static test data in the same format
     * as customer_support_contacts_data</li>
     * </ul>
     * </p>
     */
    private String dataSetType;
    /**
     * The start date from which to retrieve the data set in UTC. This parameter only affects the
     * customer_support_contacts_data data set type.
     */
    private java.util.Date fromDate;
    /**
     * The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the provided AWS
     * services.
     */
    private String roleNameArn;
    /** The name (friendly name, not ARN) of the destination S3 bucket. */
    private String destinationS3BucketName;
    /**
     * (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     * systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output file
     * "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix directory
     * structure does not exist, it will be created. If no prefix is provided, the data set will be published to the S3
     * bucket root.
     */
    private String destinationS3Prefix;
    /**
     * Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or if an
     * error has occurred.
     */
    private String snsTopicArn;
    /**
     * (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and the
     * data set metadata file.
     */
    private java.util.Map<String, String> customerDefinedValues;

    /**
     * <p>
     * Specifies the data set type to be written to the output csv file. The data set types
     * customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file containing the
     * following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription Start Date,
     * Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country Code, ZIP Code,
     * Operation Type, and Operation Time.
     * </p>
     * <p>
     * <ul>
     * <li><i>customer_support_contacts_data</i> Customer support contact data. The data set will contain all changes
     * (Creates, Updates, and Deletes) to customer support contact data from the date specified in the from_date
     * parameter.</li>
     * <li><i>test_customer_support_contacts_data</i> An example data set containing static test data in the same format
     * as customer_support_contacts_data</li>
     * </ul>
     * </p>
     * 
     * @param dataSetType
     *        Specifies the data set type to be written to the output csv file. The data set types
     *        customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file
     *        containing the following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription
     *        Start Date, Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country
     *        Code, ZIP Code, Operation Type, and Operation Time. </p>
     *        <p>
     *        <ul>
     *        <li><i>customer_support_contacts_data</i> Customer support contact data. The data set will contain all
     *        changes (Creates, Updates, and Deletes) to customer support contact data from the date specified in the
     *        from_date parameter.</li>
     *        <li><i>test_customer_support_contacts_data</i> An example data set containing static test data in the same
     *        format as customer_support_contacts_data</li>
     *        </ul>
     * @see SupportDataSetType
     */

    public void setDataSetType(String dataSetType) {
        this.dataSetType = dataSetType;
    }

    /**
     * <p>
     * Specifies the data set type to be written to the output csv file. The data set types
     * customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file containing the
     * following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription Start Date,
     * Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country Code, ZIP Code,
     * Operation Type, and Operation Time.
     * </p>
     * <p>
     * <ul>
     * <li><i>customer_support_contacts_data</i> Customer support contact data. The data set will contain all changes
     * (Creates, Updates, and Deletes) to customer support contact data from the date specified in the from_date
     * parameter.</li>
     * <li><i>test_customer_support_contacts_data</i> An example data set containing static test data in the same format
     * as customer_support_contacts_data</li>
     * </ul>
     * </p>
     * 
     * @return Specifies the data set type to be written to the output csv file. The data set types
     *         customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file
     *         containing the following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription
     *         Start Date, Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country
     *         Code, ZIP Code, Operation Type, and Operation Time. </p>
     *         <p>
     *         <ul>
     *         <li><i>customer_support_contacts_data</i> Customer support contact data. The data set will contain all
     *         changes (Creates, Updates, and Deletes) to customer support contact data from the date specified in the
     *         from_date parameter.</li>
     *         <li><i>test_customer_support_contacts_data</i> An example data set containing static test data in the
     *         same format as customer_support_contacts_data</li>
     *         </ul>
     * @see SupportDataSetType
     */

    public String getDataSetType() {
        return this.dataSetType;
    }

    /**
     * <p>
     * Specifies the data set type to be written to the output csv file. The data set types
     * customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file containing the
     * following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription Start Date,
     * Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country Code, ZIP Code,
     * Operation Type, and Operation Time.
     * </p>
     * <p>
     * <ul>
     * <li><i>customer_support_contacts_data</i> Customer support contact data. The data set will contain all changes
     * (Creates, Updates, and Deletes) to customer support contact data from the date specified in the from_date
     * parameter.</li>
     * <li><i>test_customer_support_contacts_data</i> An example data set containing static test data in the same format
     * as customer_support_contacts_data</li>
     * </ul>
     * </p>
     * 
     * @param dataSetType
     *        Specifies the data set type to be written to the output csv file. The data set types
     *        customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file
     *        containing the following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription
     *        Start Date, Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country
     *        Code, ZIP Code, Operation Type, and Operation Time. </p>
     *        <p>
     *        <ul>
     *        <li><i>customer_support_contacts_data</i> Customer support contact data. The data set will contain all
     *        changes (Creates, Updates, and Deletes) to customer support contact data from the date specified in the
     *        from_date parameter.</li>
     *        <li><i>test_customer_support_contacts_data</i> An example data set containing static test data in the same
     *        format as customer_support_contacts_data</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportDataSetType
     */

    public StartSupportDataExportRequest withDataSetType(String dataSetType) {
        setDataSetType(dataSetType);
        return this;
    }

    /**
     * <p>
     * Specifies the data set type to be written to the output csv file. The data set types
     * customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file containing the
     * following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription Start Date,
     * Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country Code, ZIP Code,
     * Operation Type, and Operation Time.
     * </p>
     * <p>
     * <ul>
     * <li><i>customer_support_contacts_data</i> Customer support contact data. The data set will contain all changes
     * (Creates, Updates, and Deletes) to customer support contact data from the date specified in the from_date
     * parameter.</li>
     * <li><i>test_customer_support_contacts_data</i> An example data set containing static test data in the same format
     * as customer_support_contacts_data</li>
     * </ul>
     * </p>
     * 
     * @param dataSetType
     *        Specifies the data set type to be written to the output csv file. The data set types
     *        customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file
     *        containing the following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription
     *        Start Date, Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country
     *        Code, ZIP Code, Operation Type, and Operation Time. </p>
     *        <p>
     *        <ul>
     *        <li><i>customer_support_contacts_data</i> Customer support contact data. The data set will contain all
     *        changes (Creates, Updates, and Deletes) to customer support contact data from the date specified in the
     *        from_date parameter.</li>
     *        <li><i>test_customer_support_contacts_data</i> An example data set containing static test data in the same
     *        format as customer_support_contacts_data</li>
     *        </ul>
     * @see SupportDataSetType
     */

    public void setDataSetType(SupportDataSetType dataSetType) {
        withDataSetType(dataSetType);
    }

    /**
     * <p>
     * Specifies the data set type to be written to the output csv file. The data set types
     * customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file containing the
     * following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription Start Date,
     * Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country Code, ZIP Code,
     * Operation Type, and Operation Time.
     * </p>
     * <p>
     * <ul>
     * <li><i>customer_support_contacts_data</i> Customer support contact data. The data set will contain all changes
     * (Creates, Updates, and Deletes) to customer support contact data from the date specified in the from_date
     * parameter.</li>
     * <li><i>test_customer_support_contacts_data</i> An example data set containing static test data in the same format
     * as customer_support_contacts_data</li>
     * </ul>
     * </p>
     * 
     * @param dataSetType
     *        Specifies the data set type to be written to the output csv file. The data set types
     *        customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file
     *        containing the following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription
     *        Start Date, Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country
     *        Code, ZIP Code, Operation Type, and Operation Time. </p>
     *        <p>
     *        <ul>
     *        <li><i>customer_support_contacts_data</i> Customer support contact data. The data set will contain all
     *        changes (Creates, Updates, and Deletes) to customer support contact data from the date specified in the
     *        from_date parameter.</li>
     *        <li><i>test_customer_support_contacts_data</i> An example data set containing static test data in the same
     *        format as customer_support_contacts_data</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportDataSetType
     */

    public StartSupportDataExportRequest withDataSetType(SupportDataSetType dataSetType) {
        this.dataSetType = dataSetType.toString();
        return this;
    }

    /**
     * The start date from which to retrieve the data set in UTC. This parameter only affects the
     * customer_support_contacts_data data set type.
     * 
     * @param fromDate
     *        The start date from which to retrieve the data set in UTC. This parameter only affects the
     *        customer_support_contacts_data data set type.
     */

    public void setFromDate(java.util.Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * The start date from which to retrieve the data set in UTC. This parameter only affects the
     * customer_support_contacts_data data set type.
     * 
     * @return The start date from which to retrieve the data set in UTC. This parameter only affects the
     *         customer_support_contacts_data data set type.
     */

    public java.util.Date getFromDate() {
        return this.fromDate;
    }

    /**
     * The start date from which to retrieve the data set in UTC. This parameter only affects the
     * customer_support_contacts_data data set type.
     * 
     * @param fromDate
     *        The start date from which to retrieve the data set in UTC. This parameter only affects the
     *        customer_support_contacts_data data set type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSupportDataExportRequest withFromDate(java.util.Date fromDate) {
        setFromDate(fromDate);
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the provided AWS
     * services.
     * 
     * @param roleNameArn
     *        The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the
     *        provided AWS services.
     */

    public void setRoleNameArn(String roleNameArn) {
        this.roleNameArn = roleNameArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the provided AWS
     * services.
     * 
     * @return The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the
     *         provided AWS services.
     */

    public String getRoleNameArn() {
        return this.roleNameArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the provided AWS
     * services.
     * 
     * @param roleNameArn
     *        The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the
     *        provided AWS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSupportDataExportRequest withRoleNameArn(String roleNameArn) {
        setRoleNameArn(roleNameArn);
        return this;
    }

    /**
     * The name (friendly name, not ARN) of the destination S3 bucket.
     * 
     * @param destinationS3BucketName
     *        The name (friendly name, not ARN) of the destination S3 bucket.
     */

    public void setDestinationS3BucketName(String destinationS3BucketName) {
        this.destinationS3BucketName = destinationS3BucketName;
    }

    /**
     * The name (friendly name, not ARN) of the destination S3 bucket.
     * 
     * @return The name (friendly name, not ARN) of the destination S3 bucket.
     */

    public String getDestinationS3BucketName() {
        return this.destinationS3BucketName;
    }

    /**
     * The name (friendly name, not ARN) of the destination S3 bucket.
     * 
     * @param destinationS3BucketName
     *        The name (friendly name, not ARN) of the destination S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSupportDataExportRequest withDestinationS3BucketName(String destinationS3BucketName) {
        setDestinationS3BucketName(destinationS3BucketName);
        return this;
    }

    /**
     * (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     * systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output file
     * "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix directory
     * structure does not exist, it will be created. If no prefix is provided, the data set will be published to the S3
     * bucket root.
     * 
     * @param destinationS3Prefix
     *        (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     *        systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output
     *        file "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix
     *        directory structure does not exist, it will be created. If no prefix is provided, the data set will be
     *        published to the S3 bucket root.
     */

    public void setDestinationS3Prefix(String destinationS3Prefix) {
        this.destinationS3Prefix = destinationS3Prefix;
    }

    /**
     * (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     * systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output file
     * "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix directory
     * structure does not exist, it will be created. If no prefix is provided, the data set will be published to the S3
     * bucket root.
     * 
     * @return (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     *         systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the
     *         output file "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the
     *         prefix directory structure does not exist, it will be created. If no prefix is provided, the data set
     *         will be published to the S3 bucket root.
     */

    public String getDestinationS3Prefix() {
        return this.destinationS3Prefix;
    }

    /**
     * (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     * systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output file
     * "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix directory
     * structure does not exist, it will be created. If no prefix is provided, the data set will be published to the S3
     * bucket root.
     * 
     * @param destinationS3Prefix
     *        (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file
     *        systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output
     *        file "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix
     *        directory structure does not exist, it will be created. If no prefix is provided, the data set will be
     *        published to the S3 bucket root.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSupportDataExportRequest withDestinationS3Prefix(String destinationS3Prefix) {
        setDestinationS3Prefix(destinationS3Prefix);
        return this;
    }

    /**
     * Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or if an
     * error has occurred.
     * 
     * @param snsTopicArn
     *        Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or
     *        if an error has occurred.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or if an
     * error has occurred.
     * 
     * @return Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published
     *         or if an error has occurred.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or if an
     * error has occurred.
     * 
     * @param snsTopicArn
     *        Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or
     *        if an error has occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSupportDataExportRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and the
     * data set metadata file.
     * 
     * @return (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and
     *         the data set metadata file.
     */

    public java.util.Map<String, String> getCustomerDefinedValues() {
        return customerDefinedValues;
    }

    /**
     * (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and the
     * data set metadata file.
     * 
     * @param customerDefinedValues
     *        (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and
     *        the data set metadata file.
     */

    public void setCustomerDefinedValues(java.util.Map<String, String> customerDefinedValues) {
        this.customerDefinedValues = customerDefinedValues;
    }

    /**
     * (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and the
     * data set metadata file.
     * 
     * @param customerDefinedValues
     *        (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and
     *        the data set metadata file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSupportDataExportRequest withCustomerDefinedValues(java.util.Map<String, String> customerDefinedValues) {
        setCustomerDefinedValues(customerDefinedValues);
        return this;
    }

    public StartSupportDataExportRequest addCustomerDefinedValuesEntry(String key, String value) {
        if (null == this.customerDefinedValues) {
            this.customerDefinedValues = new java.util.HashMap<String, String>();
        }
        if (this.customerDefinedValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.customerDefinedValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CustomerDefinedValues.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSupportDataExportRequest clearCustomerDefinedValuesEntries() {
        this.customerDefinedValues = null;
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
        if (getDataSetType() != null)
            sb.append("DataSetType: ").append(getDataSetType()).append(",");
        if (getFromDate() != null)
            sb.append("FromDate: ").append(getFromDate()).append(",");
        if (getRoleNameArn() != null)
            sb.append("RoleNameArn: ").append(getRoleNameArn()).append(",");
        if (getDestinationS3BucketName() != null)
            sb.append("DestinationS3BucketName: ").append(getDestinationS3BucketName()).append(",");
        if (getDestinationS3Prefix() != null)
            sb.append("DestinationS3Prefix: ").append(getDestinationS3Prefix()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getCustomerDefinedValues() != null)
            sb.append("CustomerDefinedValues: ").append(getCustomerDefinedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSupportDataExportRequest == false)
            return false;
        StartSupportDataExportRequest other = (StartSupportDataExportRequest) obj;
        if (other.getDataSetType() == null ^ this.getDataSetType() == null)
            return false;
        if (other.getDataSetType() != null && other.getDataSetType().equals(this.getDataSetType()) == false)
            return false;
        if (other.getFromDate() == null ^ this.getFromDate() == null)
            return false;
        if (other.getFromDate() != null && other.getFromDate().equals(this.getFromDate()) == false)
            return false;
        if (other.getRoleNameArn() == null ^ this.getRoleNameArn() == null)
            return false;
        if (other.getRoleNameArn() != null && other.getRoleNameArn().equals(this.getRoleNameArn()) == false)
            return false;
        if (other.getDestinationS3BucketName() == null ^ this.getDestinationS3BucketName() == null)
            return false;
        if (other.getDestinationS3BucketName() != null && other.getDestinationS3BucketName().equals(this.getDestinationS3BucketName()) == false)
            return false;
        if (other.getDestinationS3Prefix() == null ^ this.getDestinationS3Prefix() == null)
            return false;
        if (other.getDestinationS3Prefix() != null && other.getDestinationS3Prefix().equals(this.getDestinationS3Prefix()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getCustomerDefinedValues() == null ^ this.getCustomerDefinedValues() == null)
            return false;
        if (other.getCustomerDefinedValues() != null && other.getCustomerDefinedValues().equals(this.getCustomerDefinedValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetType() == null) ? 0 : getDataSetType().hashCode());
        hashCode = prime * hashCode + ((getFromDate() == null) ? 0 : getFromDate().hashCode());
        hashCode = prime * hashCode + ((getRoleNameArn() == null) ? 0 : getRoleNameArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationS3BucketName() == null) ? 0 : getDestinationS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getDestinationS3Prefix() == null) ? 0 : getDestinationS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getCustomerDefinedValues() == null) ? 0 : getCustomerDefinedValues().hashCode());
        return hashCode;
    }

    @Override
    public StartSupportDataExportRequest clone() {
        return (StartSupportDataExportRequest) super.clone();
    }

}
