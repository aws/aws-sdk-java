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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateRecommendationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRecommendationTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String assessmentArn;
    /**
     * <p>
     * The name of the Amazon S3 bucket that will contain the recommendation template.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The format for the recommendation template.
     * </p>
     * <dl>
     * <dt>CfnJson</dt>
     * <dd>
     * <p>
     * The template is CloudFormation JSON.
     * </p>
     * </dd>
     * <dt>CfnYaml</dt>
     * <dd>
     * <p>
     * The template is CloudFormation YAML.
     * </p>
     * </dd>
     * </dl>
     */
    private String format;
    /**
     * <p>
     * The name for the recommendation template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Identifiers for the recommendations used to create a recommendation template.
     * </p>
     */
    private java.util.List<String> recommendationIds;
    /**
     * <p>
     * An array of strings that specify the recommendation template type or types.
     * </p>
     * <dl>
     * <dt>Alarm</dt>
     * <dd>
     * <p>
     * The template is an <a>AlarmRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Sop</dt>
     * <dd>
     * <p>
     * The template is a <a>SopRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Test</dt>
     * <dd>
     * <p>
     * The template is a <a>TestRecommendation</a> template.
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.List<String> recommendationTypes;
    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param assessmentArn
     *        The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *        information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAssessmentArn(String assessmentArn) {
        this.assessmentArn = assessmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *         information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAssessmentArn() {
        return this.assessmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param assessmentArn
     *        The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *        information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommendationTemplateRequest withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket that will contain the recommendation template.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket that will contain the recommendation template.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket that will contain the recommendation template.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket that will contain the recommendation template.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket that will contain the recommendation template.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket that will contain the recommendation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommendationTemplateRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *        characters. You should not reuse the same client token for other API requests.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @return Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *         characters. You should not reuse the same client token for other API requests.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *        characters. You should not reuse the same client token for other API requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommendationTemplateRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The format for the recommendation template.
     * </p>
     * <dl>
     * <dt>CfnJson</dt>
     * <dd>
     * <p>
     * The template is CloudFormation JSON.
     * </p>
     * </dd>
     * <dt>CfnYaml</dt>
     * <dd>
     * <p>
     * The template is CloudFormation YAML.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param format
     *        The format for the recommendation template.</p>
     *        <dl>
     *        <dt>CfnJson</dt>
     *        <dd>
     *        <p>
     *        The template is CloudFormation JSON.
     *        </p>
     *        </dd>
     *        <dt>CfnYaml</dt>
     *        <dd>
     *        <p>
     *        The template is CloudFormation YAML.
     *        </p>
     *        </dd>
     * @see TemplateFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format for the recommendation template.
     * </p>
     * <dl>
     * <dt>CfnJson</dt>
     * <dd>
     * <p>
     * The template is CloudFormation JSON.
     * </p>
     * </dd>
     * <dt>CfnYaml</dt>
     * <dd>
     * <p>
     * The template is CloudFormation YAML.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The format for the recommendation template.</p>
     *         <dl>
     *         <dt>CfnJson</dt>
     *         <dd>
     *         <p>
     *         The template is CloudFormation JSON.
     *         </p>
     *         </dd>
     *         <dt>CfnYaml</dt>
     *         <dd>
     *         <p>
     *         The template is CloudFormation YAML.
     *         </p>
     *         </dd>
     * @see TemplateFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format for the recommendation template.
     * </p>
     * <dl>
     * <dt>CfnJson</dt>
     * <dd>
     * <p>
     * The template is CloudFormation JSON.
     * </p>
     * </dd>
     * <dt>CfnYaml</dt>
     * <dd>
     * <p>
     * The template is CloudFormation YAML.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param format
     *        The format for the recommendation template.</p>
     *        <dl>
     *        <dt>CfnJson</dt>
     *        <dd>
     *        <p>
     *        The template is CloudFormation JSON.
     *        </p>
     *        </dd>
     *        <dt>CfnYaml</dt>
     *        <dd>
     *        <p>
     *        The template is CloudFormation YAML.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateFormat
     */

    public CreateRecommendationTemplateRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format for the recommendation template.
     * </p>
     * <dl>
     * <dt>CfnJson</dt>
     * <dd>
     * <p>
     * The template is CloudFormation JSON.
     * </p>
     * </dd>
     * <dt>CfnYaml</dt>
     * <dd>
     * <p>
     * The template is CloudFormation YAML.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param format
     *        The format for the recommendation template.</p>
     *        <dl>
     *        <dt>CfnJson</dt>
     *        <dd>
     *        <p>
     *        The template is CloudFormation JSON.
     *        </p>
     *        </dd>
     *        <dt>CfnYaml</dt>
     *        <dd>
     *        <p>
     *        The template is CloudFormation YAML.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateFormat
     */

    public CreateRecommendationTemplateRequest withFormat(TemplateFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The name for the recommendation template.
     * </p>
     * 
     * @param name
     *        The name for the recommendation template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the recommendation template.
     * </p>
     * 
     * @return The name for the recommendation template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the recommendation template.
     * </p>
     * 
     * @param name
     *        The name for the recommendation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommendationTemplateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Identifiers for the recommendations used to create a recommendation template.
     * </p>
     * 
     * @return Identifiers for the recommendations used to create a recommendation template.
     */

    public java.util.List<String> getRecommendationIds() {
        return recommendationIds;
    }

    /**
     * <p>
     * Identifiers for the recommendations used to create a recommendation template.
     * </p>
     * 
     * @param recommendationIds
     *        Identifiers for the recommendations used to create a recommendation template.
     */

    public void setRecommendationIds(java.util.Collection<String> recommendationIds) {
        if (recommendationIds == null) {
            this.recommendationIds = null;
            return;
        }

        this.recommendationIds = new java.util.ArrayList<String>(recommendationIds);
    }

    /**
     * <p>
     * Identifiers for the recommendations used to create a recommendation template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationIds(java.util.Collection)} or {@link #withRecommendationIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recommendationIds
     *        Identifiers for the recommendations used to create a recommendation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommendationTemplateRequest withRecommendationIds(String... recommendationIds) {
        if (this.recommendationIds == null) {
            setRecommendationIds(new java.util.ArrayList<String>(recommendationIds.length));
        }
        for (String ele : recommendationIds) {
            this.recommendationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifiers for the recommendations used to create a recommendation template.
     * </p>
     * 
     * @param recommendationIds
     *        Identifiers for the recommendations used to create a recommendation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommendationTemplateRequest withRecommendationIds(java.util.Collection<String> recommendationIds) {
        setRecommendationIds(recommendationIds);
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the recommendation template type or types.
     * </p>
     * <dl>
     * <dt>Alarm</dt>
     * <dd>
     * <p>
     * The template is an <a>AlarmRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Sop</dt>
     * <dd>
     * <p>
     * The template is a <a>SopRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Test</dt>
     * <dd>
     * <p>
     * The template is a <a>TestRecommendation</a> template.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return An array of strings that specify the recommendation template type or types.</p>
     *         <dl>
     *         <dt>Alarm</dt>
     *         <dd>
     *         <p>
     *         The template is an <a>AlarmRecommendation</a> template.
     *         </p>
     *         </dd>
     *         <dt>Sop</dt>
     *         <dd>
     *         <p>
     *         The template is a <a>SopRecommendation</a> template.
     *         </p>
     *         </dd>
     *         <dt>Test</dt>
     *         <dd>
     *         <p>
     *         The template is a <a>TestRecommendation</a> template.
     *         </p>
     *         </dd>
     * @see RenderRecommendationType
     */

    public java.util.List<String> getRecommendationTypes() {
        return recommendationTypes;
    }

    /**
     * <p>
     * An array of strings that specify the recommendation template type or types.
     * </p>
     * <dl>
     * <dt>Alarm</dt>
     * <dd>
     * <p>
     * The template is an <a>AlarmRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Sop</dt>
     * <dd>
     * <p>
     * The template is a <a>SopRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Test</dt>
     * <dd>
     * <p>
     * The template is a <a>TestRecommendation</a> template.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param recommendationTypes
     *        An array of strings that specify the recommendation template type or types.</p>
     *        <dl>
     *        <dt>Alarm</dt>
     *        <dd>
     *        <p>
     *        The template is an <a>AlarmRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Sop</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>SopRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Test</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>TestRecommendation</a> template.
     *        </p>
     *        </dd>
     * @see RenderRecommendationType
     */

    public void setRecommendationTypes(java.util.Collection<String> recommendationTypes) {
        if (recommendationTypes == null) {
            this.recommendationTypes = null;
            return;
        }

        this.recommendationTypes = new java.util.ArrayList<String>(recommendationTypes);
    }

    /**
     * <p>
     * An array of strings that specify the recommendation template type or types.
     * </p>
     * <dl>
     * <dt>Alarm</dt>
     * <dd>
     * <p>
     * The template is an <a>AlarmRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Sop</dt>
     * <dd>
     * <p>
     * The template is a <a>SopRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Test</dt>
     * <dd>
     * <p>
     * The template is a <a>TestRecommendation</a> template.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationTypes(java.util.Collection)} or {@link #withRecommendationTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param recommendationTypes
     *        An array of strings that specify the recommendation template type or types.</p>
     *        <dl>
     *        <dt>Alarm</dt>
     *        <dd>
     *        <p>
     *        The template is an <a>AlarmRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Sop</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>SopRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Test</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>TestRecommendation</a> template.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenderRecommendationType
     */

    public CreateRecommendationTemplateRequest withRecommendationTypes(String... recommendationTypes) {
        if (this.recommendationTypes == null) {
            setRecommendationTypes(new java.util.ArrayList<String>(recommendationTypes.length));
        }
        for (String ele : recommendationTypes) {
            this.recommendationTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the recommendation template type or types.
     * </p>
     * <dl>
     * <dt>Alarm</dt>
     * <dd>
     * <p>
     * The template is an <a>AlarmRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Sop</dt>
     * <dd>
     * <p>
     * The template is a <a>SopRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Test</dt>
     * <dd>
     * <p>
     * The template is a <a>TestRecommendation</a> template.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param recommendationTypes
     *        An array of strings that specify the recommendation template type or types.</p>
     *        <dl>
     *        <dt>Alarm</dt>
     *        <dd>
     *        <p>
     *        The template is an <a>AlarmRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Sop</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>SopRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Test</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>TestRecommendation</a> template.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenderRecommendationType
     */

    public CreateRecommendationTemplateRequest withRecommendationTypes(java.util.Collection<String> recommendationTypes) {
        setRecommendationTypes(recommendationTypes);
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the recommendation template type or types.
     * </p>
     * <dl>
     * <dt>Alarm</dt>
     * <dd>
     * <p>
     * The template is an <a>AlarmRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Sop</dt>
     * <dd>
     * <p>
     * The template is a <a>SopRecommendation</a> template.
     * </p>
     * </dd>
     * <dt>Test</dt>
     * <dd>
     * <p>
     * The template is a <a>TestRecommendation</a> template.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param recommendationTypes
     *        An array of strings that specify the recommendation template type or types.</p>
     *        <dl>
     *        <dt>Alarm</dt>
     *        <dd>
     *        <p>
     *        The template is an <a>AlarmRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Sop</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>SopRecommendation</a> template.
     *        </p>
     *        </dd>
     *        <dt>Test</dt>
     *        <dd>
     *        <p>
     *        The template is a <a>TestRecommendation</a> template.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenderRecommendationType
     */

    public CreateRecommendationTemplateRequest withRecommendationTypes(RenderRecommendationType... recommendationTypes) {
        java.util.ArrayList<String> recommendationTypesCopy = new java.util.ArrayList<String>(recommendationTypes.length);
        for (RenderRecommendationType value : recommendationTypes) {
            recommendationTypesCopy.add(value.toString());
        }
        if (getRecommendationTypes() == null) {
            setRecommendationTypes(recommendationTypesCopy);
        } else {
            getRecommendationTypes().addAll(recommendationTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @return The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *         Each tag consists of a key/value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key/value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key/value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommendationTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRecommendationTemplateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommendationTemplateRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommendationTemplateRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAssessmentArn() != null)
            sb.append("AssessmentArn: ").append(getAssessmentArn()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRecommendationIds() != null)
            sb.append("RecommendationIds: ").append(getRecommendationIds()).append(",");
        if (getRecommendationTypes() != null)
            sb.append("RecommendationTypes: ").append(getRecommendationTypes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRecommendationTemplateRequest == false)
            return false;
        CreateRecommendationTemplateRequest other = (CreateRecommendationTemplateRequest) obj;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecommendationIds() == null ^ this.getRecommendationIds() == null)
            return false;
        if (other.getRecommendationIds() != null && other.getRecommendationIds().equals(this.getRecommendationIds()) == false)
            return false;
        if (other.getRecommendationTypes() == null ^ this.getRecommendationTypes() == null)
            return false;
        if (other.getRecommendationTypes() != null && other.getRecommendationTypes().equals(this.getRecommendationTypes()) == false)
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

        hashCode = prime * hashCode + ((getAssessmentArn() == null) ? 0 : getAssessmentArn().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecommendationIds() == null) ? 0 : getRecommendationIds().hashCode());
        hashCode = prime * hashCode + ((getRecommendationTypes() == null) ? 0 : getRecommendationTypes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRecommendationTemplateRequest clone() {
        return (CreateRecommendationTemplateRequest) super.clone();
    }

}
