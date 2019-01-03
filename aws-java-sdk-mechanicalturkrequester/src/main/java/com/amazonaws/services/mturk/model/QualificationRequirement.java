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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The QualificationRequirement data structure describes a Qualification that a Worker must have before the Worker is
 * allowed to accept a HIT. A requirement may optionally state that a Worker must have the Qualification in order to
 * preview the HIT, or see the HIT in search results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/QualificationRequirement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QualificationRequirement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Qualification type for the requirement.
     * </p>
     */
    private String qualificationTypeId;
    /**
     * <p>
     * The kind of comparison to make against a Qualification's value. You can compare a Qualification's value to an
     * IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, or
     * NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or NotEqualTo the
     * LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or LocaleValue values.
     * Lastly, a Qualification requirement can also test if a Qualification Exists or DoesNotExist in the user's
     * profile, regardless of its value.
     * </p>
     */
    private String comparator;
    /**
     * <p>
     * The integer value to compare against the Qualification's value. IntegerValue must not be present if Comparator is
     * Exists or DoesNotExist. IntegerValue can only be used if the Qualification type has an integer value; it cannot
     * be used with the Worker_Locale QualificationType ID. When performing a set comparison by using the In or the
     * NotIn comparator, you can use up to 15 IntegerValue elements in a QualificationRequirement data structure.
     * </p>
     */
    private java.util.List<Integer> integerValues;
    /**
     * <p>
     * The locale value to compare against the Qualification's value. The local value must be a valid ISO 3166 country
     * code or supports ISO 3166-2 subdivisions. LocaleValue can only be used with a Worker_Locale QualificationType ID.
     * LocaleValue can only be used with the EqualTo, NotEqualTo, In, and NotIn comparators. You must only use a single
     * LocaleValue element when using the EqualTo or NotEqualTo comparators. When performing a set comparison by using
     * the In or the NotIn comparator, you can use up to 30 LocaleValue elements in a QualificationRequirement data
     * structure.
     * </p>
     */
    private java.util.List<Locale> localeValues;
    /**
     * <p>
     * DEPRECATED: Use the <code>ActionsGuarded</code> field instead. If RequiredToPreview is true, the question data
     * for the HIT will not be shown when a Worker whose Qualifications do not meet this requirement tries to preview
     * the HIT. That is, a Worker's Qualifications must meet all of the requirements for which RequiredToPreview is true
     * in order to preview the HIT. If a Worker meets all of the requirements where RequiredToPreview is true (or if
     * there are no such requirements), but does not meet all of the requirements for the HIT, the Worker will be
     * allowed to preview the HIT's question data, but will not be allowed to accept and complete the HIT. The default
     * is false. This should not be used in combination with the <code>ActionsGuarded</code> field.
     * </p>
     */
    @Deprecated
    private Boolean requiredToPreview;
    /**
     * <p>
     * Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement from
     * taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can preview the
     * HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview the HIT, but can see
     * the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot accept, preview, or see the HIT
     * in their search results). It's possible for you to create a HIT with multiple QualificationRequirements (which
     * can have different values for the ActionGuarded attribute). In this case, the Worker is only permitted to perform
     * an action when they have met all QualificationRequirements guarding the action. The actions in the order of least
     * restrictive to most restrictive are Discover, Preview and Accept. For example, if a Worker meets all
     * QualificationRequirements that are set to DiscoverPreviewAndAccept, but do not meet all requirements that are set
     * with PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search result, but
     * will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in combination with the
     * <code>RequiredToPreview</code> field.
     * </p>
     */
    private String actionsGuarded;

    /**
     * <p>
     * The ID of the Qualification type for the requirement.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the Qualification type for the requirement.
     */

    public void setQualificationTypeId(String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the Qualification type for the requirement.
     * </p>
     * 
     * @return The ID of the Qualification type for the requirement.
     */

    public String getQualificationTypeId() {
        return this.qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the Qualification type for the requirement.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the Qualification type for the requirement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationRequirement withQualificationTypeId(String qualificationTypeId) {
        setQualificationTypeId(qualificationTypeId);
        return this;
    }

    /**
     * <p>
     * The kind of comparison to make against a Qualification's value. You can compare a Qualification's value to an
     * IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, or
     * NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or NotEqualTo the
     * LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or LocaleValue values.
     * Lastly, a Qualification requirement can also test if a Qualification Exists or DoesNotExist in the user's
     * profile, regardless of its value.
     * </p>
     * 
     * @param comparator
     *        The kind of comparison to make against a Qualification's value. You can compare a Qualification's value to
     *        an IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo,
     *        or NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or NotEqualTo
     *        the LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or LocaleValue
     *        values. Lastly, a Qualification requirement can also test if a Qualification Exists or DoesNotExist in the
     *        user's profile, regardless of its value.
     * @see Comparator
     */

    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * <p>
     * The kind of comparison to make against a Qualification's value. You can compare a Qualification's value to an
     * IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, or
     * NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or NotEqualTo the
     * LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or LocaleValue values.
     * Lastly, a Qualification requirement can also test if a Qualification Exists or DoesNotExist in the user's
     * profile, regardless of its value.
     * </p>
     * 
     * @return The kind of comparison to make against a Qualification's value. You can compare a Qualification's value
     *         to an IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo,
     *         EqualTo, or NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or
     *         NotEqualTo the LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or
     *         LocaleValue values. Lastly, a Qualification requirement can also test if a Qualification Exists or
     *         DoesNotExist in the user's profile, regardless of its value.
     * @see Comparator
     */

    public String getComparator() {
        return this.comparator;
    }

    /**
     * <p>
     * The kind of comparison to make against a Qualification's value. You can compare a Qualification's value to an
     * IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, or
     * NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or NotEqualTo the
     * LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or LocaleValue values.
     * Lastly, a Qualification requirement can also test if a Qualification Exists or DoesNotExist in the user's
     * profile, regardless of its value.
     * </p>
     * 
     * @param comparator
     *        The kind of comparison to make against a Qualification's value. You can compare a Qualification's value to
     *        an IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo,
     *        or NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or NotEqualTo
     *        the LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or LocaleValue
     *        values. Lastly, a Qualification requirement can also test if a Qualification Exists or DoesNotExist in the
     *        user's profile, regardless of its value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Comparator
     */

    public QualificationRequirement withComparator(String comparator) {
        setComparator(comparator);
        return this;
    }

    /**
     * <p>
     * The kind of comparison to make against a Qualification's value. You can compare a Qualification's value to an
     * IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, or
     * NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or NotEqualTo the
     * LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or LocaleValue values.
     * Lastly, a Qualification requirement can also test if a Qualification Exists or DoesNotExist in the user's
     * profile, regardless of its value.
     * </p>
     * 
     * @param comparator
     *        The kind of comparison to make against a Qualification's value. You can compare a Qualification's value to
     *        an IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo,
     *        or NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or NotEqualTo
     *        the LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or LocaleValue
     *        values. Lastly, a Qualification requirement can also test if a Qualification Exists or DoesNotExist in the
     *        user's profile, regardless of its value.
     * @see Comparator
     */

    public void setComparator(Comparator comparator) {
        withComparator(comparator);
    }

    /**
     * <p>
     * The kind of comparison to make against a Qualification's value. You can compare a Qualification's value to an
     * IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, or
     * NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or NotEqualTo the
     * LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or LocaleValue values.
     * Lastly, a Qualification requirement can also test if a Qualification Exists or DoesNotExist in the user's
     * profile, regardless of its value.
     * </p>
     * 
     * @param comparator
     *        The kind of comparison to make against a Qualification's value. You can compare a Qualification's value to
     *        an IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo,
     *        or NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or NotEqualTo
     *        the LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or LocaleValue
     *        values. Lastly, a Qualification requirement can also test if a Qualification Exists or DoesNotExist in the
     *        user's profile, regardless of its value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Comparator
     */

    public QualificationRequirement withComparator(Comparator comparator) {
        this.comparator = comparator.toString();
        return this;
    }

    /**
     * <p>
     * The integer value to compare against the Qualification's value. IntegerValue must not be present if Comparator is
     * Exists or DoesNotExist. IntegerValue can only be used if the Qualification type has an integer value; it cannot
     * be used with the Worker_Locale QualificationType ID. When performing a set comparison by using the In or the
     * NotIn comparator, you can use up to 15 IntegerValue elements in a QualificationRequirement data structure.
     * </p>
     * 
     * @return The integer value to compare against the Qualification's value. IntegerValue must not be present if
     *         Comparator is Exists or DoesNotExist. IntegerValue can only be used if the Qualification type has an
     *         integer value; it cannot be used with the Worker_Locale QualificationType ID. When performing a set
     *         comparison by using the In or the NotIn comparator, you can use up to 15 IntegerValue elements in a
     *         QualificationRequirement data structure.
     */

    public java.util.List<Integer> getIntegerValues() {
        return integerValues;
    }

    /**
     * <p>
     * The integer value to compare against the Qualification's value. IntegerValue must not be present if Comparator is
     * Exists or DoesNotExist. IntegerValue can only be used if the Qualification type has an integer value; it cannot
     * be used with the Worker_Locale QualificationType ID. When performing a set comparison by using the In or the
     * NotIn comparator, you can use up to 15 IntegerValue elements in a QualificationRequirement data structure.
     * </p>
     * 
     * @param integerValues
     *        The integer value to compare against the Qualification's value. IntegerValue must not be present if
     *        Comparator is Exists or DoesNotExist. IntegerValue can only be used if the Qualification type has an
     *        integer value; it cannot be used with the Worker_Locale QualificationType ID. When performing a set
     *        comparison by using the In or the NotIn comparator, you can use up to 15 IntegerValue elements in a
     *        QualificationRequirement data structure.
     */

    public void setIntegerValues(java.util.Collection<Integer> integerValues) {
        if (integerValues == null) {
            this.integerValues = null;
            return;
        }

        this.integerValues = new java.util.ArrayList<Integer>(integerValues);
    }

    /**
     * <p>
     * The integer value to compare against the Qualification's value. IntegerValue must not be present if Comparator is
     * Exists or DoesNotExist. IntegerValue can only be used if the Qualification type has an integer value; it cannot
     * be used with the Worker_Locale QualificationType ID. When performing a set comparison by using the In or the
     * NotIn comparator, you can use up to 15 IntegerValue elements in a QualificationRequirement data structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntegerValues(java.util.Collection)} or {@link #withIntegerValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param integerValues
     *        The integer value to compare against the Qualification's value. IntegerValue must not be present if
     *        Comparator is Exists or DoesNotExist. IntegerValue can only be used if the Qualification type has an
     *        integer value; it cannot be used with the Worker_Locale QualificationType ID. When performing a set
     *        comparison by using the In or the NotIn comparator, you can use up to 15 IntegerValue elements in a
     *        QualificationRequirement data structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationRequirement withIntegerValues(Integer... integerValues) {
        if (this.integerValues == null) {
            setIntegerValues(new java.util.ArrayList<Integer>(integerValues.length));
        }
        for (Integer ele : integerValues) {
            this.integerValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The integer value to compare against the Qualification's value. IntegerValue must not be present if Comparator is
     * Exists or DoesNotExist. IntegerValue can only be used if the Qualification type has an integer value; it cannot
     * be used with the Worker_Locale QualificationType ID. When performing a set comparison by using the In or the
     * NotIn comparator, you can use up to 15 IntegerValue elements in a QualificationRequirement data structure.
     * </p>
     * 
     * @param integerValues
     *        The integer value to compare against the Qualification's value. IntegerValue must not be present if
     *        Comparator is Exists or DoesNotExist. IntegerValue can only be used if the Qualification type has an
     *        integer value; it cannot be used with the Worker_Locale QualificationType ID. When performing a set
     *        comparison by using the In or the NotIn comparator, you can use up to 15 IntegerValue elements in a
     *        QualificationRequirement data structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationRequirement withIntegerValues(java.util.Collection<Integer> integerValues) {
        setIntegerValues(integerValues);
        return this;
    }

    /**
     * <p>
     * The locale value to compare against the Qualification's value. The local value must be a valid ISO 3166 country
     * code or supports ISO 3166-2 subdivisions. LocaleValue can only be used with a Worker_Locale QualificationType ID.
     * LocaleValue can only be used with the EqualTo, NotEqualTo, In, and NotIn comparators. You must only use a single
     * LocaleValue element when using the EqualTo or NotEqualTo comparators. When performing a set comparison by using
     * the In or the NotIn comparator, you can use up to 30 LocaleValue elements in a QualificationRequirement data
     * structure.
     * </p>
     * 
     * @return The locale value to compare against the Qualification's value. The local value must be a valid ISO 3166
     *         country code or supports ISO 3166-2 subdivisions. LocaleValue can only be used with a Worker_Locale
     *         QualificationType ID. LocaleValue can only be used with the EqualTo, NotEqualTo, In, and NotIn
     *         comparators. You must only use a single LocaleValue element when using the EqualTo or NotEqualTo
     *         comparators. When performing a set comparison by using the In or the NotIn comparator, you can use up to
     *         30 LocaleValue elements in a QualificationRequirement data structure.
     */

    public java.util.List<Locale> getLocaleValues() {
        return localeValues;
    }

    /**
     * <p>
     * The locale value to compare against the Qualification's value. The local value must be a valid ISO 3166 country
     * code or supports ISO 3166-2 subdivisions. LocaleValue can only be used with a Worker_Locale QualificationType ID.
     * LocaleValue can only be used with the EqualTo, NotEqualTo, In, and NotIn comparators. You must only use a single
     * LocaleValue element when using the EqualTo or NotEqualTo comparators. When performing a set comparison by using
     * the In or the NotIn comparator, you can use up to 30 LocaleValue elements in a QualificationRequirement data
     * structure.
     * </p>
     * 
     * @param localeValues
     *        The locale value to compare against the Qualification's value. The local value must be a valid ISO 3166
     *        country code or supports ISO 3166-2 subdivisions. LocaleValue can only be used with a Worker_Locale
     *        QualificationType ID. LocaleValue can only be used with the EqualTo, NotEqualTo, In, and NotIn
     *        comparators. You must only use a single LocaleValue element when using the EqualTo or NotEqualTo
     *        comparators. When performing a set comparison by using the In or the NotIn comparator, you can use up to
     *        30 LocaleValue elements in a QualificationRequirement data structure.
     */

    public void setLocaleValues(java.util.Collection<Locale> localeValues) {
        if (localeValues == null) {
            this.localeValues = null;
            return;
        }

        this.localeValues = new java.util.ArrayList<Locale>(localeValues);
    }

    /**
     * <p>
     * The locale value to compare against the Qualification's value. The local value must be a valid ISO 3166 country
     * code or supports ISO 3166-2 subdivisions. LocaleValue can only be used with a Worker_Locale QualificationType ID.
     * LocaleValue can only be used with the EqualTo, NotEqualTo, In, and NotIn comparators. You must only use a single
     * LocaleValue element when using the EqualTo or NotEqualTo comparators. When performing a set comparison by using
     * the In or the NotIn comparator, you can use up to 30 LocaleValue elements in a QualificationRequirement data
     * structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocaleValues(java.util.Collection)} or {@link #withLocaleValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param localeValues
     *        The locale value to compare against the Qualification's value. The local value must be a valid ISO 3166
     *        country code or supports ISO 3166-2 subdivisions. LocaleValue can only be used with a Worker_Locale
     *        QualificationType ID. LocaleValue can only be used with the EqualTo, NotEqualTo, In, and NotIn
     *        comparators. You must only use a single LocaleValue element when using the EqualTo or NotEqualTo
     *        comparators. When performing a set comparison by using the In or the NotIn comparator, you can use up to
     *        30 LocaleValue elements in a QualificationRequirement data structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationRequirement withLocaleValues(Locale... localeValues) {
        if (this.localeValues == null) {
            setLocaleValues(new java.util.ArrayList<Locale>(localeValues.length));
        }
        for (Locale ele : localeValues) {
            this.localeValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The locale value to compare against the Qualification's value. The local value must be a valid ISO 3166 country
     * code or supports ISO 3166-2 subdivisions. LocaleValue can only be used with a Worker_Locale QualificationType ID.
     * LocaleValue can only be used with the EqualTo, NotEqualTo, In, and NotIn comparators. You must only use a single
     * LocaleValue element when using the EqualTo or NotEqualTo comparators. When performing a set comparison by using
     * the In or the NotIn comparator, you can use up to 30 LocaleValue elements in a QualificationRequirement data
     * structure.
     * </p>
     * 
     * @param localeValues
     *        The locale value to compare against the Qualification's value. The local value must be a valid ISO 3166
     *        country code or supports ISO 3166-2 subdivisions. LocaleValue can only be used with a Worker_Locale
     *        QualificationType ID. LocaleValue can only be used with the EqualTo, NotEqualTo, In, and NotIn
     *        comparators. You must only use a single LocaleValue element when using the EqualTo or NotEqualTo
     *        comparators. When performing a set comparison by using the In or the NotIn comparator, you can use up to
     *        30 LocaleValue elements in a QualificationRequirement data structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationRequirement withLocaleValues(java.util.Collection<Locale> localeValues) {
        setLocaleValues(localeValues);
        return this;
    }

    /**
     * <p>
     * DEPRECATED: Use the <code>ActionsGuarded</code> field instead. If RequiredToPreview is true, the question data
     * for the HIT will not be shown when a Worker whose Qualifications do not meet this requirement tries to preview
     * the HIT. That is, a Worker's Qualifications must meet all of the requirements for which RequiredToPreview is true
     * in order to preview the HIT. If a Worker meets all of the requirements where RequiredToPreview is true (or if
     * there are no such requirements), but does not meet all of the requirements for the HIT, the Worker will be
     * allowed to preview the HIT's question data, but will not be allowed to accept and complete the HIT. The default
     * is false. This should not be used in combination with the <code>ActionsGuarded</code> field.
     * </p>
     * 
     * @param requiredToPreview
     *        DEPRECATED: Use the <code>ActionsGuarded</code> field instead. If RequiredToPreview is true, the question
     *        data for the HIT will not be shown when a Worker whose Qualifications do not meet this requirement tries
     *        to preview the HIT. That is, a Worker's Qualifications must meet all of the requirements for which
     *        RequiredToPreview is true in order to preview the HIT. If a Worker meets all of the requirements where
     *        RequiredToPreview is true (or if there are no such requirements), but does not meet all of the
     *        requirements for the HIT, the Worker will be allowed to preview the HIT's question data, but will not be
     *        allowed to accept and complete the HIT. The default is false. This should not be used in combination with
     *        the <code>ActionsGuarded</code> field.
     */
    @Deprecated
    public void setRequiredToPreview(Boolean requiredToPreview) {
        this.requiredToPreview = requiredToPreview;
    }

    /**
     * <p>
     * DEPRECATED: Use the <code>ActionsGuarded</code> field instead. If RequiredToPreview is true, the question data
     * for the HIT will not be shown when a Worker whose Qualifications do not meet this requirement tries to preview
     * the HIT. That is, a Worker's Qualifications must meet all of the requirements for which RequiredToPreview is true
     * in order to preview the HIT. If a Worker meets all of the requirements where RequiredToPreview is true (or if
     * there are no such requirements), but does not meet all of the requirements for the HIT, the Worker will be
     * allowed to preview the HIT's question data, but will not be allowed to accept and complete the HIT. The default
     * is false. This should not be used in combination with the <code>ActionsGuarded</code> field.
     * </p>
     * 
     * @return DEPRECATED: Use the <code>ActionsGuarded</code> field instead. If RequiredToPreview is true, the question
     *         data for the HIT will not be shown when a Worker whose Qualifications do not meet this requirement tries
     *         to preview the HIT. That is, a Worker's Qualifications must meet all of the requirements for which
     *         RequiredToPreview is true in order to preview the HIT. If a Worker meets all of the requirements where
     *         RequiredToPreview is true (or if there are no such requirements), but does not meet all of the
     *         requirements for the HIT, the Worker will be allowed to preview the HIT's question data, but will not be
     *         allowed to accept and complete the HIT. The default is false. This should not be used in combination with
     *         the <code>ActionsGuarded</code> field.
     */
    @Deprecated
    public Boolean getRequiredToPreview() {
        return this.requiredToPreview;
    }

    /**
     * <p>
     * DEPRECATED: Use the <code>ActionsGuarded</code> field instead. If RequiredToPreview is true, the question data
     * for the HIT will not be shown when a Worker whose Qualifications do not meet this requirement tries to preview
     * the HIT. That is, a Worker's Qualifications must meet all of the requirements for which RequiredToPreview is true
     * in order to preview the HIT. If a Worker meets all of the requirements where RequiredToPreview is true (or if
     * there are no such requirements), but does not meet all of the requirements for the HIT, the Worker will be
     * allowed to preview the HIT's question data, but will not be allowed to accept and complete the HIT. The default
     * is false. This should not be used in combination with the <code>ActionsGuarded</code> field.
     * </p>
     * 
     * @param requiredToPreview
     *        DEPRECATED: Use the <code>ActionsGuarded</code> field instead. If RequiredToPreview is true, the question
     *        data for the HIT will not be shown when a Worker whose Qualifications do not meet this requirement tries
     *        to preview the HIT. That is, a Worker's Qualifications must meet all of the requirements for which
     *        RequiredToPreview is true in order to preview the HIT. If a Worker meets all of the requirements where
     *        RequiredToPreview is true (or if there are no such requirements), but does not meet all of the
     *        requirements for the HIT, the Worker will be allowed to preview the HIT's question data, but will not be
     *        allowed to accept and complete the HIT. The default is false. This should not be used in combination with
     *        the <code>ActionsGuarded</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public QualificationRequirement withRequiredToPreview(Boolean requiredToPreview) {
        setRequiredToPreview(requiredToPreview);
        return this;
    }

    /**
     * <p>
     * DEPRECATED: Use the <code>ActionsGuarded</code> field instead. If RequiredToPreview is true, the question data
     * for the HIT will not be shown when a Worker whose Qualifications do not meet this requirement tries to preview
     * the HIT. That is, a Worker's Qualifications must meet all of the requirements for which RequiredToPreview is true
     * in order to preview the HIT. If a Worker meets all of the requirements where RequiredToPreview is true (or if
     * there are no such requirements), but does not meet all of the requirements for the HIT, the Worker will be
     * allowed to preview the HIT's question data, but will not be allowed to accept and complete the HIT. The default
     * is false. This should not be used in combination with the <code>ActionsGuarded</code> field.
     * </p>
     * 
     * @return DEPRECATED: Use the <code>ActionsGuarded</code> field instead. If RequiredToPreview is true, the question
     *         data for the HIT will not be shown when a Worker whose Qualifications do not meet this requirement tries
     *         to preview the HIT. That is, a Worker's Qualifications must meet all of the requirements for which
     *         RequiredToPreview is true in order to preview the HIT. If a Worker meets all of the requirements where
     *         RequiredToPreview is true (or if there are no such requirements), but does not meet all of the
     *         requirements for the HIT, the Worker will be allowed to preview the HIT's question data, but will not be
     *         allowed to accept and complete the HIT. The default is false. This should not be used in combination with
     *         the <code>ActionsGuarded</code> field.
     */
    @Deprecated
    public Boolean isRequiredToPreview() {
        return this.requiredToPreview;
    }

    /**
     * <p>
     * Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement from
     * taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can preview the
     * HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview the HIT, but can see
     * the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot accept, preview, or see the HIT
     * in their search results). It's possible for you to create a HIT with multiple QualificationRequirements (which
     * can have different values for the ActionGuarded attribute). In this case, the Worker is only permitted to perform
     * an action when they have met all QualificationRequirements guarding the action. The actions in the order of least
     * restrictive to most restrictive are Discover, Preview and Accept. For example, if a Worker meets all
     * QualificationRequirements that are set to DiscoverPreviewAndAccept, but do not meet all requirements that are set
     * with PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search result, but
     * will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in combination with the
     * <code>RequiredToPreview</code> field.
     * </p>
     * 
     * @param actionsGuarded
     *        Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement
     *        from taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can
     *        preview the HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview
     *        the HIT, but can see the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot
     *        accept, preview, or see the HIT in their search results). It's possible for you to create a HIT with
     *        multiple QualificationRequirements (which can have different values for the ActionGuarded attribute). In
     *        this case, the Worker is only permitted to perform an action when they have met all
     *        QualificationRequirements guarding the action. The actions in the order of least restrictive to most
     *        restrictive are Discover, Preview and Accept. For example, if a Worker meets all QualificationRequirements
     *        that are set to DiscoverPreviewAndAccept, but do not meet all requirements that are set with
     *        PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search result, but
     *        will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in combination with the
     *        <code>RequiredToPreview</code> field.
     * @see HITAccessActions
     */

    public void setActionsGuarded(String actionsGuarded) {
        this.actionsGuarded = actionsGuarded;
    }

    /**
     * <p>
     * Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement from
     * taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can preview the
     * HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview the HIT, but can see
     * the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot accept, preview, or see the HIT
     * in their search results). It's possible for you to create a HIT with multiple QualificationRequirements (which
     * can have different values for the ActionGuarded attribute). In this case, the Worker is only permitted to perform
     * an action when they have met all QualificationRequirements guarding the action. The actions in the order of least
     * restrictive to most restrictive are Discover, Preview and Accept. For example, if a Worker meets all
     * QualificationRequirements that are set to DiscoverPreviewAndAccept, but do not meet all requirements that are set
     * with PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search result, but
     * will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in combination with the
     * <code>RequiredToPreview</code> field.
     * </p>
     * 
     * @return Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement
     *         from taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can
     *         preview the HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview
     *         the HIT, but can see the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot
     *         accept, preview, or see the HIT in their search results). It's possible for you to create a HIT with
     *         multiple QualificationRequirements (which can have different values for the ActionGuarded attribute). In
     *         this case, the Worker is only permitted to perform an action when they have met all
     *         QualificationRequirements guarding the action. The actions in the order of least restrictive to most
     *         restrictive are Discover, Preview and Accept. For example, if a Worker meets all
     *         QualificationRequirements that are set to DiscoverPreviewAndAccept, but do not meet all requirements that
     *         are set with PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search
     *         result, but will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in
     *         combination with the <code>RequiredToPreview</code> field.
     * @see HITAccessActions
     */

    public String getActionsGuarded() {
        return this.actionsGuarded;
    }

    /**
     * <p>
     * Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement from
     * taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can preview the
     * HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview the HIT, but can see
     * the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot accept, preview, or see the HIT
     * in their search results). It's possible for you to create a HIT with multiple QualificationRequirements (which
     * can have different values for the ActionGuarded attribute). In this case, the Worker is only permitted to perform
     * an action when they have met all QualificationRequirements guarding the action. The actions in the order of least
     * restrictive to most restrictive are Discover, Preview and Accept. For example, if a Worker meets all
     * QualificationRequirements that are set to DiscoverPreviewAndAccept, but do not meet all requirements that are set
     * with PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search result, but
     * will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in combination with the
     * <code>RequiredToPreview</code> field.
     * </p>
     * 
     * @param actionsGuarded
     *        Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement
     *        from taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can
     *        preview the HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview
     *        the HIT, but can see the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot
     *        accept, preview, or see the HIT in their search results). It's possible for you to create a HIT with
     *        multiple QualificationRequirements (which can have different values for the ActionGuarded attribute). In
     *        this case, the Worker is only permitted to perform an action when they have met all
     *        QualificationRequirements guarding the action. The actions in the order of least restrictive to most
     *        restrictive are Discover, Preview and Accept. For example, if a Worker meets all QualificationRequirements
     *        that are set to DiscoverPreviewAndAccept, but do not meet all requirements that are set with
     *        PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search result, but
     *        will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in combination with the
     *        <code>RequiredToPreview</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HITAccessActions
     */

    public QualificationRequirement withActionsGuarded(String actionsGuarded) {
        setActionsGuarded(actionsGuarded);
        return this;
    }

    /**
     * <p>
     * Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement from
     * taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can preview the
     * HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview the HIT, but can see
     * the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot accept, preview, or see the HIT
     * in their search results). It's possible for you to create a HIT with multiple QualificationRequirements (which
     * can have different values for the ActionGuarded attribute). In this case, the Worker is only permitted to perform
     * an action when they have met all QualificationRequirements guarding the action. The actions in the order of least
     * restrictive to most restrictive are Discover, Preview and Accept. For example, if a Worker meets all
     * QualificationRequirements that are set to DiscoverPreviewAndAccept, but do not meet all requirements that are set
     * with PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search result, but
     * will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in combination with the
     * <code>RequiredToPreview</code> field.
     * </p>
     * 
     * @param actionsGuarded
     *        Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement
     *        from taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can
     *        preview the HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview
     *        the HIT, but can see the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot
     *        accept, preview, or see the HIT in their search results). It's possible for you to create a HIT with
     *        multiple QualificationRequirements (which can have different values for the ActionGuarded attribute). In
     *        this case, the Worker is only permitted to perform an action when they have met all
     *        QualificationRequirements guarding the action. The actions in the order of least restrictive to most
     *        restrictive are Discover, Preview and Accept. For example, if a Worker meets all QualificationRequirements
     *        that are set to DiscoverPreviewAndAccept, but do not meet all requirements that are set with
     *        PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search result, but
     *        will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in combination with the
     *        <code>RequiredToPreview</code> field.
     * @see HITAccessActions
     */

    public void setActionsGuarded(HITAccessActions actionsGuarded) {
        withActionsGuarded(actionsGuarded);
    }

    /**
     * <p>
     * Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement from
     * taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can preview the
     * HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview the HIT, but can see
     * the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot accept, preview, or see the HIT
     * in their search results). It's possible for you to create a HIT with multiple QualificationRequirements (which
     * can have different values for the ActionGuarded attribute). In this case, the Worker is only permitted to perform
     * an action when they have met all QualificationRequirements guarding the action. The actions in the order of least
     * restrictive to most restrictive are Discover, Preview and Accept. For example, if a Worker meets all
     * QualificationRequirements that are set to DiscoverPreviewAndAccept, but do not meet all requirements that are set
     * with PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search result, but
     * will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in combination with the
     * <code>RequiredToPreview</code> field.
     * </p>
     * 
     * @param actionsGuarded
     *        Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement
     *        from taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can
     *        preview the HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview
     *        the HIT, but can see the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot
     *        accept, preview, or see the HIT in their search results). It's possible for you to create a HIT with
     *        multiple QualificationRequirements (which can have different values for the ActionGuarded attribute). In
     *        this case, the Worker is only permitted to perform an action when they have met all
     *        QualificationRequirements guarding the action. The actions in the order of least restrictive to most
     *        restrictive are Discover, Preview and Accept. For example, if a Worker meets all QualificationRequirements
     *        that are set to DiscoverPreviewAndAccept, but do not meet all requirements that are set with
     *        PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search result, but
     *        will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in combination with the
     *        <code>RequiredToPreview</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HITAccessActions
     */

    public QualificationRequirement withActionsGuarded(HITAccessActions actionsGuarded) {
        this.actionsGuarded = actionsGuarded.toString();
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
        if (getQualificationTypeId() != null)
            sb.append("QualificationTypeId: ").append(getQualificationTypeId()).append(",");
        if (getComparator() != null)
            sb.append("Comparator: ").append(getComparator()).append(",");
        if (getIntegerValues() != null)
            sb.append("IntegerValues: ").append(getIntegerValues()).append(",");
        if (getLocaleValues() != null)
            sb.append("LocaleValues: ").append(getLocaleValues()).append(",");
        if (getRequiredToPreview() != null)
            sb.append("RequiredToPreview: ").append(getRequiredToPreview()).append(",");
        if (getActionsGuarded() != null)
            sb.append("ActionsGuarded: ").append(getActionsGuarded());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QualificationRequirement == false)
            return false;
        QualificationRequirement other = (QualificationRequirement) obj;
        if (other.getQualificationTypeId() == null ^ this.getQualificationTypeId() == null)
            return false;
        if (other.getQualificationTypeId() != null && other.getQualificationTypeId().equals(this.getQualificationTypeId()) == false)
            return false;
        if (other.getComparator() == null ^ this.getComparator() == null)
            return false;
        if (other.getComparator() != null && other.getComparator().equals(this.getComparator()) == false)
            return false;
        if (other.getIntegerValues() == null ^ this.getIntegerValues() == null)
            return false;
        if (other.getIntegerValues() != null && other.getIntegerValues().equals(this.getIntegerValues()) == false)
            return false;
        if (other.getLocaleValues() == null ^ this.getLocaleValues() == null)
            return false;
        if (other.getLocaleValues() != null && other.getLocaleValues().equals(this.getLocaleValues()) == false)
            return false;
        if (other.getRequiredToPreview() == null ^ this.getRequiredToPreview() == null)
            return false;
        if (other.getRequiredToPreview() != null && other.getRequiredToPreview().equals(this.getRequiredToPreview()) == false)
            return false;
        if (other.getActionsGuarded() == null ^ this.getActionsGuarded() == null)
            return false;
        if (other.getActionsGuarded() != null && other.getActionsGuarded().equals(this.getActionsGuarded()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQualificationTypeId() == null) ? 0 : getQualificationTypeId().hashCode());
        hashCode = prime * hashCode + ((getComparator() == null) ? 0 : getComparator().hashCode());
        hashCode = prime * hashCode + ((getIntegerValues() == null) ? 0 : getIntegerValues().hashCode());
        hashCode = prime * hashCode + ((getLocaleValues() == null) ? 0 : getLocaleValues().hashCode());
        hashCode = prime * hashCode + ((getRequiredToPreview() == null) ? 0 : getRequiredToPreview().hashCode());
        hashCode = prime * hashCode + ((getActionsGuarded() == null) ? 0 : getActionsGuarded().hashCode());
        return hashCode;
    }

    @Override
    public QualificationRequirement clone() {
        try {
            return (QualificationRequirement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.QualificationRequirementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
