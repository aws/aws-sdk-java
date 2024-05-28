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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The criteria that determine which findings a rule applies to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AutomationRulesFindingFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationRulesFindingFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a third-party product that generated a finding in Security Hub.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> productArn;
    /**
     * <p>
     * The Amazon Web Services account ID in which a finding was generated.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     */
    private java.util.List<StringFilter> awsAccountId;
    /**
     * <p>
     * The product-specific identifier for a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> id;
    /**
     * <p>
     * The identifier for the solution-specific component that generated a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     */
    private java.util.List<StringFilter> generatorId;
    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier that classify a finding. For a list of
     * namespaces, classifiers, and categories, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     * >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> type;
    /**
     * <p>
     * A timestamp that indicates when the potential security issue captured by a finding was first observed by the
     * security findings product.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<DateFilter> firstObservedAt;
    /**
     * <p>
     * A timestamp that indicates when the potential security issue captured by a finding was most recently observed by
     * the security findings product.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<DateFilter> lastObservedAt;
    /**
     * <p>
     * A timestamp that indicates when this finding record was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<DateFilter> createdAt;
    /**
     * <p>
     * A timestamp that indicates when the finding record was most recently updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<DateFilter> updatedAt;
    /**
     * <p>
     * The likelihood that a finding accurately identifies the behavior or issue that it was intended to identify.
     * <code>Confidence</code> is scored on a 0–100 basis using a ratio scale. A value of <code>0</code> means 0 percent
     * confidence, and a value of <code>100</code> means 100 percent confidence. For example, a data exfiltration
     * detection based on a statistical deviation of network traffic has low confidence because an actual exfiltration
     * hasn't been verified. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence"
     * >Confidence</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<NumberFilter> confidence;
    /**
     * <p>
     * The level of importance that is assigned to the resources that are associated with a finding.
     * <code>Criticality</code> is scored on a 0–100 basis, using a ratio scale that supports only full integers. A
     * score of <code>0</code> means that the underlying resources have no criticality, and a score of <code>100</code>
     * is reserved for the most critical resources. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality"
     * >Criticality</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<NumberFilter> criticality;
    /**
     * <p>
     * A finding's title.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     */
    private java.util.List<StringFilter> title;
    /**
     * <p>
     * A finding's description.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> description;
    /**
     * <p>
     * Provides a URL that links to a page about the current finding in the finding product.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> sourceUrl;
    /**
     * <p>
     * Provides the name of the product that generated the finding. For control-based findings, the product name is
     * Security Hub.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> productName;
    /**
     * <p>
     * The name of the company for the product that generated the finding. For control-based findings, the company is
     * Amazon Web Services.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> companyName;
    /**
     * <p>
     * The severity value of the finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> severityLabel;
    /**
     * <p>
     * The type of resource that the finding pertains to.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> resourceType;
    /**
     * <p>
     * The identifier for the given resource type. For Amazon Web Services resources that are identified by Amazon
     * Resource Names (ARNs), this is the ARN. For Amazon Web Services resources that lack ARNs, this is the identifier
     * as defined by the Amazon Web Service that created the resource. For non-Amazon Web Services resources, this is a
     * unique identifier that is associated with the resource.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     */
    private java.util.List<StringFilter> resourceId;
    /**
     * <p>
     * The partition in which the resource that the finding pertains to is located. A partition is a group of Amazon Web
     * Services Regions. Each Amazon Web Services account is scoped to one partition.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> resourcePartition;
    /**
     * <p>
     * The Amazon Web Services Region where the resource that a finding pertains to is located.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> resourceRegion;
    /**
     * <p>
     * A list of Amazon Web Services tags associated with a resource at the time the finding was processed.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<MapFilter> resourceTags;
    /**
     * <p>
     * Custom fields and values about the resource that a finding pertains to.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<MapFilter> resourceDetailsOther;
    /**
     * <p>
     * The result of a security check. This field is only used for findings generated from controls.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> complianceStatus;
    /**
     * <p>
     * The security control ID for which a finding was generated. Security control IDs are the same across standards.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> complianceSecurityControlId;
    /**
     * <p>
     * The unique identifier of a standard in which a control is enabled. This field consists of the resource portion of
     * the Amazon Resource Name (ARN) returned for a standard in the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html">DescribeStandards</a>
     * API response.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> complianceAssociatedStandardsId;
    /**
     * <p>
     * Provides the veracity of a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> verificationState;
    /**
     * <p>
     * Provides information about the status of the investigation into a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> workflowStatus;
    /**
     * <p>
     * Provides the current state of a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> recordState;
    /**
     * <p>
     * The ARN for the product that generated a related finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> relatedFindingsProductArn;
    /**
     * <p>
     * The product-generated identifier for a related finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> relatedFindingsId;
    /**
     * <p>
     * The text of a user-defined note that's added to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> noteText;
    /**
     * <p>
     * The timestamp of when the note was updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<DateFilter> noteUpdatedAt;
    /**
     * <p>
     * The principal that created a note.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> noteUpdatedBy;
    /**
     * <p>
     * A list of user-defined name and value string pairs added to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<MapFilter> userDefinedFields;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application that is related to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> resourceApplicationArn;
    /**
     * <p>
     * The name of the application that is related to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> resourceApplicationName;
    /**
     * <p>
     * The name of the Amazon Web Services account in which a finding was generated.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     */
    private java.util.List<StringFilter> awsAccountName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a third-party product that generated a finding in Security Hub.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for a third-party product that generated a finding in Security Hub. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getProductArn() {
        return productArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a third-party product that generated a finding in Security Hub.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param productArn
     *        The Amazon Resource Name (ARN) for a third-party product that generated a finding in Security Hub. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setProductArn(java.util.Collection<StringFilter> productArn) {
        if (productArn == null) {
            this.productArn = null;
            return;
        }

        this.productArn = new java.util.ArrayList<StringFilter>(productArn);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a third-party product that generated a finding in Security Hub.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductArn(java.util.Collection)} or {@link #withProductArn(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productArn
     *        The Amazon Resource Name (ARN) for a third-party product that generated a finding in Security Hub. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withProductArn(StringFilter... productArn) {
        if (this.productArn == null) {
            setProductArn(new java.util.ArrayList<StringFilter>(productArn.length));
        }
        for (StringFilter ele : productArn) {
            this.productArn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a third-party product that generated a finding in Security Hub.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param productArn
     *        The Amazon Resource Name (ARN) for a third-party product that generated a finding in Security Hub. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withProductArn(java.util.Collection<StringFilter> productArn) {
        setProductArn(productArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID in which a finding was generated.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * 
     * @return The Amazon Web Services account ID in which a finding was generated.</p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 100 items.
     */

    public java.util.List<StringFilter> getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID in which a finding was generated.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID in which a finding was generated.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 100 items.
     */

    public void setAwsAccountId(java.util.Collection<StringFilter> awsAccountId) {
        if (awsAccountId == null) {
            this.awsAccountId = null;
            return;
        }

        this.awsAccountId = new java.util.ArrayList<StringFilter>(awsAccountId);
    }

    /**
     * <p>
     * The Amazon Web Services account ID in which a finding was generated.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAwsAccountId(java.util.Collection)} or {@link #withAwsAccountId(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID in which a finding was generated.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withAwsAccountId(StringFilter... awsAccountId) {
        if (this.awsAccountId == null) {
            setAwsAccountId(new java.util.ArrayList<StringFilter>(awsAccountId.length));
        }
        for (StringFilter ele : awsAccountId) {
            this.awsAccountId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID in which a finding was generated.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID in which a finding was generated.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withAwsAccountId(java.util.Collection<StringFilter> awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The product-specific identifier for a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The product-specific identifier for a finding. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getId() {
        return id;
    }

    /**
     * <p>
     * The product-specific identifier for a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param id
     *        The product-specific identifier for a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setId(java.util.Collection<StringFilter> id) {
        if (id == null) {
            this.id = null;
            return;
        }

        this.id = new java.util.ArrayList<StringFilter>(id);
    }

    /**
     * <p>
     * The product-specific identifier for a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setId(java.util.Collection)} or {@link #withId(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param id
     *        The product-specific identifier for a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withId(StringFilter... id) {
        if (this.id == null) {
            setId(new java.util.ArrayList<StringFilter>(id.length));
        }
        for (StringFilter ele : id) {
            this.id.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The product-specific identifier for a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param id
     *        The product-specific identifier for a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withId(java.util.Collection<StringFilter> id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier for the solution-specific component that generated a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * 
     * @return The identifier for the solution-specific component that generated a finding. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 100 items.
     */

    public java.util.List<StringFilter> getGeneratorId() {
        return generatorId;
    }

    /**
     * <p>
     * The identifier for the solution-specific component that generated a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * 
     * @param generatorId
     *        The identifier for the solution-specific component that generated a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 100 items.
     */

    public void setGeneratorId(java.util.Collection<StringFilter> generatorId) {
        if (generatorId == null) {
            this.generatorId = null;
            return;
        }

        this.generatorId = new java.util.ArrayList<StringFilter>(generatorId);
    }

    /**
     * <p>
     * The identifier for the solution-specific component that generated a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGeneratorId(java.util.Collection)} or {@link #withGeneratorId(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param generatorId
     *        The identifier for the solution-specific component that generated a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withGeneratorId(StringFilter... generatorId) {
        if (this.generatorId == null) {
            setGeneratorId(new java.util.ArrayList<StringFilter>(generatorId.length));
        }
        for (StringFilter ele : generatorId) {
            this.generatorId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier for the solution-specific component that generated a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * 
     * @param generatorId
     *        The identifier for the solution-specific component that generated a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withGeneratorId(java.util.Collection<StringFilter> generatorId) {
        setGeneratorId(generatorId);
        return this;
    }

    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier that classify a finding. For a list of
     * namespaces, classifiers, and categories, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     * >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return One or more finding types in the format of namespace/category/classifier that classify a finding. For a
     *         list of namespaces, classifiers, and categories, see <a href=
     *         "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     *         >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.</p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getType() {
        return type;
    }

    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier that classify a finding. For a list of
     * namespaces, classifiers, and categories, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     * >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param type
     *        One or more finding types in the format of namespace/category/classifier that classify a finding. For a
     *        list of namespaces, classifiers, and categories, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     *        >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setType(java.util.Collection<StringFilter> type) {
        if (type == null) {
            this.type = null;
            return;
        }

        this.type = new java.util.ArrayList<StringFilter>(type);
    }

    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier that classify a finding. For a list of
     * namespaces, classifiers, and categories, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     * >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setType(java.util.Collection)} or {@link #withType(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param type
     *        One or more finding types in the format of namespace/category/classifier that classify a finding. For a
     *        list of namespaces, classifiers, and categories, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     *        >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withType(StringFilter... type) {
        if (this.type == null) {
            setType(new java.util.ArrayList<StringFilter>(type.length));
        }
        for (StringFilter ele : type) {
            this.type.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier that classify a finding. For a list of
     * namespaces, classifiers, and categories, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     * >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param type
     *        One or more finding types in the format of namespace/category/classifier that classify a finding. For a
     *        list of namespaces, classifiers, and categories, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     *        >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withType(java.util.Collection<StringFilter> type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the potential security issue captured by a finding was first observed by the
     * security findings product.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return A timestamp that indicates when the potential security issue captured by a finding was first observed by
     *         the security findings product. </p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<DateFilter> getFirstObservedAt() {
        return firstObservedAt;
    }

    /**
     * <p>
     * A timestamp that indicates when the potential security issue captured by a finding was first observed by the
     * security findings product.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param firstObservedAt
     *        A timestamp that indicates when the potential security issue captured by a finding was first observed by
     *        the security findings product. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setFirstObservedAt(java.util.Collection<DateFilter> firstObservedAt) {
        if (firstObservedAt == null) {
            this.firstObservedAt = null;
            return;
        }

        this.firstObservedAt = new java.util.ArrayList<DateFilter>(firstObservedAt);
    }

    /**
     * <p>
     * A timestamp that indicates when the potential security issue captured by a finding was first observed by the
     * security findings product.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFirstObservedAt(java.util.Collection)} or {@link #withFirstObservedAt(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param firstObservedAt
     *        A timestamp that indicates when the potential security issue captured by a finding was first observed by
     *        the security findings product. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withFirstObservedAt(DateFilter... firstObservedAt) {
        if (this.firstObservedAt == null) {
            setFirstObservedAt(new java.util.ArrayList<DateFilter>(firstObservedAt.length));
        }
        for (DateFilter ele : firstObservedAt) {
            this.firstObservedAt.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the potential security issue captured by a finding was first observed by the
     * security findings product.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param firstObservedAt
     *        A timestamp that indicates when the potential security issue captured by a finding was first observed by
     *        the security findings product. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withFirstObservedAt(java.util.Collection<DateFilter> firstObservedAt) {
        setFirstObservedAt(firstObservedAt);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the potential security issue captured by a finding was most recently observed by
     * the security findings product.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return A timestamp that indicates when the potential security issue captured by a finding was most recently
     *         observed by the security findings product. </p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<DateFilter> getLastObservedAt() {
        return lastObservedAt;
    }

    /**
     * <p>
     * A timestamp that indicates when the potential security issue captured by a finding was most recently observed by
     * the security findings product.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param lastObservedAt
     *        A timestamp that indicates when the potential security issue captured by a finding was most recently
     *        observed by the security findings product. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setLastObservedAt(java.util.Collection<DateFilter> lastObservedAt) {
        if (lastObservedAt == null) {
            this.lastObservedAt = null;
            return;
        }

        this.lastObservedAt = new java.util.ArrayList<DateFilter>(lastObservedAt);
    }

    /**
     * <p>
     * A timestamp that indicates when the potential security issue captured by a finding was most recently observed by
     * the security findings product.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLastObservedAt(java.util.Collection)} or {@link #withLastObservedAt(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param lastObservedAt
     *        A timestamp that indicates when the potential security issue captured by a finding was most recently
     *        observed by the security findings product. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withLastObservedAt(DateFilter... lastObservedAt) {
        if (this.lastObservedAt == null) {
            setLastObservedAt(new java.util.ArrayList<DateFilter>(lastObservedAt.length));
        }
        for (DateFilter ele : lastObservedAt) {
            this.lastObservedAt.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the potential security issue captured by a finding was most recently observed by
     * the security findings product.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param lastObservedAt
     *        A timestamp that indicates when the potential security issue captured by a finding was most recently
     *        observed by the security findings product. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withLastObservedAt(java.util.Collection<DateFilter> lastObservedAt) {
        setLastObservedAt(lastObservedAt);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when this finding record was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return A timestamp that indicates when this finding record was created. </p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<DateFilter> getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * A timestamp that indicates when this finding record was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param createdAt
     *        A timestamp that indicates when this finding record was created. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setCreatedAt(java.util.Collection<DateFilter> createdAt) {
        if (createdAt == null) {
            this.createdAt = null;
            return;
        }

        this.createdAt = new java.util.ArrayList<DateFilter>(createdAt);
    }

    /**
     * <p>
     * A timestamp that indicates when this finding record was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreatedAt(java.util.Collection)} or {@link #withCreatedAt(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param createdAt
     *        A timestamp that indicates when this finding record was created. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withCreatedAt(DateFilter... createdAt) {
        if (this.createdAt == null) {
            setCreatedAt(new java.util.ArrayList<DateFilter>(createdAt.length));
        }
        for (DateFilter ele : createdAt) {
            this.createdAt.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when this finding record was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param createdAt
     *        A timestamp that indicates when this finding record was created. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withCreatedAt(java.util.Collection<DateFilter> createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the finding record was most recently updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return A timestamp that indicates when the finding record was most recently updated. </p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<DateFilter> getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * A timestamp that indicates when the finding record was most recently updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param updatedAt
     *        A timestamp that indicates when the finding record was most recently updated. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setUpdatedAt(java.util.Collection<DateFilter> updatedAt) {
        if (updatedAt == null) {
            this.updatedAt = null;
            return;
        }

        this.updatedAt = new java.util.ArrayList<DateFilter>(updatedAt);
    }

    /**
     * <p>
     * A timestamp that indicates when the finding record was most recently updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdatedAt(java.util.Collection)} or {@link #withUpdatedAt(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param updatedAt
     *        A timestamp that indicates when the finding record was most recently updated. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withUpdatedAt(DateFilter... updatedAt) {
        if (this.updatedAt == null) {
            setUpdatedAt(new java.util.ArrayList<DateFilter>(updatedAt.length));
        }
        for (DateFilter ele : updatedAt) {
            this.updatedAt.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the finding record was most recently updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param updatedAt
     *        A timestamp that indicates when the finding record was most recently updated. </p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withUpdatedAt(java.util.Collection<DateFilter> updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The likelihood that a finding accurately identifies the behavior or issue that it was intended to identify.
     * <code>Confidence</code> is scored on a 0–100 basis using a ratio scale. A value of <code>0</code> means 0 percent
     * confidence, and a value of <code>100</code> means 100 percent confidence. For example, a data exfiltration
     * detection based on a statistical deviation of network traffic has low confidence because an actual exfiltration
     * hasn't been verified. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence"
     * >Confidence</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The likelihood that a finding accurately identifies the behavior or issue that it was intended to
     *         identify. <code>Confidence</code> is scored on a 0–100 basis using a ratio scale. A value of
     *         <code>0</code> means 0 percent confidence, and a value of <code>100</code> means 100 percent confidence.
     *         For example, a data exfiltration detection based on a statistical deviation of network traffic has low
     *         confidence because an actual exfiltration hasn't been verified. For more information, see <a href=
     *         "https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence"
     *         >Confidence</a> in the <i>Security Hub User Guide</i>.</p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<NumberFilter> getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The likelihood that a finding accurately identifies the behavior or issue that it was intended to identify.
     * <code>Confidence</code> is scored on a 0–100 basis using a ratio scale. A value of <code>0</code> means 0 percent
     * confidence, and a value of <code>100</code> means 100 percent confidence. For example, a data exfiltration
     * detection based on a statistical deviation of network traffic has low confidence because an actual exfiltration
     * hasn't been verified. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence"
     * >Confidence</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param confidence
     *        The likelihood that a finding accurately identifies the behavior or issue that it was intended to
     *        identify. <code>Confidence</code> is scored on a 0–100 basis using a ratio scale. A value of
     *        <code>0</code> means 0 percent confidence, and a value of <code>100</code> means 100 percent confidence.
     *        For example, a data exfiltration detection based on a statistical deviation of network traffic has low
     *        confidence because an actual exfiltration hasn't been verified. For more information, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence"
     *        >Confidence</a> in the <i>Security Hub User Guide</i>.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setConfidence(java.util.Collection<NumberFilter> confidence) {
        if (confidence == null) {
            this.confidence = null;
            return;
        }

        this.confidence = new java.util.ArrayList<NumberFilter>(confidence);
    }

    /**
     * <p>
     * The likelihood that a finding accurately identifies the behavior or issue that it was intended to identify.
     * <code>Confidence</code> is scored on a 0–100 basis using a ratio scale. A value of <code>0</code> means 0 percent
     * confidence, and a value of <code>100</code> means 100 percent confidence. For example, a data exfiltration
     * detection based on a statistical deviation of network traffic has low confidence because an actual exfiltration
     * hasn't been verified. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence"
     * >Confidence</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfidence(java.util.Collection)} or {@link #withConfidence(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param confidence
     *        The likelihood that a finding accurately identifies the behavior or issue that it was intended to
     *        identify. <code>Confidence</code> is scored on a 0–100 basis using a ratio scale. A value of
     *        <code>0</code> means 0 percent confidence, and a value of <code>100</code> means 100 percent confidence.
     *        For example, a data exfiltration detection based on a statistical deviation of network traffic has low
     *        confidence because an actual exfiltration hasn't been verified. For more information, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence"
     *        >Confidence</a> in the <i>Security Hub User Guide</i>.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withConfidence(NumberFilter... confidence) {
        if (this.confidence == null) {
            setConfidence(new java.util.ArrayList<NumberFilter>(confidence.length));
        }
        for (NumberFilter ele : confidence) {
            this.confidence.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The likelihood that a finding accurately identifies the behavior or issue that it was intended to identify.
     * <code>Confidence</code> is scored on a 0–100 basis using a ratio scale. A value of <code>0</code> means 0 percent
     * confidence, and a value of <code>100</code> means 100 percent confidence. For example, a data exfiltration
     * detection based on a statistical deviation of network traffic has low confidence because an actual exfiltration
     * hasn't been verified. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence"
     * >Confidence</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param confidence
     *        The likelihood that a finding accurately identifies the behavior or issue that it was intended to
     *        identify. <code>Confidence</code> is scored on a 0–100 basis using a ratio scale. A value of
     *        <code>0</code> means 0 percent confidence, and a value of <code>100</code> means 100 percent confidence.
     *        For example, a data exfiltration detection based on a statistical deviation of network traffic has low
     *        confidence because an actual exfiltration hasn't been verified. For more information, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-confidence"
     *        >Confidence</a> in the <i>Security Hub User Guide</i>.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withConfidence(java.util.Collection<NumberFilter> confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * The level of importance that is assigned to the resources that are associated with a finding.
     * <code>Criticality</code> is scored on a 0–100 basis, using a ratio scale that supports only full integers. A
     * score of <code>0</code> means that the underlying resources have no criticality, and a score of <code>100</code>
     * is reserved for the most critical resources. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality"
     * >Criticality</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The level of importance that is assigned to the resources that are associated with a finding.
     *         <code>Criticality</code> is scored on a 0–100 basis, using a ratio scale that supports only full
     *         integers. A score of <code>0</code> means that the underlying resources have no criticality, and a score
     *         of <code>100</code> is reserved for the most critical resources. For more information, see <a
     *         href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality"
     *         >Criticality</a> in the <i>Security Hub User Guide</i>.</p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<NumberFilter> getCriticality() {
        return criticality;
    }

    /**
     * <p>
     * The level of importance that is assigned to the resources that are associated with a finding.
     * <code>Criticality</code> is scored on a 0–100 basis, using a ratio scale that supports only full integers. A
     * score of <code>0</code> means that the underlying resources have no criticality, and a score of <code>100</code>
     * is reserved for the most critical resources. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality"
     * >Criticality</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param criticality
     *        The level of importance that is assigned to the resources that are associated with a finding.
     *        <code>Criticality</code> is scored on a 0–100 basis, using a ratio scale that supports only full integers.
     *        A score of <code>0</code> means that the underlying resources have no criticality, and a score of
     *        <code>100</code> is reserved for the most critical resources. For more information, see <a
     *        href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality"
     *        >Criticality</a> in the <i>Security Hub User Guide</i>.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setCriticality(java.util.Collection<NumberFilter> criticality) {
        if (criticality == null) {
            this.criticality = null;
            return;
        }

        this.criticality = new java.util.ArrayList<NumberFilter>(criticality);
    }

    /**
     * <p>
     * The level of importance that is assigned to the resources that are associated with a finding.
     * <code>Criticality</code> is scored on a 0–100 basis, using a ratio scale that supports only full integers. A
     * score of <code>0</code> means that the underlying resources have no criticality, and a score of <code>100</code>
     * is reserved for the most critical resources. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality"
     * >Criticality</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCriticality(java.util.Collection)} or {@link #withCriticality(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param criticality
     *        The level of importance that is assigned to the resources that are associated with a finding.
     *        <code>Criticality</code> is scored on a 0–100 basis, using a ratio scale that supports only full integers.
     *        A score of <code>0</code> means that the underlying resources have no criticality, and a score of
     *        <code>100</code> is reserved for the most critical resources. For more information, see <a
     *        href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality"
     *        >Criticality</a> in the <i>Security Hub User Guide</i>.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withCriticality(NumberFilter... criticality) {
        if (this.criticality == null) {
            setCriticality(new java.util.ArrayList<NumberFilter>(criticality.length));
        }
        for (NumberFilter ele : criticality) {
            this.criticality.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The level of importance that is assigned to the resources that are associated with a finding.
     * <code>Criticality</code> is scored on a 0–100 basis, using a ratio scale that supports only full integers. A
     * score of <code>0</code> means that the underlying resources have no criticality, and a score of <code>100</code>
     * is reserved for the most critical resources. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality"
     * >Criticality</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param criticality
     *        The level of importance that is assigned to the resources that are associated with a finding.
     *        <code>Criticality</code> is scored on a 0–100 basis, using a ratio scale that supports only full integers.
     *        A score of <code>0</code> means that the underlying resources have no criticality, and a score of
     *        <code>100</code> is reserved for the most critical resources. For more information, see <a
     *        href="https://docs.aws.amazon.com/securityhub/latest/userguide/asff-top-level-attributes.html#asff-criticality"
     *        >Criticality</a> in the <i>Security Hub User Guide</i>.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withCriticality(java.util.Collection<NumberFilter> criticality) {
        setCriticality(criticality);
        return this;
    }

    /**
     * <p>
     * A finding's title.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * 
     * @return A finding's title. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 100 items.
     */

    public java.util.List<StringFilter> getTitle() {
        return title;
    }

    /**
     * <p>
     * A finding's title.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * 
     * @param title
     *        A finding's title. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 100 items.
     */

    public void setTitle(java.util.Collection<StringFilter> title) {
        if (title == null) {
            this.title = null;
            return;
        }

        this.title = new java.util.ArrayList<StringFilter>(title);
    }

    /**
     * <p>
     * A finding's title.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTitle(java.util.Collection)} or {@link #withTitle(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param title
     *        A finding's title. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withTitle(StringFilter... title) {
        if (this.title == null) {
            setTitle(new java.util.ArrayList<StringFilter>(title.length));
        }
        for (StringFilter ele : title) {
            this.title.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A finding's title.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * 
     * @param title
     *        A finding's title. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withTitle(java.util.Collection<StringFilter> title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * A finding's description.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return A finding's description. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getDescription() {
        return description;
    }

    /**
     * <p>
     * A finding's description.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param description
     *        A finding's description. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setDescription(java.util.Collection<StringFilter> description) {
        if (description == null) {
            this.description = null;
            return;
        }

        this.description = new java.util.ArrayList<StringFilter>(description);
    }

    /**
     * <p>
     * A finding's description.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDescription(java.util.Collection)} or {@link #withDescription(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param description
     *        A finding's description. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withDescription(StringFilter... description) {
        if (this.description == null) {
            setDescription(new java.util.ArrayList<StringFilter>(description.length));
        }
        for (StringFilter ele : description) {
            this.description.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A finding's description.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param description
     *        A finding's description. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withDescription(java.util.Collection<StringFilter> description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Provides a URL that links to a page about the current finding in the finding product.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return Provides a URL that links to a page about the current finding in the finding product. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getSourceUrl() {
        return sourceUrl;
    }

    /**
     * <p>
     * Provides a URL that links to a page about the current finding in the finding product.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param sourceUrl
     *        Provides a URL that links to a page about the current finding in the finding product. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setSourceUrl(java.util.Collection<StringFilter> sourceUrl) {
        if (sourceUrl == null) {
            this.sourceUrl = null;
            return;
        }

        this.sourceUrl = new java.util.ArrayList<StringFilter>(sourceUrl);
    }

    /**
     * <p>
     * Provides a URL that links to a page about the current finding in the finding product.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceUrl(java.util.Collection)} or {@link #withSourceUrl(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourceUrl
     *        Provides a URL that links to a page about the current finding in the finding product. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withSourceUrl(StringFilter... sourceUrl) {
        if (this.sourceUrl == null) {
            setSourceUrl(new java.util.ArrayList<StringFilter>(sourceUrl.length));
        }
        for (StringFilter ele : sourceUrl) {
            this.sourceUrl.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides a URL that links to a page about the current finding in the finding product.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param sourceUrl
     *        Provides a URL that links to a page about the current finding in the finding product. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withSourceUrl(java.util.Collection<StringFilter> sourceUrl) {
        setSourceUrl(sourceUrl);
        return this;
    }

    /**
     * <p>
     * Provides the name of the product that generated the finding. For control-based findings, the product name is
     * Security Hub.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return Provides the name of the product that generated the finding. For control-based findings, the product name
     *         is Security Hub. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getProductName() {
        return productName;
    }

    /**
     * <p>
     * Provides the name of the product that generated the finding. For control-based findings, the product name is
     * Security Hub.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param productName
     *        Provides the name of the product that generated the finding. For control-based findings, the product name
     *        is Security Hub. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setProductName(java.util.Collection<StringFilter> productName) {
        if (productName == null) {
            this.productName = null;
            return;
        }

        this.productName = new java.util.ArrayList<StringFilter>(productName);
    }

    /**
     * <p>
     * Provides the name of the product that generated the finding. For control-based findings, the product name is
     * Security Hub.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductName(java.util.Collection)} or {@link #withProductName(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productName
     *        Provides the name of the product that generated the finding. For control-based findings, the product name
     *        is Security Hub. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withProductName(StringFilter... productName) {
        if (this.productName == null) {
            setProductName(new java.util.ArrayList<StringFilter>(productName.length));
        }
        for (StringFilter ele : productName) {
            this.productName.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the name of the product that generated the finding. For control-based findings, the product name is
     * Security Hub.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param productName
     *        Provides the name of the product that generated the finding. For control-based findings, the product name
     *        is Security Hub. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withProductName(java.util.Collection<StringFilter> productName) {
        setProductName(productName);
        return this;
    }

    /**
     * <p>
     * The name of the company for the product that generated the finding. For control-based findings, the company is
     * Amazon Web Services.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The name of the company for the product that generated the finding. For control-based findings, the
     *         company is Amazon Web Services. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getCompanyName() {
        return companyName;
    }

    /**
     * <p>
     * The name of the company for the product that generated the finding. For control-based findings, the company is
     * Amazon Web Services.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param companyName
     *        The name of the company for the product that generated the finding. For control-based findings, the
     *        company is Amazon Web Services. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setCompanyName(java.util.Collection<StringFilter> companyName) {
        if (companyName == null) {
            this.companyName = null;
            return;
        }

        this.companyName = new java.util.ArrayList<StringFilter>(companyName);
    }

    /**
     * <p>
     * The name of the company for the product that generated the finding. For control-based findings, the company is
     * Amazon Web Services.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompanyName(java.util.Collection)} or {@link #withCompanyName(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param companyName
     *        The name of the company for the product that generated the finding. For control-based findings, the
     *        company is Amazon Web Services. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withCompanyName(StringFilter... companyName) {
        if (this.companyName == null) {
            setCompanyName(new java.util.ArrayList<StringFilter>(companyName.length));
        }
        for (StringFilter ele : companyName) {
            this.companyName.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the company for the product that generated the finding. For control-based findings, the company is
     * Amazon Web Services.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param companyName
     *        The name of the company for the product that generated the finding. For control-based findings, the
     *        company is Amazon Web Services. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withCompanyName(java.util.Collection<StringFilter> companyName) {
        setCompanyName(companyName);
        return this;
    }

    /**
     * <p>
     * The severity value of the finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The severity value of the finding. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getSeverityLabel() {
        return severityLabel;
    }

    /**
     * <p>
     * The severity value of the finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param severityLabel
     *        The severity value of the finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setSeverityLabel(java.util.Collection<StringFilter> severityLabel) {
        if (severityLabel == null) {
            this.severityLabel = null;
            return;
        }

        this.severityLabel = new java.util.ArrayList<StringFilter>(severityLabel);
    }

    /**
     * <p>
     * The severity value of the finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSeverityLabel(java.util.Collection)} or {@link #withSeverityLabel(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param severityLabel
     *        The severity value of the finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withSeverityLabel(StringFilter... severityLabel) {
        if (this.severityLabel == null) {
            setSeverityLabel(new java.util.ArrayList<StringFilter>(severityLabel.length));
        }
        for (StringFilter ele : severityLabel) {
            this.severityLabel.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The severity value of the finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param severityLabel
     *        The severity value of the finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withSeverityLabel(java.util.Collection<StringFilter> severityLabel) {
        setSeverityLabel(severityLabel);
        return this;
    }

    /**
     * <p>
     * The type of resource that the finding pertains to.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The type of resource that the finding pertains to. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource that the finding pertains to.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that the finding pertains to. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setResourceType(java.util.Collection<StringFilter> resourceType) {
        if (resourceType == null) {
            this.resourceType = null;
            return;
        }

        this.resourceType = new java.util.ArrayList<StringFilter>(resourceType);
    }

    /**
     * <p>
     * The type of resource that the finding pertains to.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceType(java.util.Collection)} or {@link #withResourceType(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that the finding pertains to. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceType(StringFilter... resourceType) {
        if (this.resourceType == null) {
            setResourceType(new java.util.ArrayList<StringFilter>(resourceType.length));
        }
        for (StringFilter ele : resourceType) {
            this.resourceType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of resource that the finding pertains to.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that the finding pertains to. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceType(java.util.Collection<StringFilter> resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The identifier for the given resource type. For Amazon Web Services resources that are identified by Amazon
     * Resource Names (ARNs), this is the ARN. For Amazon Web Services resources that lack ARNs, this is the identifier
     * as defined by the Amazon Web Service that created the resource. For non-Amazon Web Services resources, this is a
     * unique identifier that is associated with the resource.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * 
     * @return The identifier for the given resource type. For Amazon Web Services resources that are identified by
     *         Amazon Resource Names (ARNs), this is the ARN. For Amazon Web Services resources that lack ARNs, this is
     *         the identifier as defined by the Amazon Web Service that created the resource. For non-Amazon Web
     *         Services resources, this is a unique identifier that is associated with the resource. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 100 items.
     */

    public java.util.List<StringFilter> getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The identifier for the given resource type. For Amazon Web Services resources that are identified by Amazon
     * Resource Names (ARNs), this is the ARN. For Amazon Web Services resources that lack ARNs, this is the identifier
     * as defined by the Amazon Web Service that created the resource. For non-Amazon Web Services resources, this is a
     * unique identifier that is associated with the resource.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the given resource type. For Amazon Web Services resources that are identified by
     *        Amazon Resource Names (ARNs), this is the ARN. For Amazon Web Services resources that lack ARNs, this is
     *        the identifier as defined by the Amazon Web Service that created the resource. For non-Amazon Web Services
     *        resources, this is a unique identifier that is associated with the resource. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 100 items.
     */

    public void setResourceId(java.util.Collection<StringFilter> resourceId) {
        if (resourceId == null) {
            this.resourceId = null;
            return;
        }

        this.resourceId = new java.util.ArrayList<StringFilter>(resourceId);
    }

    /**
     * <p>
     * The identifier for the given resource type. For Amazon Web Services resources that are identified by Amazon
     * Resource Names (ARNs), this is the ARN. For Amazon Web Services resources that lack ARNs, this is the identifier
     * as defined by the Amazon Web Service that created the resource. For non-Amazon Web Services resources, this is a
     * unique identifier that is associated with the resource.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceId(java.util.Collection)} or {@link #withResourceId(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the given resource type. For Amazon Web Services resources that are identified by
     *        Amazon Resource Names (ARNs), this is the ARN. For Amazon Web Services resources that lack ARNs, this is
     *        the identifier as defined by the Amazon Web Service that created the resource. For non-Amazon Web Services
     *        resources, this is a unique identifier that is associated with the resource. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceId(StringFilter... resourceId) {
        if (this.resourceId == null) {
            setResourceId(new java.util.ArrayList<StringFilter>(resourceId.length));
        }
        for (StringFilter ele : resourceId) {
            this.resourceId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier for the given resource type. For Amazon Web Services resources that are identified by Amazon
     * Resource Names (ARNs), this is the ARN. For Amazon Web Services resources that lack ARNs, this is the identifier
     * as defined by the Amazon Web Service that created the resource. For non-Amazon Web Services resources, this is a
     * unique identifier that is associated with the resource.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the given resource type. For Amazon Web Services resources that are identified by
     *        Amazon Resource Names (ARNs), this is the ARN. For Amazon Web Services resources that lack ARNs, this is
     *        the identifier as defined by the Amazon Web Service that created the resource. For non-Amazon Web Services
     *        resources, this is a unique identifier that is associated with the resource. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 100 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceId(java.util.Collection<StringFilter> resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The partition in which the resource that the finding pertains to is located. A partition is a group of Amazon Web
     * Services Regions. Each Amazon Web Services account is scoped to one partition.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The partition in which the resource that the finding pertains to is located. A partition is a group of
     *         Amazon Web Services Regions. Each Amazon Web Services account is scoped to one partition. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getResourcePartition() {
        return resourcePartition;
    }

    /**
     * <p>
     * The partition in which the resource that the finding pertains to is located. A partition is a group of Amazon Web
     * Services Regions. Each Amazon Web Services account is scoped to one partition.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourcePartition
     *        The partition in which the resource that the finding pertains to is located. A partition is a group of
     *        Amazon Web Services Regions. Each Amazon Web Services account is scoped to one partition. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setResourcePartition(java.util.Collection<StringFilter> resourcePartition) {
        if (resourcePartition == null) {
            this.resourcePartition = null;
            return;
        }

        this.resourcePartition = new java.util.ArrayList<StringFilter>(resourcePartition);
    }

    /**
     * <p>
     * The partition in which the resource that the finding pertains to is located. A partition is a group of Amazon Web
     * Services Regions. Each Amazon Web Services account is scoped to one partition.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourcePartition(java.util.Collection)} or {@link #withResourcePartition(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourcePartition
     *        The partition in which the resource that the finding pertains to is located. A partition is a group of
     *        Amazon Web Services Regions. Each Amazon Web Services account is scoped to one partition. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourcePartition(StringFilter... resourcePartition) {
        if (this.resourcePartition == null) {
            setResourcePartition(new java.util.ArrayList<StringFilter>(resourcePartition.length));
        }
        for (StringFilter ele : resourcePartition) {
            this.resourcePartition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The partition in which the resource that the finding pertains to is located. A partition is a group of Amazon Web
     * Services Regions. Each Amazon Web Services account is scoped to one partition.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourcePartition
     *        The partition in which the resource that the finding pertains to is located. A partition is a group of
     *        Amazon Web Services Regions. Each Amazon Web Services account is scoped to one partition. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourcePartition(java.util.Collection<StringFilter> resourcePartition) {
        setResourcePartition(resourcePartition);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the resource that a finding pertains to is located.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The Amazon Web Services Region where the resource that a finding pertains to is located. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getResourceRegion() {
        return resourceRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the resource that a finding pertains to is located.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourceRegion
     *        The Amazon Web Services Region where the resource that a finding pertains to is located. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setResourceRegion(java.util.Collection<StringFilter> resourceRegion) {
        if (resourceRegion == null) {
            this.resourceRegion = null;
            return;
        }

        this.resourceRegion = new java.util.ArrayList<StringFilter>(resourceRegion);
    }

    /**
     * <p>
     * The Amazon Web Services Region where the resource that a finding pertains to is located.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceRegion(java.util.Collection)} or {@link #withResourceRegion(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceRegion
     *        The Amazon Web Services Region where the resource that a finding pertains to is located. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceRegion(StringFilter... resourceRegion) {
        if (this.resourceRegion == null) {
            setResourceRegion(new java.util.ArrayList<StringFilter>(resourceRegion.length));
        }
        for (StringFilter ele : resourceRegion) {
            this.resourceRegion.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the resource that a finding pertains to is located.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourceRegion
     *        The Amazon Web Services Region where the resource that a finding pertains to is located. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceRegion(java.util.Collection<StringFilter> resourceRegion) {
        setResourceRegion(resourceRegion);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Web Services tags associated with a resource at the time the finding was processed.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return A list of Amazon Web Services tags associated with a resource at the time the finding was processed. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<MapFilter> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * A list of Amazon Web Services tags associated with a resource at the time the finding was processed.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourceTags
     *        A list of Amazon Web Services tags associated with a resource at the time the finding was processed. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setResourceTags(java.util.Collection<MapFilter> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new java.util.ArrayList<MapFilter>(resourceTags);
    }

    /**
     * <p>
     * A list of Amazon Web Services tags associated with a resource at the time the finding was processed.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        A list of Amazon Web Services tags associated with a resource at the time the finding was processed. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceTags(MapFilter... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new java.util.ArrayList<MapFilter>(resourceTags.length));
        }
        for (MapFilter ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Web Services tags associated with a resource at the time the finding was processed.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourceTags
     *        A list of Amazon Web Services tags associated with a resource at the time the finding was processed. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceTags(java.util.Collection<MapFilter> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * <p>
     * Custom fields and values about the resource that a finding pertains to.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return Custom fields and values about the resource that a finding pertains to. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<MapFilter> getResourceDetailsOther() {
        return resourceDetailsOther;
    }

    /**
     * <p>
     * Custom fields and values about the resource that a finding pertains to.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourceDetailsOther
     *        Custom fields and values about the resource that a finding pertains to. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setResourceDetailsOther(java.util.Collection<MapFilter> resourceDetailsOther) {
        if (resourceDetailsOther == null) {
            this.resourceDetailsOther = null;
            return;
        }

        this.resourceDetailsOther = new java.util.ArrayList<MapFilter>(resourceDetailsOther);
    }

    /**
     * <p>
     * Custom fields and values about the resource that a finding pertains to.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceDetailsOther(java.util.Collection)} or {@link #withResourceDetailsOther(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceDetailsOther
     *        Custom fields and values about the resource that a finding pertains to. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceDetailsOther(MapFilter... resourceDetailsOther) {
        if (this.resourceDetailsOther == null) {
            setResourceDetailsOther(new java.util.ArrayList<MapFilter>(resourceDetailsOther.length));
        }
        for (MapFilter ele : resourceDetailsOther) {
            this.resourceDetailsOther.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Custom fields and values about the resource that a finding pertains to.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourceDetailsOther
     *        Custom fields and values about the resource that a finding pertains to. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceDetailsOther(java.util.Collection<MapFilter> resourceDetailsOther) {
        setResourceDetailsOther(resourceDetailsOther);
        return this;
    }

    /**
     * <p>
     * The result of a security check. This field is only used for findings generated from controls.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The result of a security check. This field is only used for findings generated from controls. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getComplianceStatus() {
        return complianceStatus;
    }

    /**
     * <p>
     * The result of a security check. This field is only used for findings generated from controls.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param complianceStatus
     *        The result of a security check. This field is only used for findings generated from controls. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setComplianceStatus(java.util.Collection<StringFilter> complianceStatus) {
        if (complianceStatus == null) {
            this.complianceStatus = null;
            return;
        }

        this.complianceStatus = new java.util.ArrayList<StringFilter>(complianceStatus);
    }

    /**
     * <p>
     * The result of a security check. This field is only used for findings generated from controls.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceStatus(java.util.Collection)} or {@link #withComplianceStatus(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param complianceStatus
     *        The result of a security check. This field is only used for findings generated from controls. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withComplianceStatus(StringFilter... complianceStatus) {
        if (this.complianceStatus == null) {
            setComplianceStatus(new java.util.ArrayList<StringFilter>(complianceStatus.length));
        }
        for (StringFilter ele : complianceStatus) {
            this.complianceStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The result of a security check. This field is only used for findings generated from controls.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param complianceStatus
     *        The result of a security check. This field is only used for findings generated from controls. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withComplianceStatus(java.util.Collection<StringFilter> complianceStatus) {
        setComplianceStatus(complianceStatus);
        return this;
    }

    /**
     * <p>
     * The security control ID for which a finding was generated. Security control IDs are the same across standards.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The security control ID for which a finding was generated. Security control IDs are the same across
     *         standards.</p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getComplianceSecurityControlId() {
        return complianceSecurityControlId;
    }

    /**
     * <p>
     * The security control ID for which a finding was generated. Security control IDs are the same across standards.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param complianceSecurityControlId
     *        The security control ID for which a finding was generated. Security control IDs are the same across
     *        standards.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setComplianceSecurityControlId(java.util.Collection<StringFilter> complianceSecurityControlId) {
        if (complianceSecurityControlId == null) {
            this.complianceSecurityControlId = null;
            return;
        }

        this.complianceSecurityControlId = new java.util.ArrayList<StringFilter>(complianceSecurityControlId);
    }

    /**
     * <p>
     * The security control ID for which a finding was generated. Security control IDs are the same across standards.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceSecurityControlId(java.util.Collection)} or
     * {@link #withComplianceSecurityControlId(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param complianceSecurityControlId
     *        The security control ID for which a finding was generated. Security control IDs are the same across
     *        standards.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withComplianceSecurityControlId(StringFilter... complianceSecurityControlId) {
        if (this.complianceSecurityControlId == null) {
            setComplianceSecurityControlId(new java.util.ArrayList<StringFilter>(complianceSecurityControlId.length));
        }
        for (StringFilter ele : complianceSecurityControlId) {
            this.complianceSecurityControlId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security control ID for which a finding was generated. Security control IDs are the same across standards.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param complianceSecurityControlId
     *        The security control ID for which a finding was generated. Security control IDs are the same across
     *        standards.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withComplianceSecurityControlId(java.util.Collection<StringFilter> complianceSecurityControlId) {
        setComplianceSecurityControlId(complianceSecurityControlId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of a standard in which a control is enabled. This field consists of the resource portion of
     * the Amazon Resource Name (ARN) returned for a standard in the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html">DescribeStandards</a>
     * API response.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The unique identifier of a standard in which a control is enabled. This field consists of the resource
     *         portion of the Amazon Resource Name (ARN) returned for a standard in the <a
     *         href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html"
     *         >DescribeStandards</a> API response.</p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getComplianceAssociatedStandardsId() {
        return complianceAssociatedStandardsId;
    }

    /**
     * <p>
     * The unique identifier of a standard in which a control is enabled. This field consists of the resource portion of
     * the Amazon Resource Name (ARN) returned for a standard in the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html">DescribeStandards</a>
     * API response.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param complianceAssociatedStandardsId
     *        The unique identifier of a standard in which a control is enabled. This field consists of the resource
     *        portion of the Amazon Resource Name (ARN) returned for a standard in the <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html"
     *        >DescribeStandards</a> API response.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setComplianceAssociatedStandardsId(java.util.Collection<StringFilter> complianceAssociatedStandardsId) {
        if (complianceAssociatedStandardsId == null) {
            this.complianceAssociatedStandardsId = null;
            return;
        }

        this.complianceAssociatedStandardsId = new java.util.ArrayList<StringFilter>(complianceAssociatedStandardsId);
    }

    /**
     * <p>
     * The unique identifier of a standard in which a control is enabled. This field consists of the resource portion of
     * the Amazon Resource Name (ARN) returned for a standard in the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html">DescribeStandards</a>
     * API response.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceAssociatedStandardsId(java.util.Collection)} or
     * {@link #withComplianceAssociatedStandardsId(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param complianceAssociatedStandardsId
     *        The unique identifier of a standard in which a control is enabled. This field consists of the resource
     *        portion of the Amazon Resource Name (ARN) returned for a standard in the <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html"
     *        >DescribeStandards</a> API response.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withComplianceAssociatedStandardsId(StringFilter... complianceAssociatedStandardsId) {
        if (this.complianceAssociatedStandardsId == null) {
            setComplianceAssociatedStandardsId(new java.util.ArrayList<StringFilter>(complianceAssociatedStandardsId.length));
        }
        for (StringFilter ele : complianceAssociatedStandardsId) {
            this.complianceAssociatedStandardsId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifier of a standard in which a control is enabled. This field consists of the resource portion of
     * the Amazon Resource Name (ARN) returned for a standard in the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html">DescribeStandards</a>
     * API response.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param complianceAssociatedStandardsId
     *        The unique identifier of a standard in which a control is enabled. This field consists of the resource
     *        portion of the Amazon Resource Name (ARN) returned for a standard in the <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html"
     *        >DescribeStandards</a> API response.</p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withComplianceAssociatedStandardsId(java.util.Collection<StringFilter> complianceAssociatedStandardsId) {
        setComplianceAssociatedStandardsId(complianceAssociatedStandardsId);
        return this;
    }

    /**
     * <p>
     * Provides the veracity of a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return Provides the veracity of a finding. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getVerificationState() {
        return verificationState;
    }

    /**
     * <p>
     * Provides the veracity of a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param verificationState
     *        Provides the veracity of a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setVerificationState(java.util.Collection<StringFilter> verificationState) {
        if (verificationState == null) {
            this.verificationState = null;
            return;
        }

        this.verificationState = new java.util.ArrayList<StringFilter>(verificationState);
    }

    /**
     * <p>
     * Provides the veracity of a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVerificationState(java.util.Collection)} or {@link #withVerificationState(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param verificationState
     *        Provides the veracity of a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withVerificationState(StringFilter... verificationState) {
        if (this.verificationState == null) {
            setVerificationState(new java.util.ArrayList<StringFilter>(verificationState.length));
        }
        for (StringFilter ele : verificationState) {
            this.verificationState.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the veracity of a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param verificationState
     *        Provides the veracity of a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withVerificationState(java.util.Collection<StringFilter> verificationState) {
        setVerificationState(verificationState);
        return this;
    }

    /**
     * <p>
     * Provides information about the status of the investigation into a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return Provides information about the status of the investigation into a finding. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getWorkflowStatus() {
        return workflowStatus;
    }

    /**
     * <p>
     * Provides information about the status of the investigation into a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param workflowStatus
     *        Provides information about the status of the investigation into a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setWorkflowStatus(java.util.Collection<StringFilter> workflowStatus) {
        if (workflowStatus == null) {
            this.workflowStatus = null;
            return;
        }

        this.workflowStatus = new java.util.ArrayList<StringFilter>(workflowStatus);
    }

    /**
     * <p>
     * Provides information about the status of the investigation into a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkflowStatus(java.util.Collection)} or {@link #withWorkflowStatus(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param workflowStatus
     *        Provides information about the status of the investigation into a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withWorkflowStatus(StringFilter... workflowStatus) {
        if (this.workflowStatus == null) {
            setWorkflowStatus(new java.util.ArrayList<StringFilter>(workflowStatus.length));
        }
        for (StringFilter ele : workflowStatus) {
            this.workflowStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides information about the status of the investigation into a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param workflowStatus
     *        Provides information about the status of the investigation into a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withWorkflowStatus(java.util.Collection<StringFilter> workflowStatus) {
        setWorkflowStatus(workflowStatus);
        return this;
    }

    /**
     * <p>
     * Provides the current state of a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return Provides the current state of a finding. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getRecordState() {
        return recordState;
    }

    /**
     * <p>
     * Provides the current state of a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param recordState
     *        Provides the current state of a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setRecordState(java.util.Collection<StringFilter> recordState) {
        if (recordState == null) {
            this.recordState = null;
            return;
        }

        this.recordState = new java.util.ArrayList<StringFilter>(recordState);
    }

    /**
     * <p>
     * Provides the current state of a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordState(java.util.Collection)} or {@link #withRecordState(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param recordState
     *        Provides the current state of a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withRecordState(StringFilter... recordState) {
        if (this.recordState == null) {
            setRecordState(new java.util.ArrayList<StringFilter>(recordState.length));
        }
        for (StringFilter ele : recordState) {
            this.recordState.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the current state of a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param recordState
     *        Provides the current state of a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withRecordState(java.util.Collection<StringFilter> recordState) {
        setRecordState(recordState);
        return this;
    }

    /**
     * <p>
     * The ARN for the product that generated a related finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The ARN for the product that generated a related finding. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getRelatedFindingsProductArn() {
        return relatedFindingsProductArn;
    }

    /**
     * <p>
     * The ARN for the product that generated a related finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param relatedFindingsProductArn
     *        The ARN for the product that generated a related finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setRelatedFindingsProductArn(java.util.Collection<StringFilter> relatedFindingsProductArn) {
        if (relatedFindingsProductArn == null) {
            this.relatedFindingsProductArn = null;
            return;
        }

        this.relatedFindingsProductArn = new java.util.ArrayList<StringFilter>(relatedFindingsProductArn);
    }

    /**
     * <p>
     * The ARN for the product that generated a related finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedFindingsProductArn(java.util.Collection)} or
     * {@link #withRelatedFindingsProductArn(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param relatedFindingsProductArn
     *        The ARN for the product that generated a related finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withRelatedFindingsProductArn(StringFilter... relatedFindingsProductArn) {
        if (this.relatedFindingsProductArn == null) {
            setRelatedFindingsProductArn(new java.util.ArrayList<StringFilter>(relatedFindingsProductArn.length));
        }
        for (StringFilter ele : relatedFindingsProductArn) {
            this.relatedFindingsProductArn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN for the product that generated a related finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param relatedFindingsProductArn
     *        The ARN for the product that generated a related finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withRelatedFindingsProductArn(java.util.Collection<StringFilter> relatedFindingsProductArn) {
        setRelatedFindingsProductArn(relatedFindingsProductArn);
        return this;
    }

    /**
     * <p>
     * The product-generated identifier for a related finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The product-generated identifier for a related finding. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getRelatedFindingsId() {
        return relatedFindingsId;
    }

    /**
     * <p>
     * The product-generated identifier for a related finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param relatedFindingsId
     *        The product-generated identifier for a related finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setRelatedFindingsId(java.util.Collection<StringFilter> relatedFindingsId) {
        if (relatedFindingsId == null) {
            this.relatedFindingsId = null;
            return;
        }

        this.relatedFindingsId = new java.util.ArrayList<StringFilter>(relatedFindingsId);
    }

    /**
     * <p>
     * The product-generated identifier for a related finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedFindingsId(java.util.Collection)} or {@link #withRelatedFindingsId(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param relatedFindingsId
     *        The product-generated identifier for a related finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withRelatedFindingsId(StringFilter... relatedFindingsId) {
        if (this.relatedFindingsId == null) {
            setRelatedFindingsId(new java.util.ArrayList<StringFilter>(relatedFindingsId.length));
        }
        for (StringFilter ele : relatedFindingsId) {
            this.relatedFindingsId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The product-generated identifier for a related finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param relatedFindingsId
     *        The product-generated identifier for a related finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withRelatedFindingsId(java.util.Collection<StringFilter> relatedFindingsId) {
        setRelatedFindingsId(relatedFindingsId);
        return this;
    }

    /**
     * <p>
     * The text of a user-defined note that's added to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The text of a user-defined note that's added to a finding. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getNoteText() {
        return noteText;
    }

    /**
     * <p>
     * The text of a user-defined note that's added to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param noteText
     *        The text of a user-defined note that's added to a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setNoteText(java.util.Collection<StringFilter> noteText) {
        if (noteText == null) {
            this.noteText = null;
            return;
        }

        this.noteText = new java.util.ArrayList<StringFilter>(noteText);
    }

    /**
     * <p>
     * The text of a user-defined note that's added to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNoteText(java.util.Collection)} or {@link #withNoteText(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param noteText
     *        The text of a user-defined note that's added to a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withNoteText(StringFilter... noteText) {
        if (this.noteText == null) {
            setNoteText(new java.util.ArrayList<StringFilter>(noteText.length));
        }
        for (StringFilter ele : noteText) {
            this.noteText.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The text of a user-defined note that's added to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param noteText
     *        The text of a user-defined note that's added to a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withNoteText(java.util.Collection<StringFilter> noteText) {
        setNoteText(noteText);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the note was updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The timestamp of when the note was updated.</p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<DateFilter> getNoteUpdatedAt() {
        return noteUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the note was updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param noteUpdatedAt
     *        The timestamp of when the note was updated.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setNoteUpdatedAt(java.util.Collection<DateFilter> noteUpdatedAt) {
        if (noteUpdatedAt == null) {
            this.noteUpdatedAt = null;
            return;
        }

        this.noteUpdatedAt = new java.util.ArrayList<DateFilter>(noteUpdatedAt);
    }

    /**
     * <p>
     * The timestamp of when the note was updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNoteUpdatedAt(java.util.Collection)} or {@link #withNoteUpdatedAt(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param noteUpdatedAt
     *        The timestamp of when the note was updated.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withNoteUpdatedAt(DateFilter... noteUpdatedAt) {
        if (this.noteUpdatedAt == null) {
            setNoteUpdatedAt(new java.util.ArrayList<DateFilter>(noteUpdatedAt.length));
        }
        for (DateFilter ele : noteUpdatedAt) {
            this.noteUpdatedAt.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The timestamp of when the note was updated.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param noteUpdatedAt
     *        The timestamp of when the note was updated.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withNoteUpdatedAt(java.util.Collection<DateFilter> noteUpdatedAt) {
        setNoteUpdatedAt(noteUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The principal that created a note.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The principal that created a note. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getNoteUpdatedBy() {
        return noteUpdatedBy;
    }

    /**
     * <p>
     * The principal that created a note.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param noteUpdatedBy
     *        The principal that created a note. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setNoteUpdatedBy(java.util.Collection<StringFilter> noteUpdatedBy) {
        if (noteUpdatedBy == null) {
            this.noteUpdatedBy = null;
            return;
        }

        this.noteUpdatedBy = new java.util.ArrayList<StringFilter>(noteUpdatedBy);
    }

    /**
     * <p>
     * The principal that created a note.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNoteUpdatedBy(java.util.Collection)} or {@link #withNoteUpdatedBy(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param noteUpdatedBy
     *        The principal that created a note. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withNoteUpdatedBy(StringFilter... noteUpdatedBy) {
        if (this.noteUpdatedBy == null) {
            setNoteUpdatedBy(new java.util.ArrayList<StringFilter>(noteUpdatedBy.length));
        }
        for (StringFilter ele : noteUpdatedBy) {
            this.noteUpdatedBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The principal that created a note.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param noteUpdatedBy
     *        The principal that created a note. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withNoteUpdatedBy(java.util.Collection<StringFilter> noteUpdatedBy) {
        setNoteUpdatedBy(noteUpdatedBy);
        return this;
    }

    /**
     * <p>
     * A list of user-defined name and value string pairs added to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return A list of user-defined name and value string pairs added to a finding. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<MapFilter> getUserDefinedFields() {
        return userDefinedFields;
    }

    /**
     * <p>
     * A list of user-defined name and value string pairs added to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param userDefinedFields
     *        A list of user-defined name and value string pairs added to a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setUserDefinedFields(java.util.Collection<MapFilter> userDefinedFields) {
        if (userDefinedFields == null) {
            this.userDefinedFields = null;
            return;
        }

        this.userDefinedFields = new java.util.ArrayList<MapFilter>(userDefinedFields);
    }

    /**
     * <p>
     * A list of user-defined name and value string pairs added to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserDefinedFields(java.util.Collection)} or {@link #withUserDefinedFields(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param userDefinedFields
     *        A list of user-defined name and value string pairs added to a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withUserDefinedFields(MapFilter... userDefinedFields) {
        if (this.userDefinedFields == null) {
            setUserDefinedFields(new java.util.ArrayList<MapFilter>(userDefinedFields.length));
        }
        for (MapFilter ele : userDefinedFields) {
            this.userDefinedFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of user-defined name and value string pairs added to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param userDefinedFields
     *        A list of user-defined name and value string pairs added to a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withUserDefinedFields(java.util.Collection<MapFilter> userDefinedFields) {
        setUserDefinedFields(userDefinedFields);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application that is related to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application that is related to a finding. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getResourceApplicationArn() {
        return resourceApplicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application that is related to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourceApplicationArn
     *        The Amazon Resource Name (ARN) of the application that is related to a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setResourceApplicationArn(java.util.Collection<StringFilter> resourceApplicationArn) {
        if (resourceApplicationArn == null) {
            this.resourceApplicationArn = null;
            return;
        }

        this.resourceApplicationArn = new java.util.ArrayList<StringFilter>(resourceApplicationArn);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application that is related to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceApplicationArn(java.util.Collection)} or
     * {@link #withResourceApplicationArn(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceApplicationArn
     *        The Amazon Resource Name (ARN) of the application that is related to a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceApplicationArn(StringFilter... resourceApplicationArn) {
        if (this.resourceApplicationArn == null) {
            setResourceApplicationArn(new java.util.ArrayList<StringFilter>(resourceApplicationArn.length));
        }
        for (StringFilter ele : resourceApplicationArn) {
            this.resourceApplicationArn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application that is related to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourceApplicationArn
     *        The Amazon Resource Name (ARN) of the application that is related to a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceApplicationArn(java.util.Collection<StringFilter> resourceApplicationArn) {
        setResourceApplicationArn(resourceApplicationArn);
        return this;
    }

    /**
     * <p>
     * The name of the application that is related to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The name of the application that is related to a finding. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getResourceApplicationName() {
        return resourceApplicationName;
    }

    /**
     * <p>
     * The name of the application that is related to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourceApplicationName
     *        The name of the application that is related to a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setResourceApplicationName(java.util.Collection<StringFilter> resourceApplicationName) {
        if (resourceApplicationName == null) {
            this.resourceApplicationName = null;
            return;
        }

        this.resourceApplicationName = new java.util.ArrayList<StringFilter>(resourceApplicationName);
    }

    /**
     * <p>
     * The name of the application that is related to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceApplicationName(java.util.Collection)} or
     * {@link #withResourceApplicationName(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceApplicationName
     *        The name of the application that is related to a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceApplicationName(StringFilter... resourceApplicationName) {
        if (this.resourceApplicationName == null) {
            setResourceApplicationName(new java.util.ArrayList<StringFilter>(resourceApplicationName.length));
        }
        for (StringFilter ele : resourceApplicationName) {
            this.resourceApplicationName.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the application that is related to a finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param resourceApplicationName
     *        The name of the application that is related to a finding. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withResourceApplicationName(java.util.Collection<StringFilter> resourceApplicationName) {
        setResourceApplicationName(resourceApplicationName);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Services account in which a finding was generated.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @return The name of the Amazon Web Services account in which a finding was generated. </p>
     *         <p>
     *         Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public java.util.List<StringFilter> getAwsAccountName() {
        return awsAccountName;
    }

    /**
     * <p>
     * The name of the Amazon Web Services account in which a finding was generated.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param awsAccountName
     *        The name of the Amazon Web Services account in which a finding was generated. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     */

    public void setAwsAccountName(java.util.Collection<StringFilter> awsAccountName) {
        if (awsAccountName == null) {
            this.awsAccountName = null;
            return;
        }

        this.awsAccountName = new java.util.ArrayList<StringFilter>(awsAccountName);
    }

    /**
     * <p>
     * The name of the Amazon Web Services account in which a finding was generated.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAwsAccountName(java.util.Collection)} or {@link #withAwsAccountName(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param awsAccountName
     *        The name of the Amazon Web Services account in which a finding was generated. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withAwsAccountName(StringFilter... awsAccountName) {
        if (this.awsAccountName == null) {
            setAwsAccountName(new java.util.ArrayList<StringFilter>(awsAccountName.length));
        }
        for (StringFilter ele : awsAccountName) {
            this.awsAccountName.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Services account in which a finding was generated.
     * </p>
     * <p>
     * Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * </p>
     * 
     * @param awsAccountName
     *        The name of the Amazon Web Services account in which a finding was generated. </p>
     *        <p>
     *        Array Members: Minimum number of 1 item. Maximum number of 20 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFilters withAwsAccountName(java.util.Collection<StringFilter> awsAccountName) {
        setAwsAccountName(awsAccountName);
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
        if (getProductArn() != null)
            sb.append("ProductArn: ").append(getProductArn()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getGeneratorId() != null)
            sb.append("GeneratorId: ").append(getGeneratorId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getFirstObservedAt() != null)
            sb.append("FirstObservedAt: ").append(getFirstObservedAt()).append(",");
        if (getLastObservedAt() != null)
            sb.append("LastObservedAt: ").append(getLastObservedAt()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getCriticality() != null)
            sb.append("Criticality: ").append(getCriticality()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSourceUrl() != null)
            sb.append("SourceUrl: ").append(getSourceUrl()).append(",");
        if (getProductName() != null)
            sb.append("ProductName: ").append(getProductName()).append(",");
        if (getCompanyName() != null)
            sb.append("CompanyName: ").append(getCompanyName()).append(",");
        if (getSeverityLabel() != null)
            sb.append("SeverityLabel: ").append(getSeverityLabel()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourcePartition() != null)
            sb.append("ResourcePartition: ").append(getResourcePartition()).append(",");
        if (getResourceRegion() != null)
            sb.append("ResourceRegion: ").append(getResourceRegion()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getResourceDetailsOther() != null)
            sb.append("ResourceDetailsOther: ").append(getResourceDetailsOther()).append(",");
        if (getComplianceStatus() != null)
            sb.append("ComplianceStatus: ").append(getComplianceStatus()).append(",");
        if (getComplianceSecurityControlId() != null)
            sb.append("ComplianceSecurityControlId: ").append(getComplianceSecurityControlId()).append(",");
        if (getComplianceAssociatedStandardsId() != null)
            sb.append("ComplianceAssociatedStandardsId: ").append(getComplianceAssociatedStandardsId()).append(",");
        if (getVerificationState() != null)
            sb.append("VerificationState: ").append(getVerificationState()).append(",");
        if (getWorkflowStatus() != null)
            sb.append("WorkflowStatus: ").append(getWorkflowStatus()).append(",");
        if (getRecordState() != null)
            sb.append("RecordState: ").append(getRecordState()).append(",");
        if (getRelatedFindingsProductArn() != null)
            sb.append("RelatedFindingsProductArn: ").append(getRelatedFindingsProductArn()).append(",");
        if (getRelatedFindingsId() != null)
            sb.append("RelatedFindingsId: ").append(getRelatedFindingsId()).append(",");
        if (getNoteText() != null)
            sb.append("NoteText: ").append(getNoteText()).append(",");
        if (getNoteUpdatedAt() != null)
            sb.append("NoteUpdatedAt: ").append(getNoteUpdatedAt()).append(",");
        if (getNoteUpdatedBy() != null)
            sb.append("NoteUpdatedBy: ").append(getNoteUpdatedBy()).append(",");
        if (getUserDefinedFields() != null)
            sb.append("UserDefinedFields: ").append(getUserDefinedFields()).append(",");
        if (getResourceApplicationArn() != null)
            sb.append("ResourceApplicationArn: ").append(getResourceApplicationArn()).append(",");
        if (getResourceApplicationName() != null)
            sb.append("ResourceApplicationName: ").append(getResourceApplicationName()).append(",");
        if (getAwsAccountName() != null)
            sb.append("AwsAccountName: ").append(getAwsAccountName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomationRulesFindingFilters == false)
            return false;
        AutomationRulesFindingFilters other = (AutomationRulesFindingFilters) obj;
        if (other.getProductArn() == null ^ this.getProductArn() == null)
            return false;
        if (other.getProductArn() != null && other.getProductArn().equals(this.getProductArn()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getGeneratorId() == null ^ this.getGeneratorId() == null)
            return false;
        if (other.getGeneratorId() != null && other.getGeneratorId().equals(this.getGeneratorId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getFirstObservedAt() == null ^ this.getFirstObservedAt() == null)
            return false;
        if (other.getFirstObservedAt() != null && other.getFirstObservedAt().equals(this.getFirstObservedAt()) == false)
            return false;
        if (other.getLastObservedAt() == null ^ this.getLastObservedAt() == null)
            return false;
        if (other.getLastObservedAt() != null && other.getLastObservedAt().equals(this.getLastObservedAt()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getCriticality() == null ^ this.getCriticality() == null)
            return false;
        if (other.getCriticality() != null && other.getCriticality().equals(this.getCriticality()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSourceUrl() == null ^ this.getSourceUrl() == null)
            return false;
        if (other.getSourceUrl() != null && other.getSourceUrl().equals(this.getSourceUrl()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null && other.getProductName().equals(this.getProductName()) == false)
            return false;
        if (other.getCompanyName() == null ^ this.getCompanyName() == null)
            return false;
        if (other.getCompanyName() != null && other.getCompanyName().equals(this.getCompanyName()) == false)
            return false;
        if (other.getSeverityLabel() == null ^ this.getSeverityLabel() == null)
            return false;
        if (other.getSeverityLabel() != null && other.getSeverityLabel().equals(this.getSeverityLabel()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourcePartition() == null ^ this.getResourcePartition() == null)
            return false;
        if (other.getResourcePartition() != null && other.getResourcePartition().equals(this.getResourcePartition()) == false)
            return false;
        if (other.getResourceRegion() == null ^ this.getResourceRegion() == null)
            return false;
        if (other.getResourceRegion() != null && other.getResourceRegion().equals(this.getResourceRegion()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getResourceDetailsOther() == null ^ this.getResourceDetailsOther() == null)
            return false;
        if (other.getResourceDetailsOther() != null && other.getResourceDetailsOther().equals(this.getResourceDetailsOther()) == false)
            return false;
        if (other.getComplianceStatus() == null ^ this.getComplianceStatus() == null)
            return false;
        if (other.getComplianceStatus() != null && other.getComplianceStatus().equals(this.getComplianceStatus()) == false)
            return false;
        if (other.getComplianceSecurityControlId() == null ^ this.getComplianceSecurityControlId() == null)
            return false;
        if (other.getComplianceSecurityControlId() != null && other.getComplianceSecurityControlId().equals(this.getComplianceSecurityControlId()) == false)
            return false;
        if (other.getComplianceAssociatedStandardsId() == null ^ this.getComplianceAssociatedStandardsId() == null)
            return false;
        if (other.getComplianceAssociatedStandardsId() != null
                && other.getComplianceAssociatedStandardsId().equals(this.getComplianceAssociatedStandardsId()) == false)
            return false;
        if (other.getVerificationState() == null ^ this.getVerificationState() == null)
            return false;
        if (other.getVerificationState() != null && other.getVerificationState().equals(this.getVerificationState()) == false)
            return false;
        if (other.getWorkflowStatus() == null ^ this.getWorkflowStatus() == null)
            return false;
        if (other.getWorkflowStatus() != null && other.getWorkflowStatus().equals(this.getWorkflowStatus()) == false)
            return false;
        if (other.getRecordState() == null ^ this.getRecordState() == null)
            return false;
        if (other.getRecordState() != null && other.getRecordState().equals(this.getRecordState()) == false)
            return false;
        if (other.getRelatedFindingsProductArn() == null ^ this.getRelatedFindingsProductArn() == null)
            return false;
        if (other.getRelatedFindingsProductArn() != null && other.getRelatedFindingsProductArn().equals(this.getRelatedFindingsProductArn()) == false)
            return false;
        if (other.getRelatedFindingsId() == null ^ this.getRelatedFindingsId() == null)
            return false;
        if (other.getRelatedFindingsId() != null && other.getRelatedFindingsId().equals(this.getRelatedFindingsId()) == false)
            return false;
        if (other.getNoteText() == null ^ this.getNoteText() == null)
            return false;
        if (other.getNoteText() != null && other.getNoteText().equals(this.getNoteText()) == false)
            return false;
        if (other.getNoteUpdatedAt() == null ^ this.getNoteUpdatedAt() == null)
            return false;
        if (other.getNoteUpdatedAt() != null && other.getNoteUpdatedAt().equals(this.getNoteUpdatedAt()) == false)
            return false;
        if (other.getNoteUpdatedBy() == null ^ this.getNoteUpdatedBy() == null)
            return false;
        if (other.getNoteUpdatedBy() != null && other.getNoteUpdatedBy().equals(this.getNoteUpdatedBy()) == false)
            return false;
        if (other.getUserDefinedFields() == null ^ this.getUserDefinedFields() == null)
            return false;
        if (other.getUserDefinedFields() != null && other.getUserDefinedFields().equals(this.getUserDefinedFields()) == false)
            return false;
        if (other.getResourceApplicationArn() == null ^ this.getResourceApplicationArn() == null)
            return false;
        if (other.getResourceApplicationArn() != null && other.getResourceApplicationArn().equals(this.getResourceApplicationArn()) == false)
            return false;
        if (other.getResourceApplicationName() == null ^ this.getResourceApplicationName() == null)
            return false;
        if (other.getResourceApplicationName() != null && other.getResourceApplicationName().equals(this.getResourceApplicationName()) == false)
            return false;
        if (other.getAwsAccountName() == null ^ this.getAwsAccountName() == null)
            return false;
        if (other.getAwsAccountName() != null && other.getAwsAccountName().equals(this.getAwsAccountName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductArn() == null) ? 0 : getProductArn().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getGeneratorId() == null) ? 0 : getGeneratorId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getFirstObservedAt() == null) ? 0 : getFirstObservedAt().hashCode());
        hashCode = prime * hashCode + ((getLastObservedAt() == null) ? 0 : getLastObservedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getCriticality() == null) ? 0 : getCriticality().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSourceUrl() == null) ? 0 : getSourceUrl().hashCode());
        hashCode = prime * hashCode + ((getProductName() == null) ? 0 : getProductName().hashCode());
        hashCode = prime * hashCode + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        hashCode = prime * hashCode + ((getSeverityLabel() == null) ? 0 : getSeverityLabel().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourcePartition() == null) ? 0 : getResourcePartition().hashCode());
        hashCode = prime * hashCode + ((getResourceRegion() == null) ? 0 : getResourceRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getResourceDetailsOther() == null) ? 0 : getResourceDetailsOther().hashCode());
        hashCode = prime * hashCode + ((getComplianceStatus() == null) ? 0 : getComplianceStatus().hashCode());
        hashCode = prime * hashCode + ((getComplianceSecurityControlId() == null) ? 0 : getComplianceSecurityControlId().hashCode());
        hashCode = prime * hashCode + ((getComplianceAssociatedStandardsId() == null) ? 0 : getComplianceAssociatedStandardsId().hashCode());
        hashCode = prime * hashCode + ((getVerificationState() == null) ? 0 : getVerificationState().hashCode());
        hashCode = prime * hashCode + ((getWorkflowStatus() == null) ? 0 : getWorkflowStatus().hashCode());
        hashCode = prime * hashCode + ((getRecordState() == null) ? 0 : getRecordState().hashCode());
        hashCode = prime * hashCode + ((getRelatedFindingsProductArn() == null) ? 0 : getRelatedFindingsProductArn().hashCode());
        hashCode = prime * hashCode + ((getRelatedFindingsId() == null) ? 0 : getRelatedFindingsId().hashCode());
        hashCode = prime * hashCode + ((getNoteText() == null) ? 0 : getNoteText().hashCode());
        hashCode = prime * hashCode + ((getNoteUpdatedAt() == null) ? 0 : getNoteUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getNoteUpdatedBy() == null) ? 0 : getNoteUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getUserDefinedFields() == null) ? 0 : getUserDefinedFields().hashCode());
        hashCode = prime * hashCode + ((getResourceApplicationArn() == null) ? 0 : getResourceApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getResourceApplicationName() == null) ? 0 : getResourceApplicationName().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountName() == null) ? 0 : getAwsAccountName().hashCode());
        return hashCode;
    }

    @Override
    public AutomationRulesFindingFilters clone() {
        try {
            return (AutomationRulesFindingFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AutomationRulesFindingFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
