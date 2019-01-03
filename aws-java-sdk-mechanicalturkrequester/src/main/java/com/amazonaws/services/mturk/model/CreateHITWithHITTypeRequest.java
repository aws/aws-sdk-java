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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateHITWithHITType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHITWithHITTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The HIT type ID you want to create this HIT with.
     * </p>
     */
    private String hITTypeId;
    /**
     * <p>
     * The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     * </p>
     */
    private Integer maxAssignments;
    /**
     * <p>
     * An amount of time, in seconds, after which the HIT is no longer available for users to accept. After the lifetime
     * of the HIT elapses, the HIT no longer appears in HIT searches, even if not all of the assignments for the HIT
     * have been accepted.
     * </p>
     */
    private Long lifetimeInSeconds;
    /**
     * <p>
     * The data the person completing the HIT uses to produce the results.
     * </p>
     * <p>
     * Constraints: Must be a QuestionForm data structure, an ExternalQuestion data structure, or an HTMLQuestion data
     * structure. The XML question data must not be larger than 64 kilobytes (65,535 bytes) in size, including
     * whitespace.
     * </p>
     * <p>
     * Either a Question parameter or a HITLayoutId parameter must be provided.
     * </p>
     */
    private String question;
    /**
     * <p>
     * An arbitrary data field. The RequesterAnnotation parameter lets your application attach arbitrary data to the HIT
     * for tracking purposes. For example, this parameter could be an identifier internal to the Requester's application
     * that corresponds with the HIT.
     * </p>
     * <p>
     * The RequesterAnnotation parameter for a HIT is only visible to the Requester who created the HIT. It is not shown
     * to the Worker, or any other Requester.
     * </p>
     * <p>
     * The RequesterAnnotation parameter may be different for each HIT you submit. It does not affect how your HITs are
     * grouped.
     * </p>
     */
    private String requesterAnnotation;
    /**
     * <p>
     * A unique identifier for this request which allows you to retry the call on error without creating duplicate HITs.
     * This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the
     * server. If the HIT already exists in the system from a previous call using the same UniqueRequestToken,
     * subsequent calls will return a AWS.MechanicalTurk.HitAlreadyExists error with a message containing the HITId.
     * </p>
     * <note>
     * <p>
     * Note: It is your responsibility to ensure uniqueness of the token. The unique token expires after 24 hours.
     * Subsequent calls using the same UniqueRequestToken made after the 24 hour limit could create duplicate HITs.
     * </p>
     * </note>
     */
    private String uniqueRequestToken;
    /**
     * <p>
     * The Assignment-level Review Policy applies to the assignments under the HIT. You can specify for Mechanical Turk
     * to take various actions based on the policy.
     * </p>
     */
    private ReviewPolicy assignmentReviewPolicy;
    /**
     * <p>
     * The HIT-level Review Policy applies to the HIT. You can specify for Mechanical Turk to take various actions based
     * on the policy.
     * </p>
     */
    private ReviewPolicy hITReviewPolicy;
    /**
     * <p>
     * The HITLayoutId allows you to use a pre-existing HIT design with placeholder values and create an additional HIT
     * by providing those values as HITLayoutParameters.
     * </p>
     * <p>
     * Constraints: Either a Question parameter or a HITLayoutId parameter must be provided.
     * </p>
     */
    private String hITLayoutId;
    /**
     * <p>
     * If the HITLayoutId is provided, any placeholder values must be filled in with values using the HITLayoutParameter
     * structure. For more information, see HITLayout.
     * </p>
     */
    private java.util.List<HITLayoutParameter> hITLayoutParameters;

    /**
     * <p>
     * The HIT type ID you want to create this HIT with.
     * </p>
     * 
     * @param hITTypeId
     *        The HIT type ID you want to create this HIT with.
     */

    public void setHITTypeId(String hITTypeId) {
        this.hITTypeId = hITTypeId;
    }

    /**
     * <p>
     * The HIT type ID you want to create this HIT with.
     * </p>
     * 
     * @return The HIT type ID you want to create this HIT with.
     */

    public String getHITTypeId() {
        return this.hITTypeId;
    }

    /**
     * <p>
     * The HIT type ID you want to create this HIT with.
     * </p>
     * 
     * @param hITTypeId
     *        The HIT type ID you want to create this HIT with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITWithHITTypeRequest withHITTypeId(String hITTypeId) {
        setHITTypeId(hITTypeId);
        return this;
    }

    /**
     * <p>
     * The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     * </p>
     * 
     * @param maxAssignments
     *        The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     */

    public void setMaxAssignments(Integer maxAssignments) {
        this.maxAssignments = maxAssignments;
    }

    /**
     * <p>
     * The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     * </p>
     * 
     * @return The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     */

    public Integer getMaxAssignments() {
        return this.maxAssignments;
    }

    /**
     * <p>
     * The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     * </p>
     * 
     * @param maxAssignments
     *        The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITWithHITTypeRequest withMaxAssignments(Integer maxAssignments) {
        setMaxAssignments(maxAssignments);
        return this;
    }

    /**
     * <p>
     * An amount of time, in seconds, after which the HIT is no longer available for users to accept. After the lifetime
     * of the HIT elapses, the HIT no longer appears in HIT searches, even if not all of the assignments for the HIT
     * have been accepted.
     * </p>
     * 
     * @param lifetimeInSeconds
     *        An amount of time, in seconds, after which the HIT is no longer available for users to accept. After the
     *        lifetime of the HIT elapses, the HIT no longer appears in HIT searches, even if not all of the assignments
     *        for the HIT have been accepted.
     */

    public void setLifetimeInSeconds(Long lifetimeInSeconds) {
        this.lifetimeInSeconds = lifetimeInSeconds;
    }

    /**
     * <p>
     * An amount of time, in seconds, after which the HIT is no longer available for users to accept. After the lifetime
     * of the HIT elapses, the HIT no longer appears in HIT searches, even if not all of the assignments for the HIT
     * have been accepted.
     * </p>
     * 
     * @return An amount of time, in seconds, after which the HIT is no longer available for users to accept. After the
     *         lifetime of the HIT elapses, the HIT no longer appears in HIT searches, even if not all of the
     *         assignments for the HIT have been accepted.
     */

    public Long getLifetimeInSeconds() {
        return this.lifetimeInSeconds;
    }

    /**
     * <p>
     * An amount of time, in seconds, after which the HIT is no longer available for users to accept. After the lifetime
     * of the HIT elapses, the HIT no longer appears in HIT searches, even if not all of the assignments for the HIT
     * have been accepted.
     * </p>
     * 
     * @param lifetimeInSeconds
     *        An amount of time, in seconds, after which the HIT is no longer available for users to accept. After the
     *        lifetime of the HIT elapses, the HIT no longer appears in HIT searches, even if not all of the assignments
     *        for the HIT have been accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITWithHITTypeRequest withLifetimeInSeconds(Long lifetimeInSeconds) {
        setLifetimeInSeconds(lifetimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The data the person completing the HIT uses to produce the results.
     * </p>
     * <p>
     * Constraints: Must be a QuestionForm data structure, an ExternalQuestion data structure, or an HTMLQuestion data
     * structure. The XML question data must not be larger than 64 kilobytes (65,535 bytes) in size, including
     * whitespace.
     * </p>
     * <p>
     * Either a Question parameter or a HITLayoutId parameter must be provided.
     * </p>
     * 
     * @param question
     *        The data the person completing the HIT uses to produce the results. </p>
     *        <p>
     *        Constraints: Must be a QuestionForm data structure, an ExternalQuestion data structure, or an HTMLQuestion
     *        data structure. The XML question data must not be larger than 64 kilobytes (65,535 bytes) in size,
     *        including whitespace.
     *        </p>
     *        <p>
     *        Either a Question parameter or a HITLayoutId parameter must be provided.
     */

    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * <p>
     * The data the person completing the HIT uses to produce the results.
     * </p>
     * <p>
     * Constraints: Must be a QuestionForm data structure, an ExternalQuestion data structure, or an HTMLQuestion data
     * structure. The XML question data must not be larger than 64 kilobytes (65,535 bytes) in size, including
     * whitespace.
     * </p>
     * <p>
     * Either a Question parameter or a HITLayoutId parameter must be provided.
     * </p>
     * 
     * @return The data the person completing the HIT uses to produce the results. </p>
     *         <p>
     *         Constraints: Must be a QuestionForm data structure, an ExternalQuestion data structure, or an
     *         HTMLQuestion data structure. The XML question data must not be larger than 64 kilobytes (65,535 bytes) in
     *         size, including whitespace.
     *         </p>
     *         <p>
     *         Either a Question parameter or a HITLayoutId parameter must be provided.
     */

    public String getQuestion() {
        return this.question;
    }

    /**
     * <p>
     * The data the person completing the HIT uses to produce the results.
     * </p>
     * <p>
     * Constraints: Must be a QuestionForm data structure, an ExternalQuestion data structure, or an HTMLQuestion data
     * structure. The XML question data must not be larger than 64 kilobytes (65,535 bytes) in size, including
     * whitespace.
     * </p>
     * <p>
     * Either a Question parameter or a HITLayoutId parameter must be provided.
     * </p>
     * 
     * @param question
     *        The data the person completing the HIT uses to produce the results. </p>
     *        <p>
     *        Constraints: Must be a QuestionForm data structure, an ExternalQuestion data structure, or an HTMLQuestion
     *        data structure. The XML question data must not be larger than 64 kilobytes (65,535 bytes) in size,
     *        including whitespace.
     *        </p>
     *        <p>
     *        Either a Question parameter or a HITLayoutId parameter must be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITWithHITTypeRequest withQuestion(String question) {
        setQuestion(question);
        return this;
    }

    /**
     * <p>
     * An arbitrary data field. The RequesterAnnotation parameter lets your application attach arbitrary data to the HIT
     * for tracking purposes. For example, this parameter could be an identifier internal to the Requester's application
     * that corresponds with the HIT.
     * </p>
     * <p>
     * The RequesterAnnotation parameter for a HIT is only visible to the Requester who created the HIT. It is not shown
     * to the Worker, or any other Requester.
     * </p>
     * <p>
     * The RequesterAnnotation parameter may be different for each HIT you submit. It does not affect how your HITs are
     * grouped.
     * </p>
     * 
     * @param requesterAnnotation
     *        An arbitrary data field. The RequesterAnnotation parameter lets your application attach arbitrary data to
     *        the HIT for tracking purposes. For example, this parameter could be an identifier internal to the
     *        Requester's application that corresponds with the HIT. </p>
     *        <p>
     *        The RequesterAnnotation parameter for a HIT is only visible to the Requester who created the HIT. It is
     *        not shown to the Worker, or any other Requester.
     *        </p>
     *        <p>
     *        The RequesterAnnotation parameter may be different for each HIT you submit. It does not affect how your
     *        HITs are grouped.
     */

    public void setRequesterAnnotation(String requesterAnnotation) {
        this.requesterAnnotation = requesterAnnotation;
    }

    /**
     * <p>
     * An arbitrary data field. The RequesterAnnotation parameter lets your application attach arbitrary data to the HIT
     * for tracking purposes. For example, this parameter could be an identifier internal to the Requester's application
     * that corresponds with the HIT.
     * </p>
     * <p>
     * The RequesterAnnotation parameter for a HIT is only visible to the Requester who created the HIT. It is not shown
     * to the Worker, or any other Requester.
     * </p>
     * <p>
     * The RequesterAnnotation parameter may be different for each HIT you submit. It does not affect how your HITs are
     * grouped.
     * </p>
     * 
     * @return An arbitrary data field. The RequesterAnnotation parameter lets your application attach arbitrary data to
     *         the HIT for tracking purposes. For example, this parameter could be an identifier internal to the
     *         Requester's application that corresponds with the HIT. </p>
     *         <p>
     *         The RequesterAnnotation parameter for a HIT is only visible to the Requester who created the HIT. It is
     *         not shown to the Worker, or any other Requester.
     *         </p>
     *         <p>
     *         The RequesterAnnotation parameter may be different for each HIT you submit. It does not affect how your
     *         HITs are grouped.
     */

    public String getRequesterAnnotation() {
        return this.requesterAnnotation;
    }

    /**
     * <p>
     * An arbitrary data field. The RequesterAnnotation parameter lets your application attach arbitrary data to the HIT
     * for tracking purposes. For example, this parameter could be an identifier internal to the Requester's application
     * that corresponds with the HIT.
     * </p>
     * <p>
     * The RequesterAnnotation parameter for a HIT is only visible to the Requester who created the HIT. It is not shown
     * to the Worker, or any other Requester.
     * </p>
     * <p>
     * The RequesterAnnotation parameter may be different for each HIT you submit. It does not affect how your HITs are
     * grouped.
     * </p>
     * 
     * @param requesterAnnotation
     *        An arbitrary data field. The RequesterAnnotation parameter lets your application attach arbitrary data to
     *        the HIT for tracking purposes. For example, this parameter could be an identifier internal to the
     *        Requester's application that corresponds with the HIT. </p>
     *        <p>
     *        The RequesterAnnotation parameter for a HIT is only visible to the Requester who created the HIT. It is
     *        not shown to the Worker, or any other Requester.
     *        </p>
     *        <p>
     *        The RequesterAnnotation parameter may be different for each HIT you submit. It does not affect how your
     *        HITs are grouped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITWithHITTypeRequest withRequesterAnnotation(String requesterAnnotation) {
        setRequesterAnnotation(requesterAnnotation);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this request which allows you to retry the call on error without creating duplicate HITs.
     * This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the
     * server. If the HIT already exists in the system from a previous call using the same UniqueRequestToken,
     * subsequent calls will return a AWS.MechanicalTurk.HitAlreadyExists error with a message containing the HITId.
     * </p>
     * <note>
     * <p>
     * Note: It is your responsibility to ensure uniqueness of the token. The unique token expires after 24 hours.
     * Subsequent calls using the same UniqueRequestToken made after the 24 hour limit could create duplicate HITs.
     * </p>
     * </note>
     * 
     * @param uniqueRequestToken
     *        A unique identifier for this request which allows you to retry the call on error without creating
     *        duplicate HITs. This is useful in cases such as network timeouts where it is unclear whether or not the
     *        call succeeded on the server. If the HIT already exists in the system from a previous call using the same
     *        UniqueRequestToken, subsequent calls will return a AWS.MechanicalTurk.HitAlreadyExists error with a
     *        message containing the HITId. </p> <note>
     *        <p>
     *        Note: It is your responsibility to ensure uniqueness of the token. The unique token expires after 24
     *        hours. Subsequent calls using the same UniqueRequestToken made after the 24 hour limit could create
     *        duplicate HITs.
     *        </p>
     */

    public void setUniqueRequestToken(String uniqueRequestToken) {
        this.uniqueRequestToken = uniqueRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this request which allows you to retry the call on error without creating duplicate HITs.
     * This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the
     * server. If the HIT already exists in the system from a previous call using the same UniqueRequestToken,
     * subsequent calls will return a AWS.MechanicalTurk.HitAlreadyExists error with a message containing the HITId.
     * </p>
     * <note>
     * <p>
     * Note: It is your responsibility to ensure uniqueness of the token. The unique token expires after 24 hours.
     * Subsequent calls using the same UniqueRequestToken made after the 24 hour limit could create duplicate HITs.
     * </p>
     * </note>
     * 
     * @return A unique identifier for this request which allows you to retry the call on error without creating
     *         duplicate HITs. This is useful in cases such as network timeouts where it is unclear whether or not the
     *         call succeeded on the server. If the HIT already exists in the system from a previous call using the same
     *         UniqueRequestToken, subsequent calls will return a AWS.MechanicalTurk.HitAlreadyExists error with a
     *         message containing the HITId. </p> <note>
     *         <p>
     *         Note: It is your responsibility to ensure uniqueness of the token. The unique token expires after 24
     *         hours. Subsequent calls using the same UniqueRequestToken made after the 24 hour limit could create
     *         duplicate HITs.
     *         </p>
     */

    public String getUniqueRequestToken() {
        return this.uniqueRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this request which allows you to retry the call on error without creating duplicate HITs.
     * This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the
     * server. If the HIT already exists in the system from a previous call using the same UniqueRequestToken,
     * subsequent calls will return a AWS.MechanicalTurk.HitAlreadyExists error with a message containing the HITId.
     * </p>
     * <note>
     * <p>
     * Note: It is your responsibility to ensure uniqueness of the token. The unique token expires after 24 hours.
     * Subsequent calls using the same UniqueRequestToken made after the 24 hour limit could create duplicate HITs.
     * </p>
     * </note>
     * 
     * @param uniqueRequestToken
     *        A unique identifier for this request which allows you to retry the call on error without creating
     *        duplicate HITs. This is useful in cases such as network timeouts where it is unclear whether or not the
     *        call succeeded on the server. If the HIT already exists in the system from a previous call using the same
     *        UniqueRequestToken, subsequent calls will return a AWS.MechanicalTurk.HitAlreadyExists error with a
     *        message containing the HITId. </p> <note>
     *        <p>
     *        Note: It is your responsibility to ensure uniqueness of the token. The unique token expires after 24
     *        hours. Subsequent calls using the same UniqueRequestToken made after the 24 hour limit could create
     *        duplicate HITs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITWithHITTypeRequest withUniqueRequestToken(String uniqueRequestToken) {
        setUniqueRequestToken(uniqueRequestToken);
        return this;
    }

    /**
     * <p>
     * The Assignment-level Review Policy applies to the assignments under the HIT. You can specify for Mechanical Turk
     * to take various actions based on the policy.
     * </p>
     * 
     * @param assignmentReviewPolicy
     *        The Assignment-level Review Policy applies to the assignments under the HIT. You can specify for
     *        Mechanical Turk to take various actions based on the policy.
     */

    public void setAssignmentReviewPolicy(ReviewPolicy assignmentReviewPolicy) {
        this.assignmentReviewPolicy = assignmentReviewPolicy;
    }

    /**
     * <p>
     * The Assignment-level Review Policy applies to the assignments under the HIT. You can specify for Mechanical Turk
     * to take various actions based on the policy.
     * </p>
     * 
     * @return The Assignment-level Review Policy applies to the assignments under the HIT. You can specify for
     *         Mechanical Turk to take various actions based on the policy.
     */

    public ReviewPolicy getAssignmentReviewPolicy() {
        return this.assignmentReviewPolicy;
    }

    /**
     * <p>
     * The Assignment-level Review Policy applies to the assignments under the HIT. You can specify for Mechanical Turk
     * to take various actions based on the policy.
     * </p>
     * 
     * @param assignmentReviewPolicy
     *        The Assignment-level Review Policy applies to the assignments under the HIT. You can specify for
     *        Mechanical Turk to take various actions based on the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITWithHITTypeRequest withAssignmentReviewPolicy(ReviewPolicy assignmentReviewPolicy) {
        setAssignmentReviewPolicy(assignmentReviewPolicy);
        return this;
    }

    /**
     * <p>
     * The HIT-level Review Policy applies to the HIT. You can specify for Mechanical Turk to take various actions based
     * on the policy.
     * </p>
     * 
     * @param hITReviewPolicy
     *        The HIT-level Review Policy applies to the HIT. You can specify for Mechanical Turk to take various
     *        actions based on the policy.
     */

    public void setHITReviewPolicy(ReviewPolicy hITReviewPolicy) {
        this.hITReviewPolicy = hITReviewPolicy;
    }

    /**
     * <p>
     * The HIT-level Review Policy applies to the HIT. You can specify for Mechanical Turk to take various actions based
     * on the policy.
     * </p>
     * 
     * @return The HIT-level Review Policy applies to the HIT. You can specify for Mechanical Turk to take various
     *         actions based on the policy.
     */

    public ReviewPolicy getHITReviewPolicy() {
        return this.hITReviewPolicy;
    }

    /**
     * <p>
     * The HIT-level Review Policy applies to the HIT. You can specify for Mechanical Turk to take various actions based
     * on the policy.
     * </p>
     * 
     * @param hITReviewPolicy
     *        The HIT-level Review Policy applies to the HIT. You can specify for Mechanical Turk to take various
     *        actions based on the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITWithHITTypeRequest withHITReviewPolicy(ReviewPolicy hITReviewPolicy) {
        setHITReviewPolicy(hITReviewPolicy);
        return this;
    }

    /**
     * <p>
     * The HITLayoutId allows you to use a pre-existing HIT design with placeholder values and create an additional HIT
     * by providing those values as HITLayoutParameters.
     * </p>
     * <p>
     * Constraints: Either a Question parameter or a HITLayoutId parameter must be provided.
     * </p>
     * 
     * @param hITLayoutId
     *        The HITLayoutId allows you to use a pre-existing HIT design with placeholder values and create an
     *        additional HIT by providing those values as HITLayoutParameters. </p>
     *        <p>
     *        Constraints: Either a Question parameter or a HITLayoutId parameter must be provided.
     */

    public void setHITLayoutId(String hITLayoutId) {
        this.hITLayoutId = hITLayoutId;
    }

    /**
     * <p>
     * The HITLayoutId allows you to use a pre-existing HIT design with placeholder values and create an additional HIT
     * by providing those values as HITLayoutParameters.
     * </p>
     * <p>
     * Constraints: Either a Question parameter or a HITLayoutId parameter must be provided.
     * </p>
     * 
     * @return The HITLayoutId allows you to use a pre-existing HIT design with placeholder values and create an
     *         additional HIT by providing those values as HITLayoutParameters. </p>
     *         <p>
     *         Constraints: Either a Question parameter or a HITLayoutId parameter must be provided.
     */

    public String getHITLayoutId() {
        return this.hITLayoutId;
    }

    /**
     * <p>
     * The HITLayoutId allows you to use a pre-existing HIT design with placeholder values and create an additional HIT
     * by providing those values as HITLayoutParameters.
     * </p>
     * <p>
     * Constraints: Either a Question parameter or a HITLayoutId parameter must be provided.
     * </p>
     * 
     * @param hITLayoutId
     *        The HITLayoutId allows you to use a pre-existing HIT design with placeholder values and create an
     *        additional HIT by providing those values as HITLayoutParameters. </p>
     *        <p>
     *        Constraints: Either a Question parameter or a HITLayoutId parameter must be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITWithHITTypeRequest withHITLayoutId(String hITLayoutId) {
        setHITLayoutId(hITLayoutId);
        return this;
    }

    /**
     * <p>
     * If the HITLayoutId is provided, any placeholder values must be filled in with values using the HITLayoutParameter
     * structure. For more information, see HITLayout.
     * </p>
     * 
     * @return If the HITLayoutId is provided, any placeholder values must be filled in with values using the
     *         HITLayoutParameter structure. For more information, see HITLayout.
     */

    public java.util.List<HITLayoutParameter> getHITLayoutParameters() {
        return hITLayoutParameters;
    }

    /**
     * <p>
     * If the HITLayoutId is provided, any placeholder values must be filled in with values using the HITLayoutParameter
     * structure. For more information, see HITLayout.
     * </p>
     * 
     * @param hITLayoutParameters
     *        If the HITLayoutId is provided, any placeholder values must be filled in with values using the
     *        HITLayoutParameter structure. For more information, see HITLayout.
     */

    public void setHITLayoutParameters(java.util.Collection<HITLayoutParameter> hITLayoutParameters) {
        if (hITLayoutParameters == null) {
            this.hITLayoutParameters = null;
            return;
        }

        this.hITLayoutParameters = new java.util.ArrayList<HITLayoutParameter>(hITLayoutParameters);
    }

    /**
     * <p>
     * If the HITLayoutId is provided, any placeholder values must be filled in with values using the HITLayoutParameter
     * structure. For more information, see HITLayout.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHITLayoutParameters(java.util.Collection)} or {@link #withHITLayoutParameters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param hITLayoutParameters
     *        If the HITLayoutId is provided, any placeholder values must be filled in with values using the
     *        HITLayoutParameter structure. For more information, see HITLayout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITWithHITTypeRequest withHITLayoutParameters(HITLayoutParameter... hITLayoutParameters) {
        if (this.hITLayoutParameters == null) {
            setHITLayoutParameters(new java.util.ArrayList<HITLayoutParameter>(hITLayoutParameters.length));
        }
        for (HITLayoutParameter ele : hITLayoutParameters) {
            this.hITLayoutParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the HITLayoutId is provided, any placeholder values must be filled in with values using the HITLayoutParameter
     * structure. For more information, see HITLayout.
     * </p>
     * 
     * @param hITLayoutParameters
     *        If the HITLayoutId is provided, any placeholder values must be filled in with values using the
     *        HITLayoutParameter structure. For more information, see HITLayout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITWithHITTypeRequest withHITLayoutParameters(java.util.Collection<HITLayoutParameter> hITLayoutParameters) {
        setHITLayoutParameters(hITLayoutParameters);
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
        if (getHITTypeId() != null)
            sb.append("HITTypeId: ").append(getHITTypeId()).append(",");
        if (getMaxAssignments() != null)
            sb.append("MaxAssignments: ").append(getMaxAssignments()).append(",");
        if (getLifetimeInSeconds() != null)
            sb.append("LifetimeInSeconds: ").append(getLifetimeInSeconds()).append(",");
        if (getQuestion() != null)
            sb.append("Question: ").append(getQuestion()).append(",");
        if (getRequesterAnnotation() != null)
            sb.append("RequesterAnnotation: ").append(getRequesterAnnotation()).append(",");
        if (getUniqueRequestToken() != null)
            sb.append("UniqueRequestToken: ").append(getUniqueRequestToken()).append(",");
        if (getAssignmentReviewPolicy() != null)
            sb.append("AssignmentReviewPolicy: ").append(getAssignmentReviewPolicy()).append(",");
        if (getHITReviewPolicy() != null)
            sb.append("HITReviewPolicy: ").append(getHITReviewPolicy()).append(",");
        if (getHITLayoutId() != null)
            sb.append("HITLayoutId: ").append(getHITLayoutId()).append(",");
        if (getHITLayoutParameters() != null)
            sb.append("HITLayoutParameters: ").append(getHITLayoutParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHITWithHITTypeRequest == false)
            return false;
        CreateHITWithHITTypeRequest other = (CreateHITWithHITTypeRequest) obj;
        if (other.getHITTypeId() == null ^ this.getHITTypeId() == null)
            return false;
        if (other.getHITTypeId() != null && other.getHITTypeId().equals(this.getHITTypeId()) == false)
            return false;
        if (other.getMaxAssignments() == null ^ this.getMaxAssignments() == null)
            return false;
        if (other.getMaxAssignments() != null && other.getMaxAssignments().equals(this.getMaxAssignments()) == false)
            return false;
        if (other.getLifetimeInSeconds() == null ^ this.getLifetimeInSeconds() == null)
            return false;
        if (other.getLifetimeInSeconds() != null && other.getLifetimeInSeconds().equals(this.getLifetimeInSeconds()) == false)
            return false;
        if (other.getQuestion() == null ^ this.getQuestion() == null)
            return false;
        if (other.getQuestion() != null && other.getQuestion().equals(this.getQuestion()) == false)
            return false;
        if (other.getRequesterAnnotation() == null ^ this.getRequesterAnnotation() == null)
            return false;
        if (other.getRequesterAnnotation() != null && other.getRequesterAnnotation().equals(this.getRequesterAnnotation()) == false)
            return false;
        if (other.getUniqueRequestToken() == null ^ this.getUniqueRequestToken() == null)
            return false;
        if (other.getUniqueRequestToken() != null && other.getUniqueRequestToken().equals(this.getUniqueRequestToken()) == false)
            return false;
        if (other.getAssignmentReviewPolicy() == null ^ this.getAssignmentReviewPolicy() == null)
            return false;
        if (other.getAssignmentReviewPolicy() != null && other.getAssignmentReviewPolicy().equals(this.getAssignmentReviewPolicy()) == false)
            return false;
        if (other.getHITReviewPolicy() == null ^ this.getHITReviewPolicy() == null)
            return false;
        if (other.getHITReviewPolicy() != null && other.getHITReviewPolicy().equals(this.getHITReviewPolicy()) == false)
            return false;
        if (other.getHITLayoutId() == null ^ this.getHITLayoutId() == null)
            return false;
        if (other.getHITLayoutId() != null && other.getHITLayoutId().equals(this.getHITLayoutId()) == false)
            return false;
        if (other.getHITLayoutParameters() == null ^ this.getHITLayoutParameters() == null)
            return false;
        if (other.getHITLayoutParameters() != null && other.getHITLayoutParameters().equals(this.getHITLayoutParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHITTypeId() == null) ? 0 : getHITTypeId().hashCode());
        hashCode = prime * hashCode + ((getMaxAssignments() == null) ? 0 : getMaxAssignments().hashCode());
        hashCode = prime * hashCode + ((getLifetimeInSeconds() == null) ? 0 : getLifetimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        hashCode = prime * hashCode + ((getRequesterAnnotation() == null) ? 0 : getRequesterAnnotation().hashCode());
        hashCode = prime * hashCode + ((getUniqueRequestToken() == null) ? 0 : getUniqueRequestToken().hashCode());
        hashCode = prime * hashCode + ((getAssignmentReviewPolicy() == null) ? 0 : getAssignmentReviewPolicy().hashCode());
        hashCode = prime * hashCode + ((getHITReviewPolicy() == null) ? 0 : getHITReviewPolicy().hashCode());
        hashCode = prime * hashCode + ((getHITLayoutId() == null) ? 0 : getHITLayoutId().hashCode());
        hashCode = prime * hashCode + ((getHITLayoutParameters() == null) ? 0 : getHITLayoutParameters().hashCode());
        return hashCode;
    }

    @Override
    public CreateHITWithHITTypeRequest clone() {
        return (CreateHITWithHITTypeRequest) super.clone();
    }

}
