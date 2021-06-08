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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * ExtraParam includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ExtraParam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtraParam implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an additional parameter that is required by a top-level domain. Here are the top-level domains that
     * require additional parameters and the names of the parameters that they require:
     * </p>
     * <dl>
     * <dt>.com.au and .net.au</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>AU_ID_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AU_ID_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABN</code> (Australian business number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACN</code> (Australian company number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TM</code> (Trademark number)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.ca</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BRAND_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CA_BUSINESS_ENTITY_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BANK</code> (Bank)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMERCIAL_COMPANY</code> (Commercial company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPANY</code> (Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATION</code> (Cooperation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATIVE</code> (Cooperative)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPRIX</code> (Cooprix)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CORP</code> (Corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREDIT_UNION</code> (Credit union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOMIA</code> (Federation of mutual insurance associations)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INC</code> (Incorporated)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTD</code> (Limited)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTEE</code> (Limitée)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLC</code> (Limited liability corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLP</code> (Limited liability partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTE</code> (Lte.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MBA</code> (Mutual benefit association)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIC</code> (Mutual insurance company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFP</code> (Not-for-profit corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SA</code> (S.A.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_COMPANY</code> (Savings company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_UNION</code> (Savings union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SARL</code> (Société à responsabilité limitée)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUST</code> (Trust)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ULC</code> (Unlimited liability corporation)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CA_LEGAL_TYPE</code>
     * </p>
     * <p>
     * When <code>ContactType</code> is <code>PERSON</code>, valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABO</code> (Aboriginal Peoples indigenous to Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CCT</code> (Canadian citizen)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LGR</code> (Legal Representative of a Canadian Citizen or Permanent Resident)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RES</code> (Permanent resident of Canada)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>ContactType</code> is a value other than <code>PERSON</code>, valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASS</code> (Canadian unincorporated association)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CCO</code> (Canadian corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EDU</code> (Canadian educational institution)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOV</code> (Government or government entity in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOP</code> (Canadian Hospital)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INB</code> (Indian Band recognized by the Indian Act of Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAM</code> (Canadian Library, Archive, or Museum)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAJ</code> (Her/His Majesty the Queen/King)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OMK</code> (Official mark registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLT</code> (Canadian Political Party)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRT</code> (Partnership Registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TDM</code> (Trademark registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRD</code> (Canadian Trade Union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRS</code> (Trust established in Canada)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.es</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>ES_IDENTIFICATION</code>
     * </p>
     * <p>
     * Specify the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>For contacts inside Spain:</b> Enter your passport ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For contacts outside of Spain:</b> Enter the VAT identification number for the company.
     * </p>
     * <note>
     * <p>
     * For .es domains, the value of <code>ContactType</code> must be <code>PERSON</code>.
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ES_IDENTIFICATION_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DNI_AND_NIF</code> (For Spanish contacts)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NIE</code> (For foreigners with legal residence)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code> (For contacts outside of Spain)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ES_LEGAL_FORM</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CENTRAL_GOVERNMENT_BODY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CIVIL_SOCIETY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMUNITY_OF_OWNERS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMUNITY_PROPERTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONSULATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESIGNATION_OF_ORIGIN_SUPERVISORY_COUNCIL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECONOMIC_INTEREST_GROUP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMBASSY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTITY_MANAGING_NATURAL_AREAS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FARM_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOUNDATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GENERAL_AND_LIMITED_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GENERAL_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INDIVIDUAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_AUTHORITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MUTUAL_INSURANCE_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NATIONAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORDER_OR_RELIGIOUS_INSTITUTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHERS (Only for contacts outside of Spain)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POLITICAL_PARTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROFESSIONAL_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_LAW_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL_GOVERNMENT_BODY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_BANK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPANISH_OFFICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_FEDERATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_ALLIANCE_OF_ENTERPRISES</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRADE_UNION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WORKER_OWNED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WORKER_OWNED_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.fi</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_BUSINESS_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_ID_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_NATIONALITY</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FINNISH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FINNISH</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>FI_ORGANIZATION_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CORPORATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOVERNMENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTITUTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POLITICAL_PARTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_COMMUNITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOWNSHIP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.fr</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_CITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_COUNTRY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_DEPARTMENT</code>: Specify the INSEE code that corresponds with the department where the contact was
     * born. If the contact was born somewhere other than France or its overseas departments, specify <code>99</code>.
     * For more information, including a list of departments and the corresponding INSEE numbers, see the Wikipedia
     * entry <a href="https://en.wikipedia.org/wiki/Departments_of_France">Departments of France</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BRAND_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.it</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>IT_NATIONALITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IT_PIN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IT_REGISTRANT_ENTITY_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FOREIGNERS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FREELANCE_WORKERS</code> (Freelance workers and professionals)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ITALIAN_COMPANIES</code> (Italian companies and one-person companies)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROFIT_ORGANIZATIONS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER_SUBJECTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_ORGANIZATIONS</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.ru</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RU_PASSPORT_DATA</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.se</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_COUNTRY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SE_ID_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.sg</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>SG_ID_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.co.uk, .me.uk, and .org.uk</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>UK_CONTACT_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CRC</code> (UK Corporation by Royal Charter)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FCORP</code> (Non-UK Corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIND</code> (Non-UK Individual, representing self)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOTHER</code> (Non-UK Entity that does not fit into any other category)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOV</code> (UK Government Body)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IND</code> (UK Individual (representing self))
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IP</code> (UK Industrial/Provident Registered Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLP</code> (UK Limited Liability Partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTD</code> (UK Limited Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code> (UK Entity that does not fit into any other category)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLC</code> (UK Public Limited Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PTNR</code> (UK Partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RCHAR</code> (UK Registered Charity)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCH</code> (UK School)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STAT</code> (UK Statutory Body)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STRA</code> (UK Sole Trader)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>UK_COMPANY_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * In addition, many TLDs require a <code>VAT_NUMBER</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value that corresponds with the name of an extra parameter.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of an additional parameter that is required by a top-level domain. Here are the top-level domains that
     * require additional parameters and the names of the parameters that they require:
     * </p>
     * <dl>
     * <dt>.com.au and .net.au</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>AU_ID_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AU_ID_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABN</code> (Australian business number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACN</code> (Australian company number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TM</code> (Trademark number)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.ca</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BRAND_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CA_BUSINESS_ENTITY_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BANK</code> (Bank)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMERCIAL_COMPANY</code> (Commercial company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPANY</code> (Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATION</code> (Cooperation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATIVE</code> (Cooperative)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPRIX</code> (Cooprix)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CORP</code> (Corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREDIT_UNION</code> (Credit union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOMIA</code> (Federation of mutual insurance associations)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INC</code> (Incorporated)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTD</code> (Limited)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTEE</code> (Limitée)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLC</code> (Limited liability corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLP</code> (Limited liability partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTE</code> (Lte.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MBA</code> (Mutual benefit association)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIC</code> (Mutual insurance company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFP</code> (Not-for-profit corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SA</code> (S.A.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_COMPANY</code> (Savings company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_UNION</code> (Savings union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SARL</code> (Société à responsabilité limitée)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUST</code> (Trust)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ULC</code> (Unlimited liability corporation)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CA_LEGAL_TYPE</code>
     * </p>
     * <p>
     * When <code>ContactType</code> is <code>PERSON</code>, valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABO</code> (Aboriginal Peoples indigenous to Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CCT</code> (Canadian citizen)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LGR</code> (Legal Representative of a Canadian Citizen or Permanent Resident)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RES</code> (Permanent resident of Canada)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>ContactType</code> is a value other than <code>PERSON</code>, valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASS</code> (Canadian unincorporated association)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CCO</code> (Canadian corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EDU</code> (Canadian educational institution)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOV</code> (Government or government entity in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOP</code> (Canadian Hospital)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INB</code> (Indian Band recognized by the Indian Act of Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAM</code> (Canadian Library, Archive, or Museum)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAJ</code> (Her/His Majesty the Queen/King)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OMK</code> (Official mark registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLT</code> (Canadian Political Party)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRT</code> (Partnership Registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TDM</code> (Trademark registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRD</code> (Canadian Trade Union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRS</code> (Trust established in Canada)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.es</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>ES_IDENTIFICATION</code>
     * </p>
     * <p>
     * Specify the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>For contacts inside Spain:</b> Enter your passport ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For contacts outside of Spain:</b> Enter the VAT identification number for the company.
     * </p>
     * <note>
     * <p>
     * For .es domains, the value of <code>ContactType</code> must be <code>PERSON</code>.
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ES_IDENTIFICATION_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DNI_AND_NIF</code> (For Spanish contacts)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NIE</code> (For foreigners with legal residence)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code> (For contacts outside of Spain)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ES_LEGAL_FORM</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CENTRAL_GOVERNMENT_BODY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CIVIL_SOCIETY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMUNITY_OF_OWNERS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMUNITY_PROPERTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONSULATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESIGNATION_OF_ORIGIN_SUPERVISORY_COUNCIL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECONOMIC_INTEREST_GROUP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMBASSY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTITY_MANAGING_NATURAL_AREAS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FARM_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOUNDATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GENERAL_AND_LIMITED_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GENERAL_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INDIVIDUAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_AUTHORITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MUTUAL_INSURANCE_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NATIONAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORDER_OR_RELIGIOUS_INSTITUTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHERS (Only for contacts outside of Spain)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POLITICAL_PARTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROFESSIONAL_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_LAW_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL_GOVERNMENT_BODY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_BANK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPANISH_OFFICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_FEDERATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_ALLIANCE_OF_ENTERPRISES</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRADE_UNION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WORKER_OWNED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WORKER_OWNED_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.fi</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_BUSINESS_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_ID_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_NATIONALITY</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FINNISH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FINNISH</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>FI_ORGANIZATION_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CORPORATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOVERNMENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTITUTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POLITICAL_PARTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_COMMUNITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOWNSHIP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.fr</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_CITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_COUNTRY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_DEPARTMENT</code>: Specify the INSEE code that corresponds with the department where the contact was
     * born. If the contact was born somewhere other than France or its overseas departments, specify <code>99</code>.
     * For more information, including a list of departments and the corresponding INSEE numbers, see the Wikipedia
     * entry <a href="https://en.wikipedia.org/wiki/Departments_of_France">Departments of France</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BRAND_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.it</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>IT_NATIONALITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IT_PIN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IT_REGISTRANT_ENTITY_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FOREIGNERS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FREELANCE_WORKERS</code> (Freelance workers and professionals)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ITALIAN_COMPANIES</code> (Italian companies and one-person companies)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROFIT_ORGANIZATIONS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER_SUBJECTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_ORGANIZATIONS</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.ru</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RU_PASSPORT_DATA</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.se</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_COUNTRY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SE_ID_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.sg</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>SG_ID_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.co.uk, .me.uk, and .org.uk</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>UK_CONTACT_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CRC</code> (UK Corporation by Royal Charter)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FCORP</code> (Non-UK Corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIND</code> (Non-UK Individual, representing self)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOTHER</code> (Non-UK Entity that does not fit into any other category)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOV</code> (UK Government Body)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IND</code> (UK Individual (representing self))
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IP</code> (UK Industrial/Provident Registered Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLP</code> (UK Limited Liability Partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTD</code> (UK Limited Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code> (UK Entity that does not fit into any other category)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLC</code> (UK Public Limited Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PTNR</code> (UK Partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RCHAR</code> (UK Registered Charity)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCH</code> (UK School)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STAT</code> (UK Statutory Body)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STRA</code> (UK Sole Trader)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>UK_COMPANY_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * In addition, many TLDs require a <code>VAT_NUMBER</code>.
     * </p>
     * 
     * @param name
     *        The name of an additional parameter that is required by a top-level domain. Here are the top-level domains
     *        that require additional parameters and the names of the parameters that they require:</p>
     *        <dl>
     *        <dt>.com.au and .net.au</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AU_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AU_ID_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ABN</code> (Australian business number)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACN</code> (Australian company number)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TM</code> (Trademark number)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.ca</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BRAND_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CA_BUSINESS_ENTITY_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BANK</code> (Bank)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMMERCIAL_COMPANY</code> (Commercial company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPANY</code> (Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPERATION</code> (Cooperation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPERATIVE</code> (Cooperative)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPRIX</code> (Cooprix)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CORP</code> (Corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREDIT_UNION</code> (Credit union)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOMIA</code> (Federation of mutual insurance associations)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INC</code> (Incorporated)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTD</code> (Limited)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTEE</code> (Limitée)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LLC</code> (Limited liability corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LLP</code> (Limited liability partnership)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTE</code> (Lte.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MBA</code> (Mutual benefit association)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIC</code> (Mutual insurance company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFP</code> (Not-for-profit corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SA</code> (S.A.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_COMPANY</code> (Savings company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_UNION</code> (Savings union)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SARL</code> (Société à responsabilité limitée)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRUST</code> (Trust)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ULC</code> (Unlimited liability corporation)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CA_LEGAL_TYPE</code>
     *        </p>
     *        <p>
     *        When <code>ContactType</code> is <code>PERSON</code>, valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ABO</code> (Aboriginal Peoples indigenous to Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CCT</code> (Canadian citizen)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LGR</code> (Legal Representative of a Canadian Citizen or Permanent Resident)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RES</code> (Permanent resident of Canada)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>ContactType</code> is a value other than <code>PERSON</code>, valid values include the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASS</code> (Canadian unincorporated association)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CCO</code> (Canadian corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EDU</code> (Canadian educational institution)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOV</code> (Government or government entity in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOP</code> (Canadian Hospital)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INB</code> (Indian Band recognized by the Indian Act of Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAM</code> (Canadian Library, Archive, or Museum)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAJ</code> (Her/His Majesty the Queen/King)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OMK</code> (Official mark registered in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLT</code> (Canadian Political Party)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRT</code> (Partnership Registered in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TDM</code> (Trademark registered in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRD</code> (Canadian Trade Union)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRS</code> (Trust established in Canada)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.es</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ES_IDENTIFICATION</code>
     *        </p>
     *        <p>
     *        Specify the applicable value:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>For contacts inside Spain:</b> Enter your passport ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For contacts outside of Spain:</b> Enter the VAT identification number for the company.
     *        </p>
     *        <note>
     *        <p>
     *        For .es domains, the value of <code>ContactType</code> must be <code>PERSON</code>.
     *        </p>
     *        </note></li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ES_IDENTIFICATION_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DNI_AND_NIF</code> (For Spanish contacts)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NIE</code> (For foreigners with legal residence)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER</code> (For contacts outside of Spain)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ES_LEGAL_FORM</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CENTRAL_GOVERNMENT_BODY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CIVIL_SOCIETY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMMUNITY_OF_OWNERS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMMUNITY_PROPERTY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONSULATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPERATIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESIGNATION_OF_ORIGIN_SUPERVISORY_COUNCIL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ECONOMIC_INTEREST_GROUP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMBASSY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENTITY_MANAGING_NATURAL_AREAS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FARM_PARTNERSHIP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOUNDATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GENERAL_AND_LIMITED_PARTNERSHIP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GENERAL_PARTNERSHIP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INDIVIDUAL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL_AUTHORITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL_PUBLIC_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MUTUAL_INSURANCE_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NATIONAL_PUBLIC_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORDER_OR_RELIGIOUS_INSTITUTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHERS (Only for contacts outside of Spain)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POLITICAL_PARTY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROFESSIONAL_ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_LAW_ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGIONAL_GOVERNMENT_BODY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGIONAL_PUBLIC_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_BANK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPANISH_OFFICE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPORTS_ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPORTS_FEDERATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPORTS_LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_ALLIANCE_OF_ENTERPRISES</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRADE_UNION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WORKER_OWNED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WORKER_OWNED_LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.fi</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_BUSINESS_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_NATIONALITY</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FINNISH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_FINNISH</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_ORGANIZATION_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CORPORATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOVERNMENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTITUTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POLITICAL_PARTY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_COMMUNITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOWNSHIP</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.fr</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_CITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BIRTH_COUNTRY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BIRTH_DEPARTMENT</code>: Specify the INSEE code that corresponds with the department where the
     *        contact was born. If the contact was born somewhere other than France or its overseas departments, specify
     *        <code>99</code>. For more information, including a list of departments and the corresponding INSEE
     *        numbers, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/Departments_of_France">Departments
     *        of France</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BRAND_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.it</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IT_NATIONALITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IT_PIN</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IT_REGISTRANT_ENTITY_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FOREIGNERS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FREELANCE_WORKERS</code> (Freelance workers and professionals)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ITALIAN_COMPANIES</code> (Italian companies and one-person companies)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROFIT_ORGANIZATIONS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER_SUBJECTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_ORGANIZATIONS</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.ru</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RU_PASSPORT_DATA</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.se</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_COUNTRY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SE_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.sg</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SG_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.co.uk, .me.uk, and .org.uk</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UK_CONTACT_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CRC</code> (UK Corporation by Royal Charter)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FCORP</code> (Non-UK Corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FIND</code> (Non-UK Individual, representing self)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOTHER</code> (Non-UK Entity that does not fit into any other category)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOV</code> (UK Government Body)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IND</code> (UK Individual (representing self))
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IP</code> (UK Industrial/Provident Registered Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LLP</code> (UK Limited Liability Partnership)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTD</code> (UK Limited Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER</code> (UK Entity that does not fit into any other category)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLC</code> (UK Public Limited Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PTNR</code> (UK Partnership)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RCHAR</code> (UK Registered Charity)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCH</code> (UK School)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STAT</code> (UK Statutory Body)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STRA</code> (UK Sole Trader)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UK_COMPANY_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        </dl>
     *        <p>
     *        In addition, many TLDs require a <code>VAT_NUMBER</code>.
     * @see ExtraParamName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an additional parameter that is required by a top-level domain. Here are the top-level domains that
     * require additional parameters and the names of the parameters that they require:
     * </p>
     * <dl>
     * <dt>.com.au and .net.au</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>AU_ID_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AU_ID_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABN</code> (Australian business number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACN</code> (Australian company number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TM</code> (Trademark number)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.ca</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BRAND_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CA_BUSINESS_ENTITY_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BANK</code> (Bank)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMERCIAL_COMPANY</code> (Commercial company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPANY</code> (Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATION</code> (Cooperation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATIVE</code> (Cooperative)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPRIX</code> (Cooprix)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CORP</code> (Corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREDIT_UNION</code> (Credit union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOMIA</code> (Federation of mutual insurance associations)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INC</code> (Incorporated)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTD</code> (Limited)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTEE</code> (Limitée)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLC</code> (Limited liability corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLP</code> (Limited liability partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTE</code> (Lte.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MBA</code> (Mutual benefit association)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIC</code> (Mutual insurance company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFP</code> (Not-for-profit corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SA</code> (S.A.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_COMPANY</code> (Savings company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_UNION</code> (Savings union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SARL</code> (Société à responsabilité limitée)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUST</code> (Trust)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ULC</code> (Unlimited liability corporation)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CA_LEGAL_TYPE</code>
     * </p>
     * <p>
     * When <code>ContactType</code> is <code>PERSON</code>, valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABO</code> (Aboriginal Peoples indigenous to Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CCT</code> (Canadian citizen)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LGR</code> (Legal Representative of a Canadian Citizen or Permanent Resident)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RES</code> (Permanent resident of Canada)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>ContactType</code> is a value other than <code>PERSON</code>, valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASS</code> (Canadian unincorporated association)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CCO</code> (Canadian corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EDU</code> (Canadian educational institution)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOV</code> (Government or government entity in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOP</code> (Canadian Hospital)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INB</code> (Indian Band recognized by the Indian Act of Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAM</code> (Canadian Library, Archive, or Museum)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAJ</code> (Her/His Majesty the Queen/King)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OMK</code> (Official mark registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLT</code> (Canadian Political Party)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRT</code> (Partnership Registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TDM</code> (Trademark registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRD</code> (Canadian Trade Union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRS</code> (Trust established in Canada)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.es</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>ES_IDENTIFICATION</code>
     * </p>
     * <p>
     * Specify the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>For contacts inside Spain:</b> Enter your passport ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For contacts outside of Spain:</b> Enter the VAT identification number for the company.
     * </p>
     * <note>
     * <p>
     * For .es domains, the value of <code>ContactType</code> must be <code>PERSON</code>.
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ES_IDENTIFICATION_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DNI_AND_NIF</code> (For Spanish contacts)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NIE</code> (For foreigners with legal residence)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code> (For contacts outside of Spain)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ES_LEGAL_FORM</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CENTRAL_GOVERNMENT_BODY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CIVIL_SOCIETY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMUNITY_OF_OWNERS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMUNITY_PROPERTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONSULATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESIGNATION_OF_ORIGIN_SUPERVISORY_COUNCIL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECONOMIC_INTEREST_GROUP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMBASSY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTITY_MANAGING_NATURAL_AREAS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FARM_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOUNDATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GENERAL_AND_LIMITED_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GENERAL_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INDIVIDUAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_AUTHORITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MUTUAL_INSURANCE_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NATIONAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORDER_OR_RELIGIOUS_INSTITUTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHERS (Only for contacts outside of Spain)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POLITICAL_PARTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROFESSIONAL_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_LAW_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL_GOVERNMENT_BODY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_BANK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPANISH_OFFICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_FEDERATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_ALLIANCE_OF_ENTERPRISES</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRADE_UNION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WORKER_OWNED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WORKER_OWNED_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.fi</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_BUSINESS_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_ID_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_NATIONALITY</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FINNISH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FINNISH</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>FI_ORGANIZATION_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CORPORATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOVERNMENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTITUTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POLITICAL_PARTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_COMMUNITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOWNSHIP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.fr</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_CITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_COUNTRY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_DEPARTMENT</code>: Specify the INSEE code that corresponds with the department where the contact was
     * born. If the contact was born somewhere other than France or its overseas departments, specify <code>99</code>.
     * For more information, including a list of departments and the corresponding INSEE numbers, see the Wikipedia
     * entry <a href="https://en.wikipedia.org/wiki/Departments_of_France">Departments of France</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BRAND_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.it</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>IT_NATIONALITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IT_PIN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IT_REGISTRANT_ENTITY_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FOREIGNERS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FREELANCE_WORKERS</code> (Freelance workers and professionals)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ITALIAN_COMPANIES</code> (Italian companies and one-person companies)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROFIT_ORGANIZATIONS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER_SUBJECTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_ORGANIZATIONS</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.ru</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RU_PASSPORT_DATA</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.se</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_COUNTRY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SE_ID_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.sg</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>SG_ID_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.co.uk, .me.uk, and .org.uk</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>UK_CONTACT_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CRC</code> (UK Corporation by Royal Charter)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FCORP</code> (Non-UK Corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIND</code> (Non-UK Individual, representing self)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOTHER</code> (Non-UK Entity that does not fit into any other category)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOV</code> (UK Government Body)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IND</code> (UK Individual (representing self))
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IP</code> (UK Industrial/Provident Registered Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLP</code> (UK Limited Liability Partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTD</code> (UK Limited Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code> (UK Entity that does not fit into any other category)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLC</code> (UK Public Limited Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PTNR</code> (UK Partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RCHAR</code> (UK Registered Charity)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCH</code> (UK School)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STAT</code> (UK Statutory Body)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STRA</code> (UK Sole Trader)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>UK_COMPANY_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * In addition, many TLDs require a <code>VAT_NUMBER</code>.
     * </p>
     * 
     * @return The name of an additional parameter that is required by a top-level domain. Here are the top-level
     *         domains that require additional parameters and the names of the parameters that they require:</p>
     *         <dl>
     *         <dt>.com.au and .net.au</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AU_ID_NUMBER</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AU_ID_TYPE</code>
     *         </p>
     *         <p>
     *         Valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ABN</code> (Australian business number)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACN</code> (Australian company number)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TM</code> (Trademark number)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>.ca</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BRAND_NUMBER</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CA_BUSINESS_ENTITY_TYPE</code>
     *         </p>
     *         <p>
     *         Valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BANK</code> (Bank)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMMERCIAL_COMPANY</code> (Commercial company)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPANY</code> (Company)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COOPERATION</code> (Cooperation)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COOPERATIVE</code> (Cooperative)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COOPRIX</code> (Cooprix)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CORP</code> (Corporation)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREDIT_UNION</code> (Credit union)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FOMIA</code> (Federation of mutual insurance associations)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INC</code> (Incorporated)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LTD</code> (Limited)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LTEE</code> (Limitée)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LLC</code> (Limited liability corporation)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LLP</code> (Limited liability partnership)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LTE</code> (Lte.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MBA</code> (Mutual benefit association)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MIC</code> (Mutual insurance company)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NFP</code> (Not-for-profit corporation)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SA</code> (S.A.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SAVINGS_COMPANY</code> (Savings company)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SAVINGS_UNION</code> (Savings union)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SARL</code> (Société à responsabilité limitée)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRUST</code> (Trust)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ULC</code> (Unlimited liability corporation)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CA_LEGAL_TYPE</code>
     *         </p>
     *         <p>
     *         When <code>ContactType</code> is <code>PERSON</code>, valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ABO</code> (Aboriginal Peoples indigenous to Canada)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CCT</code> (Canadian citizen)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LGR</code> (Legal Representative of a Canadian Citizen or Permanent Resident)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RES</code> (Permanent resident of Canada)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>ContactType</code> is a value other than <code>PERSON</code>, valid values include the
     *         following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASS</code> (Canadian unincorporated association)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CCO</code> (Canadian corporation)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EDU</code> (Canadian educational institution)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GOV</code> (Government or government entity in Canada)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HOP</code> (Canadian Hospital)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INB</code> (Indian Band recognized by the Indian Act of Canada)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LAM</code> (Canadian Library, Archive, or Museum)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MAJ</code> (Her/His Majesty the Queen/King)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OMK</code> (Official mark registered in Canada)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PLT</code> (Canadian Political Party)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PRT</code> (Partnership Registered in Canada)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TDM</code> (Trademark registered in Canada)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRD</code> (Canadian Trade Union)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRS</code> (Trust established in Canada)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>.es</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ES_IDENTIFICATION</code>
     *         </p>
     *         <p>
     *         Specify the applicable value:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>For contacts inside Spain:</b> Enter your passport ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>For contacts outside of Spain:</b> Enter the VAT identification number for the company.
     *         </p>
     *         <note>
     *         <p>
     *         For .es domains, the value of <code>ContactType</code> must be <code>PERSON</code>.
     *         </p>
     *         </note></li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ES_IDENTIFICATION_TYPE</code>
     *         </p>
     *         <p>
     *         Valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DNI_AND_NIF</code> (For Spanish contacts)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NIE</code> (For foreigners with legal residence)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OTHER</code> (For contacts outside of Spain)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ES_LEGAL_FORM</code>
     *         </p>
     *         <p>
     *         Valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASSOCIATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CENTRAL_GOVERNMENT_BODY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CIVIL_SOCIETY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMMUNITY_OF_OWNERS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMMUNITY_PROPERTY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONSULATE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COOPERATIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DESIGNATION_OF_ORIGIN_SUPERVISORY_COUNCIL</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ECONOMIC_INTEREST_GROUP</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EMBASSY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENTITY_MANAGING_NATURAL_AREAS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FARM_PARTNERSHIP</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FOUNDATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GENERAL_AND_LIMITED_PARTNERSHIP</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GENERAL_PARTNERSHIP</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INDIVIDUAL</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LIMITED_COMPANY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LOCAL_AUTHORITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LOCAL_PUBLIC_ENTITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MUTUAL_INSURANCE_COMPANY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NATIONAL_PUBLIC_ENTITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ORDER_OR_RELIGIOUS_INSTITUTION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OTHERS (Only for contacts outside of Spain)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>POLITICAL_PARTY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PROFESSIONAL_ASSOCIATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUBLIC_LAW_ASSOCIATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUBLIC_LIMITED_COMPANY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REGIONAL_GOVERNMENT_BODY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REGIONAL_PUBLIC_ENTITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SAVINGS_BANK</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SPANISH_OFFICE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SPORTS_ASSOCIATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SPORTS_FEDERATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SPORTS_LIMITED_COMPANY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TEMPORARY_ALLIANCE_OF_ENTERPRISES</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRADE_UNION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WORKER_OWNED_COMPANY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WORKER_OWNED_LIMITED_COMPANY</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>.fi</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FI_BUSINESS_NUMBER</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FI_ID_NUMBER</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FI_NATIONALITY</code>
     *         </p>
     *         <p>
     *         Valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FINNISH</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_FINNISH</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FI_ORGANIZATION_TYPE</code>
     *         </p>
     *         <p>
     *         Valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPANY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CORPORATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GOVERNMENT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSTITUTION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>POLITICAL_PARTY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUBLIC_COMMUNITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TOWNSHIP</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>.fr</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BIRTH_CITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BIRTH_COUNTRY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BIRTH_DEPARTMENT</code>: Specify the INSEE code that corresponds with the department where the
     *         contact was born. If the contact was born somewhere other than France or its overseas departments,
     *         specify <code>99</code>. For more information, including a list of departments and the corresponding
     *         INSEE numbers, see the Wikipedia entry <a
     *         href="https://en.wikipedia.org/wiki/Departments_of_France">Departments of France</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BRAND_NUMBER</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>.it</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IT_NATIONALITY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IT_PIN</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IT_REGISTRANT_ENTITY_TYPE</code>
     *         </p>
     *         <p>
     *         Valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FOREIGNERS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FREELANCE_WORKERS</code> (Freelance workers and professionals)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ITALIAN_COMPANIES</code> (Italian companies and one-person companies)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NON_PROFIT_ORGANIZATIONS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OTHER_SUBJECTS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUBLIC_ORGANIZATIONS</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>.ru</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RU_PASSPORT_DATA</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>.se</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BIRTH_COUNTRY</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SE_ID_NUMBER</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>.sg</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SG_ID_NUMBER</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>.co.uk, .me.uk, and .org.uk</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>UK_CONTACT_TYPE</code>
     *         </p>
     *         <p>
     *         Valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CRC</code> (UK Corporation by Royal Charter)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FCORP</code> (Non-UK Corporation)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FIND</code> (Non-UK Individual, representing self)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FOTHER</code> (Non-UK Entity that does not fit into any other category)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GOV</code> (UK Government Body)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IND</code> (UK Individual (representing self))
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IP</code> (UK Industrial/Provident Registered Company)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LLP</code> (UK Limited Liability Partnership)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LTD</code> (UK Limited Company)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OTHER</code> (UK Entity that does not fit into any other category)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PLC</code> (UK Public Limited Company)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PTNR</code> (UK Partnership)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RCHAR</code> (UK Registered Charity)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SCH</code> (UK School)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STAT</code> (UK Statutory Body)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STRA</code> (UK Sole Trader)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UK_COMPANY_NUMBER</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         </dl>
     *         <p>
     *         In addition, many TLDs require a <code>VAT_NUMBER</code>.
     * @see ExtraParamName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an additional parameter that is required by a top-level domain. Here are the top-level domains that
     * require additional parameters and the names of the parameters that they require:
     * </p>
     * <dl>
     * <dt>.com.au and .net.au</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>AU_ID_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AU_ID_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABN</code> (Australian business number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACN</code> (Australian company number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TM</code> (Trademark number)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.ca</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BRAND_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CA_BUSINESS_ENTITY_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BANK</code> (Bank)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMERCIAL_COMPANY</code> (Commercial company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPANY</code> (Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATION</code> (Cooperation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATIVE</code> (Cooperative)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPRIX</code> (Cooprix)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CORP</code> (Corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREDIT_UNION</code> (Credit union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOMIA</code> (Federation of mutual insurance associations)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INC</code> (Incorporated)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTD</code> (Limited)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTEE</code> (Limitée)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLC</code> (Limited liability corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLP</code> (Limited liability partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTE</code> (Lte.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MBA</code> (Mutual benefit association)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIC</code> (Mutual insurance company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFP</code> (Not-for-profit corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SA</code> (S.A.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_COMPANY</code> (Savings company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_UNION</code> (Savings union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SARL</code> (Société à responsabilité limitée)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUST</code> (Trust)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ULC</code> (Unlimited liability corporation)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CA_LEGAL_TYPE</code>
     * </p>
     * <p>
     * When <code>ContactType</code> is <code>PERSON</code>, valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABO</code> (Aboriginal Peoples indigenous to Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CCT</code> (Canadian citizen)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LGR</code> (Legal Representative of a Canadian Citizen or Permanent Resident)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RES</code> (Permanent resident of Canada)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>ContactType</code> is a value other than <code>PERSON</code>, valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASS</code> (Canadian unincorporated association)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CCO</code> (Canadian corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EDU</code> (Canadian educational institution)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOV</code> (Government or government entity in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOP</code> (Canadian Hospital)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INB</code> (Indian Band recognized by the Indian Act of Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAM</code> (Canadian Library, Archive, or Museum)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAJ</code> (Her/His Majesty the Queen/King)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OMK</code> (Official mark registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLT</code> (Canadian Political Party)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRT</code> (Partnership Registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TDM</code> (Trademark registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRD</code> (Canadian Trade Union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRS</code> (Trust established in Canada)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.es</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>ES_IDENTIFICATION</code>
     * </p>
     * <p>
     * Specify the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>For contacts inside Spain:</b> Enter your passport ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For contacts outside of Spain:</b> Enter the VAT identification number for the company.
     * </p>
     * <note>
     * <p>
     * For .es domains, the value of <code>ContactType</code> must be <code>PERSON</code>.
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ES_IDENTIFICATION_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DNI_AND_NIF</code> (For Spanish contacts)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NIE</code> (For foreigners with legal residence)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code> (For contacts outside of Spain)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ES_LEGAL_FORM</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CENTRAL_GOVERNMENT_BODY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CIVIL_SOCIETY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMUNITY_OF_OWNERS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMUNITY_PROPERTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONSULATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESIGNATION_OF_ORIGIN_SUPERVISORY_COUNCIL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECONOMIC_INTEREST_GROUP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMBASSY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTITY_MANAGING_NATURAL_AREAS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FARM_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOUNDATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GENERAL_AND_LIMITED_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GENERAL_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INDIVIDUAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_AUTHORITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MUTUAL_INSURANCE_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NATIONAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORDER_OR_RELIGIOUS_INSTITUTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHERS (Only for contacts outside of Spain)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POLITICAL_PARTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROFESSIONAL_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_LAW_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL_GOVERNMENT_BODY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_BANK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPANISH_OFFICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_FEDERATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_ALLIANCE_OF_ENTERPRISES</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRADE_UNION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WORKER_OWNED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WORKER_OWNED_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.fi</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_BUSINESS_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_ID_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_NATIONALITY</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FINNISH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FINNISH</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>FI_ORGANIZATION_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CORPORATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOVERNMENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTITUTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POLITICAL_PARTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_COMMUNITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOWNSHIP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.fr</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_CITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_COUNTRY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_DEPARTMENT</code>: Specify the INSEE code that corresponds with the department where the contact was
     * born. If the contact was born somewhere other than France or its overseas departments, specify <code>99</code>.
     * For more information, including a list of departments and the corresponding INSEE numbers, see the Wikipedia
     * entry <a href="https://en.wikipedia.org/wiki/Departments_of_France">Departments of France</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BRAND_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.it</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>IT_NATIONALITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IT_PIN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IT_REGISTRANT_ENTITY_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FOREIGNERS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FREELANCE_WORKERS</code> (Freelance workers and professionals)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ITALIAN_COMPANIES</code> (Italian companies and one-person companies)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROFIT_ORGANIZATIONS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER_SUBJECTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_ORGANIZATIONS</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.ru</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RU_PASSPORT_DATA</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.se</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_COUNTRY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SE_ID_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.sg</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>SG_ID_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.co.uk, .me.uk, and .org.uk</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>UK_CONTACT_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CRC</code> (UK Corporation by Royal Charter)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FCORP</code> (Non-UK Corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIND</code> (Non-UK Individual, representing self)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOTHER</code> (Non-UK Entity that does not fit into any other category)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOV</code> (UK Government Body)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IND</code> (UK Individual (representing self))
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IP</code> (UK Industrial/Provident Registered Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLP</code> (UK Limited Liability Partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTD</code> (UK Limited Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code> (UK Entity that does not fit into any other category)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLC</code> (UK Public Limited Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PTNR</code> (UK Partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RCHAR</code> (UK Registered Charity)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCH</code> (UK School)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STAT</code> (UK Statutory Body)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STRA</code> (UK Sole Trader)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>UK_COMPANY_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * In addition, many TLDs require a <code>VAT_NUMBER</code>.
     * </p>
     * 
     * @param name
     *        The name of an additional parameter that is required by a top-level domain. Here are the top-level domains
     *        that require additional parameters and the names of the parameters that they require:</p>
     *        <dl>
     *        <dt>.com.au and .net.au</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AU_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AU_ID_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ABN</code> (Australian business number)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACN</code> (Australian company number)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TM</code> (Trademark number)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.ca</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BRAND_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CA_BUSINESS_ENTITY_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BANK</code> (Bank)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMMERCIAL_COMPANY</code> (Commercial company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPANY</code> (Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPERATION</code> (Cooperation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPERATIVE</code> (Cooperative)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPRIX</code> (Cooprix)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CORP</code> (Corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREDIT_UNION</code> (Credit union)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOMIA</code> (Federation of mutual insurance associations)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INC</code> (Incorporated)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTD</code> (Limited)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTEE</code> (Limitée)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LLC</code> (Limited liability corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LLP</code> (Limited liability partnership)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTE</code> (Lte.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MBA</code> (Mutual benefit association)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIC</code> (Mutual insurance company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFP</code> (Not-for-profit corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SA</code> (S.A.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_COMPANY</code> (Savings company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_UNION</code> (Savings union)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SARL</code> (Société à responsabilité limitée)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRUST</code> (Trust)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ULC</code> (Unlimited liability corporation)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CA_LEGAL_TYPE</code>
     *        </p>
     *        <p>
     *        When <code>ContactType</code> is <code>PERSON</code>, valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ABO</code> (Aboriginal Peoples indigenous to Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CCT</code> (Canadian citizen)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LGR</code> (Legal Representative of a Canadian Citizen or Permanent Resident)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RES</code> (Permanent resident of Canada)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>ContactType</code> is a value other than <code>PERSON</code>, valid values include the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASS</code> (Canadian unincorporated association)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CCO</code> (Canadian corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EDU</code> (Canadian educational institution)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOV</code> (Government or government entity in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOP</code> (Canadian Hospital)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INB</code> (Indian Band recognized by the Indian Act of Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAM</code> (Canadian Library, Archive, or Museum)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAJ</code> (Her/His Majesty the Queen/King)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OMK</code> (Official mark registered in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLT</code> (Canadian Political Party)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRT</code> (Partnership Registered in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TDM</code> (Trademark registered in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRD</code> (Canadian Trade Union)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRS</code> (Trust established in Canada)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.es</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ES_IDENTIFICATION</code>
     *        </p>
     *        <p>
     *        Specify the applicable value:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>For contacts inside Spain:</b> Enter your passport ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For contacts outside of Spain:</b> Enter the VAT identification number for the company.
     *        </p>
     *        <note>
     *        <p>
     *        For .es domains, the value of <code>ContactType</code> must be <code>PERSON</code>.
     *        </p>
     *        </note></li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ES_IDENTIFICATION_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DNI_AND_NIF</code> (For Spanish contacts)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NIE</code> (For foreigners with legal residence)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER</code> (For contacts outside of Spain)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ES_LEGAL_FORM</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CENTRAL_GOVERNMENT_BODY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CIVIL_SOCIETY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMMUNITY_OF_OWNERS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMMUNITY_PROPERTY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONSULATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPERATIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESIGNATION_OF_ORIGIN_SUPERVISORY_COUNCIL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ECONOMIC_INTEREST_GROUP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMBASSY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENTITY_MANAGING_NATURAL_AREAS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FARM_PARTNERSHIP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOUNDATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GENERAL_AND_LIMITED_PARTNERSHIP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GENERAL_PARTNERSHIP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INDIVIDUAL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL_AUTHORITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL_PUBLIC_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MUTUAL_INSURANCE_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NATIONAL_PUBLIC_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORDER_OR_RELIGIOUS_INSTITUTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHERS (Only for contacts outside of Spain)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POLITICAL_PARTY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROFESSIONAL_ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_LAW_ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGIONAL_GOVERNMENT_BODY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGIONAL_PUBLIC_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_BANK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPANISH_OFFICE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPORTS_ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPORTS_FEDERATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPORTS_LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_ALLIANCE_OF_ENTERPRISES</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRADE_UNION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WORKER_OWNED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WORKER_OWNED_LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.fi</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_BUSINESS_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_NATIONALITY</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FINNISH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_FINNISH</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_ORGANIZATION_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CORPORATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOVERNMENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTITUTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POLITICAL_PARTY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_COMMUNITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOWNSHIP</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.fr</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_CITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BIRTH_COUNTRY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BIRTH_DEPARTMENT</code>: Specify the INSEE code that corresponds with the department where the
     *        contact was born. If the contact was born somewhere other than France or its overseas departments, specify
     *        <code>99</code>. For more information, including a list of departments and the corresponding INSEE
     *        numbers, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/Departments_of_France">Departments
     *        of France</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BRAND_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.it</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IT_NATIONALITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IT_PIN</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IT_REGISTRANT_ENTITY_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FOREIGNERS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FREELANCE_WORKERS</code> (Freelance workers and professionals)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ITALIAN_COMPANIES</code> (Italian companies and one-person companies)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROFIT_ORGANIZATIONS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER_SUBJECTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_ORGANIZATIONS</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.ru</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RU_PASSPORT_DATA</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.se</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_COUNTRY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SE_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.sg</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SG_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.co.uk, .me.uk, and .org.uk</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UK_CONTACT_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CRC</code> (UK Corporation by Royal Charter)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FCORP</code> (Non-UK Corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FIND</code> (Non-UK Individual, representing self)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOTHER</code> (Non-UK Entity that does not fit into any other category)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOV</code> (UK Government Body)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IND</code> (UK Individual (representing self))
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IP</code> (UK Industrial/Provident Registered Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LLP</code> (UK Limited Liability Partnership)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTD</code> (UK Limited Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER</code> (UK Entity that does not fit into any other category)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLC</code> (UK Public Limited Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PTNR</code> (UK Partnership)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RCHAR</code> (UK Registered Charity)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCH</code> (UK School)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STAT</code> (UK Statutory Body)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STRA</code> (UK Sole Trader)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UK_COMPANY_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        </dl>
     *        <p>
     *        In addition, many TLDs require a <code>VAT_NUMBER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtraParamName
     */

    public ExtraParam withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of an additional parameter that is required by a top-level domain. Here are the top-level domains that
     * require additional parameters and the names of the parameters that they require:
     * </p>
     * <dl>
     * <dt>.com.au and .net.au</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>AU_ID_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AU_ID_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABN</code> (Australian business number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACN</code> (Australian company number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TM</code> (Trademark number)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.ca</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BRAND_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CA_BUSINESS_ENTITY_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BANK</code> (Bank)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMERCIAL_COMPANY</code> (Commercial company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPANY</code> (Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATION</code> (Cooperation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATIVE</code> (Cooperative)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPRIX</code> (Cooprix)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CORP</code> (Corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREDIT_UNION</code> (Credit union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOMIA</code> (Federation of mutual insurance associations)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INC</code> (Incorporated)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTD</code> (Limited)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTEE</code> (Limitée)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLC</code> (Limited liability corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLP</code> (Limited liability partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTE</code> (Lte.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MBA</code> (Mutual benefit association)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIC</code> (Mutual insurance company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFP</code> (Not-for-profit corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SA</code> (S.A.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_COMPANY</code> (Savings company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_UNION</code> (Savings union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SARL</code> (Société à responsabilité limitée)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUST</code> (Trust)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ULC</code> (Unlimited liability corporation)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CA_LEGAL_TYPE</code>
     * </p>
     * <p>
     * When <code>ContactType</code> is <code>PERSON</code>, valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABO</code> (Aboriginal Peoples indigenous to Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CCT</code> (Canadian citizen)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LGR</code> (Legal Representative of a Canadian Citizen or Permanent Resident)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RES</code> (Permanent resident of Canada)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>ContactType</code> is a value other than <code>PERSON</code>, valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASS</code> (Canadian unincorporated association)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CCO</code> (Canadian corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EDU</code> (Canadian educational institution)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOV</code> (Government or government entity in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOP</code> (Canadian Hospital)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INB</code> (Indian Band recognized by the Indian Act of Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAM</code> (Canadian Library, Archive, or Museum)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAJ</code> (Her/His Majesty the Queen/King)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OMK</code> (Official mark registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLT</code> (Canadian Political Party)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRT</code> (Partnership Registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TDM</code> (Trademark registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRD</code> (Canadian Trade Union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRS</code> (Trust established in Canada)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.es</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>ES_IDENTIFICATION</code>
     * </p>
     * <p>
     * Specify the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>For contacts inside Spain:</b> Enter your passport ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For contacts outside of Spain:</b> Enter the VAT identification number for the company.
     * </p>
     * <note>
     * <p>
     * For .es domains, the value of <code>ContactType</code> must be <code>PERSON</code>.
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ES_IDENTIFICATION_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DNI_AND_NIF</code> (For Spanish contacts)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NIE</code> (For foreigners with legal residence)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code> (For contacts outside of Spain)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ES_LEGAL_FORM</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CENTRAL_GOVERNMENT_BODY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CIVIL_SOCIETY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMUNITY_OF_OWNERS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMUNITY_PROPERTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONSULATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESIGNATION_OF_ORIGIN_SUPERVISORY_COUNCIL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECONOMIC_INTEREST_GROUP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMBASSY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTITY_MANAGING_NATURAL_AREAS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FARM_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOUNDATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GENERAL_AND_LIMITED_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GENERAL_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INDIVIDUAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_AUTHORITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MUTUAL_INSURANCE_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NATIONAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORDER_OR_RELIGIOUS_INSTITUTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHERS (Only for contacts outside of Spain)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POLITICAL_PARTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROFESSIONAL_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_LAW_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL_GOVERNMENT_BODY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_BANK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPANISH_OFFICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_FEDERATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_ALLIANCE_OF_ENTERPRISES</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRADE_UNION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WORKER_OWNED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WORKER_OWNED_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.fi</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_BUSINESS_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_ID_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_NATIONALITY</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FINNISH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FINNISH</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>FI_ORGANIZATION_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CORPORATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOVERNMENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTITUTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POLITICAL_PARTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_COMMUNITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOWNSHIP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.fr</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_CITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_COUNTRY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_DEPARTMENT</code>: Specify the INSEE code that corresponds with the department where the contact was
     * born. If the contact was born somewhere other than France or its overseas departments, specify <code>99</code>.
     * For more information, including a list of departments and the corresponding INSEE numbers, see the Wikipedia
     * entry <a href="https://en.wikipedia.org/wiki/Departments_of_France">Departments of France</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BRAND_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.it</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>IT_NATIONALITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IT_PIN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IT_REGISTRANT_ENTITY_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FOREIGNERS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FREELANCE_WORKERS</code> (Freelance workers and professionals)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ITALIAN_COMPANIES</code> (Italian companies and one-person companies)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROFIT_ORGANIZATIONS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER_SUBJECTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_ORGANIZATIONS</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.ru</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RU_PASSPORT_DATA</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.se</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_COUNTRY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SE_ID_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.sg</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>SG_ID_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.co.uk, .me.uk, and .org.uk</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>UK_CONTACT_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CRC</code> (UK Corporation by Royal Charter)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FCORP</code> (Non-UK Corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIND</code> (Non-UK Individual, representing self)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOTHER</code> (Non-UK Entity that does not fit into any other category)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOV</code> (UK Government Body)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IND</code> (UK Individual (representing self))
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IP</code> (UK Industrial/Provident Registered Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLP</code> (UK Limited Liability Partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTD</code> (UK Limited Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code> (UK Entity that does not fit into any other category)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLC</code> (UK Public Limited Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PTNR</code> (UK Partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RCHAR</code> (UK Registered Charity)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCH</code> (UK School)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STAT</code> (UK Statutory Body)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STRA</code> (UK Sole Trader)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>UK_COMPANY_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * In addition, many TLDs require a <code>VAT_NUMBER</code>.
     * </p>
     * 
     * @param name
     *        The name of an additional parameter that is required by a top-level domain. Here are the top-level domains
     *        that require additional parameters and the names of the parameters that they require:</p>
     *        <dl>
     *        <dt>.com.au and .net.au</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AU_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AU_ID_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ABN</code> (Australian business number)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACN</code> (Australian company number)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TM</code> (Trademark number)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.ca</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BRAND_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CA_BUSINESS_ENTITY_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BANK</code> (Bank)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMMERCIAL_COMPANY</code> (Commercial company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPANY</code> (Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPERATION</code> (Cooperation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPERATIVE</code> (Cooperative)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPRIX</code> (Cooprix)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CORP</code> (Corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREDIT_UNION</code> (Credit union)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOMIA</code> (Federation of mutual insurance associations)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INC</code> (Incorporated)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTD</code> (Limited)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTEE</code> (Limitée)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LLC</code> (Limited liability corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LLP</code> (Limited liability partnership)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTE</code> (Lte.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MBA</code> (Mutual benefit association)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIC</code> (Mutual insurance company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFP</code> (Not-for-profit corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SA</code> (S.A.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_COMPANY</code> (Savings company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_UNION</code> (Savings union)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SARL</code> (Société à responsabilité limitée)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRUST</code> (Trust)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ULC</code> (Unlimited liability corporation)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CA_LEGAL_TYPE</code>
     *        </p>
     *        <p>
     *        When <code>ContactType</code> is <code>PERSON</code>, valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ABO</code> (Aboriginal Peoples indigenous to Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CCT</code> (Canadian citizen)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LGR</code> (Legal Representative of a Canadian Citizen or Permanent Resident)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RES</code> (Permanent resident of Canada)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>ContactType</code> is a value other than <code>PERSON</code>, valid values include the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASS</code> (Canadian unincorporated association)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CCO</code> (Canadian corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EDU</code> (Canadian educational institution)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOV</code> (Government or government entity in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOP</code> (Canadian Hospital)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INB</code> (Indian Band recognized by the Indian Act of Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAM</code> (Canadian Library, Archive, or Museum)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAJ</code> (Her/His Majesty the Queen/King)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OMK</code> (Official mark registered in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLT</code> (Canadian Political Party)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRT</code> (Partnership Registered in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TDM</code> (Trademark registered in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRD</code> (Canadian Trade Union)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRS</code> (Trust established in Canada)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.es</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ES_IDENTIFICATION</code>
     *        </p>
     *        <p>
     *        Specify the applicable value:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>For contacts inside Spain:</b> Enter your passport ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For contacts outside of Spain:</b> Enter the VAT identification number for the company.
     *        </p>
     *        <note>
     *        <p>
     *        For .es domains, the value of <code>ContactType</code> must be <code>PERSON</code>.
     *        </p>
     *        </note></li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ES_IDENTIFICATION_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DNI_AND_NIF</code> (For Spanish contacts)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NIE</code> (For foreigners with legal residence)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER</code> (For contacts outside of Spain)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ES_LEGAL_FORM</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CENTRAL_GOVERNMENT_BODY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CIVIL_SOCIETY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMMUNITY_OF_OWNERS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMMUNITY_PROPERTY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONSULATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPERATIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESIGNATION_OF_ORIGIN_SUPERVISORY_COUNCIL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ECONOMIC_INTEREST_GROUP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMBASSY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENTITY_MANAGING_NATURAL_AREAS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FARM_PARTNERSHIP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOUNDATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GENERAL_AND_LIMITED_PARTNERSHIP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GENERAL_PARTNERSHIP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INDIVIDUAL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL_AUTHORITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL_PUBLIC_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MUTUAL_INSURANCE_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NATIONAL_PUBLIC_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORDER_OR_RELIGIOUS_INSTITUTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHERS (Only for contacts outside of Spain)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POLITICAL_PARTY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROFESSIONAL_ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_LAW_ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGIONAL_GOVERNMENT_BODY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGIONAL_PUBLIC_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_BANK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPANISH_OFFICE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPORTS_ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPORTS_FEDERATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPORTS_LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_ALLIANCE_OF_ENTERPRISES</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRADE_UNION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WORKER_OWNED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WORKER_OWNED_LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.fi</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_BUSINESS_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_NATIONALITY</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FINNISH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_FINNISH</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_ORGANIZATION_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CORPORATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOVERNMENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTITUTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POLITICAL_PARTY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_COMMUNITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOWNSHIP</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.fr</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_CITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BIRTH_COUNTRY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BIRTH_DEPARTMENT</code>: Specify the INSEE code that corresponds with the department where the
     *        contact was born. If the contact was born somewhere other than France or its overseas departments, specify
     *        <code>99</code>. For more information, including a list of departments and the corresponding INSEE
     *        numbers, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/Departments_of_France">Departments
     *        of France</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BRAND_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.it</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IT_NATIONALITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IT_PIN</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IT_REGISTRANT_ENTITY_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FOREIGNERS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FREELANCE_WORKERS</code> (Freelance workers and professionals)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ITALIAN_COMPANIES</code> (Italian companies and one-person companies)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROFIT_ORGANIZATIONS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER_SUBJECTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_ORGANIZATIONS</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.ru</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RU_PASSPORT_DATA</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.se</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_COUNTRY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SE_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.sg</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SG_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.co.uk, .me.uk, and .org.uk</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UK_CONTACT_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CRC</code> (UK Corporation by Royal Charter)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FCORP</code> (Non-UK Corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FIND</code> (Non-UK Individual, representing self)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOTHER</code> (Non-UK Entity that does not fit into any other category)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOV</code> (UK Government Body)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IND</code> (UK Individual (representing self))
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IP</code> (UK Industrial/Provident Registered Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LLP</code> (UK Limited Liability Partnership)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTD</code> (UK Limited Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER</code> (UK Entity that does not fit into any other category)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLC</code> (UK Public Limited Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PTNR</code> (UK Partnership)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RCHAR</code> (UK Registered Charity)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCH</code> (UK School)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STAT</code> (UK Statutory Body)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STRA</code> (UK Sole Trader)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UK_COMPANY_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        </dl>
     *        <p>
     *        In addition, many TLDs require a <code>VAT_NUMBER</code>.
     * @see ExtraParamName
     */

    public void setName(ExtraParamName name) {
        withName(name);
    }

    /**
     * <p>
     * The name of an additional parameter that is required by a top-level domain. Here are the top-level domains that
     * require additional parameters and the names of the parameters that they require:
     * </p>
     * <dl>
     * <dt>.com.au and .net.au</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>AU_ID_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AU_ID_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABN</code> (Australian business number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACN</code> (Australian company number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TM</code> (Trademark number)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.ca</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BRAND_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CA_BUSINESS_ENTITY_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BANK</code> (Bank)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMERCIAL_COMPANY</code> (Commercial company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPANY</code> (Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATION</code> (Cooperation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATIVE</code> (Cooperative)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPRIX</code> (Cooprix)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CORP</code> (Corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREDIT_UNION</code> (Credit union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOMIA</code> (Federation of mutual insurance associations)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INC</code> (Incorporated)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTD</code> (Limited)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTEE</code> (Limitée)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLC</code> (Limited liability corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLP</code> (Limited liability partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTE</code> (Lte.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MBA</code> (Mutual benefit association)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIC</code> (Mutual insurance company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFP</code> (Not-for-profit corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SA</code> (S.A.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_COMPANY</code> (Savings company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_UNION</code> (Savings union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SARL</code> (Société à responsabilité limitée)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUST</code> (Trust)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ULC</code> (Unlimited liability corporation)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CA_LEGAL_TYPE</code>
     * </p>
     * <p>
     * When <code>ContactType</code> is <code>PERSON</code>, valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABO</code> (Aboriginal Peoples indigenous to Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CCT</code> (Canadian citizen)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LGR</code> (Legal Representative of a Canadian Citizen or Permanent Resident)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RES</code> (Permanent resident of Canada)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>ContactType</code> is a value other than <code>PERSON</code>, valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASS</code> (Canadian unincorporated association)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CCO</code> (Canadian corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EDU</code> (Canadian educational institution)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOV</code> (Government or government entity in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOP</code> (Canadian Hospital)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INB</code> (Indian Band recognized by the Indian Act of Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAM</code> (Canadian Library, Archive, or Museum)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MAJ</code> (Her/His Majesty the Queen/King)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OMK</code> (Official mark registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLT</code> (Canadian Political Party)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PRT</code> (Partnership Registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TDM</code> (Trademark registered in Canada)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRD</code> (Canadian Trade Union)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRS</code> (Trust established in Canada)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.es</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>ES_IDENTIFICATION</code>
     * </p>
     * <p>
     * Specify the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>For contacts inside Spain:</b> Enter your passport ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For contacts outside of Spain:</b> Enter the VAT identification number for the company.
     * </p>
     * <note>
     * <p>
     * For .es domains, the value of <code>ContactType</code> must be <code>PERSON</code>.
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ES_IDENTIFICATION_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DNI_AND_NIF</code> (For Spanish contacts)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NIE</code> (For foreigners with legal residence)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code> (For contacts outside of Spain)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ES_LEGAL_FORM</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CENTRAL_GOVERNMENT_BODY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CIVIL_SOCIETY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMUNITY_OF_OWNERS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMMUNITY_PROPERTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONSULATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COOPERATIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESIGNATION_OF_ORIGIN_SUPERVISORY_COUNCIL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECONOMIC_INTEREST_GROUP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMBASSY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTITY_MANAGING_NATURAL_AREAS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FARM_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOUNDATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GENERAL_AND_LIMITED_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GENERAL_PARTNERSHIP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INDIVIDUAL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_AUTHORITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MUTUAL_INSURANCE_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NATIONAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORDER_OR_RELIGIOUS_INSTITUTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHERS (Only for contacts outside of Spain)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POLITICAL_PARTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROFESSIONAL_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_LAW_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL_GOVERNMENT_BODY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL_PUBLIC_ENTITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SAVINGS_BANK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPANISH_OFFICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_ASSOCIATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_FEDERATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPORTS_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_ALLIANCE_OF_ENTERPRISES</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRADE_UNION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WORKER_OWNED_COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WORKER_OWNED_LIMITED_COMPANY</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.fi</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_BUSINESS_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_ID_NUMBER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FI_NATIONALITY</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FINNISH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FINNISH</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>FI_ORGANIZATION_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPANY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CORPORATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOVERNMENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTITUTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POLITICAL_PARTY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_COMMUNITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOWNSHIP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.fr</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_CITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_COUNTRY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BIRTH_DEPARTMENT</code>: Specify the INSEE code that corresponds with the department where the contact was
     * born. If the contact was born somewhere other than France or its overseas departments, specify <code>99</code>.
     * For more information, including a list of departments and the corresponding INSEE numbers, see the Wikipedia
     * entry <a href="https://en.wikipedia.org/wiki/Departments_of_France">Departments of France</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BRAND_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.it</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>IT_NATIONALITY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IT_PIN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IT_REGISTRANT_ENTITY_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FOREIGNERS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FREELANCE_WORKERS</code> (Freelance workers and professionals)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ITALIAN_COMPANIES</code> (Italian companies and one-person companies)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROFIT_ORGANIZATIONS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER_SUBJECTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_ORGANIZATIONS</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>.ru</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RU_PASSPORT_DATA</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.se</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>BIRTH_COUNTRY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SE_ID_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.sg</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>SG_ID_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>.co.uk, .me.uk, and .org.uk</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>UK_CONTACT_TYPE</code>
     * </p>
     * <p>
     * Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CRC</code> (UK Corporation by Royal Charter)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FCORP</code> (Non-UK Corporation)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIND</code> (Non-UK Individual, representing self)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FOTHER</code> (Non-UK Entity that does not fit into any other category)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOV</code> (UK Government Body)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IND</code> (UK Individual (representing self))
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IP</code> (UK Industrial/Provident Registered Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LLP</code> (UK Limited Liability Partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LTD</code> (UK Limited Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code> (UK Entity that does not fit into any other category)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLC</code> (UK Public Limited Company)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PTNR</code> (UK Partnership)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RCHAR</code> (UK Registered Charity)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCH</code> (UK School)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STAT</code> (UK Statutory Body)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STRA</code> (UK Sole Trader)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>UK_COMPANY_NUMBER</code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * In addition, many TLDs require a <code>VAT_NUMBER</code>.
     * </p>
     * 
     * @param name
     *        The name of an additional parameter that is required by a top-level domain. Here are the top-level domains
     *        that require additional parameters and the names of the parameters that they require:</p>
     *        <dl>
     *        <dt>.com.au and .net.au</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AU_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AU_ID_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ABN</code> (Australian business number)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACN</code> (Australian company number)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TM</code> (Trademark number)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.ca</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BRAND_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CA_BUSINESS_ENTITY_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BANK</code> (Bank)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMMERCIAL_COMPANY</code> (Commercial company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPANY</code> (Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPERATION</code> (Cooperation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPERATIVE</code> (Cooperative)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPRIX</code> (Cooprix)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CORP</code> (Corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREDIT_UNION</code> (Credit union)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOMIA</code> (Federation of mutual insurance associations)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INC</code> (Incorporated)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTD</code> (Limited)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTEE</code> (Limitée)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LLC</code> (Limited liability corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LLP</code> (Limited liability partnership)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTE</code> (Lte.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MBA</code> (Mutual benefit association)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIC</code> (Mutual insurance company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFP</code> (Not-for-profit corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SA</code> (S.A.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_COMPANY</code> (Savings company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_UNION</code> (Savings union)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SARL</code> (Société à responsabilité limitée)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRUST</code> (Trust)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ULC</code> (Unlimited liability corporation)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CA_LEGAL_TYPE</code>
     *        </p>
     *        <p>
     *        When <code>ContactType</code> is <code>PERSON</code>, valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ABO</code> (Aboriginal Peoples indigenous to Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CCT</code> (Canadian citizen)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LGR</code> (Legal Representative of a Canadian Citizen or Permanent Resident)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RES</code> (Permanent resident of Canada)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>ContactType</code> is a value other than <code>PERSON</code>, valid values include the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASS</code> (Canadian unincorporated association)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CCO</code> (Canadian corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EDU</code> (Canadian educational institution)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOV</code> (Government or government entity in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOP</code> (Canadian Hospital)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INB</code> (Indian Band recognized by the Indian Act of Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAM</code> (Canadian Library, Archive, or Museum)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MAJ</code> (Her/His Majesty the Queen/King)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OMK</code> (Official mark registered in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLT</code> (Canadian Political Party)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PRT</code> (Partnership Registered in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TDM</code> (Trademark registered in Canada)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRD</code> (Canadian Trade Union)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRS</code> (Trust established in Canada)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.es</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ES_IDENTIFICATION</code>
     *        </p>
     *        <p>
     *        Specify the applicable value:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>For contacts inside Spain:</b> Enter your passport ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For contacts outside of Spain:</b> Enter the VAT identification number for the company.
     *        </p>
     *        <note>
     *        <p>
     *        For .es domains, the value of <code>ContactType</code> must be <code>PERSON</code>.
     *        </p>
     *        </note></li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ES_IDENTIFICATION_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DNI_AND_NIF</code> (For Spanish contacts)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NIE</code> (For foreigners with legal residence)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER</code> (For contacts outside of Spain)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ES_LEGAL_FORM</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CENTRAL_GOVERNMENT_BODY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CIVIL_SOCIETY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMMUNITY_OF_OWNERS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMMUNITY_PROPERTY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONSULATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COOPERATIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESIGNATION_OF_ORIGIN_SUPERVISORY_COUNCIL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ECONOMIC_INTEREST_GROUP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMBASSY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENTITY_MANAGING_NATURAL_AREAS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FARM_PARTNERSHIP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOUNDATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GENERAL_AND_LIMITED_PARTNERSHIP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GENERAL_PARTNERSHIP</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INDIVIDUAL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL_AUTHORITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL_PUBLIC_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MUTUAL_INSURANCE_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NATIONAL_PUBLIC_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORDER_OR_RELIGIOUS_INSTITUTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHERS (Only for contacts outside of Spain)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POLITICAL_PARTY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROFESSIONAL_ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_LAW_ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGIONAL_GOVERNMENT_BODY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGIONAL_PUBLIC_ENTITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SAVINGS_BANK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPANISH_OFFICE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPORTS_ASSOCIATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPORTS_FEDERATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPORTS_LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_ALLIANCE_OF_ENTERPRISES</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRADE_UNION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WORKER_OWNED_COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WORKER_OWNED_LIMITED_COMPANY</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.fi</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_BUSINESS_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_NATIONALITY</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FINNISH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_FINNISH</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FI_ORGANIZATION_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPANY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CORPORATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOVERNMENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTITUTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POLITICAL_PARTY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_COMMUNITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOWNSHIP</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.fr</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_CITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BIRTH_COUNTRY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BIRTH_DEPARTMENT</code>: Specify the INSEE code that corresponds with the department where the
     *        contact was born. If the contact was born somewhere other than France or its overseas departments, specify
     *        <code>99</code>. For more information, including a list of departments and the corresponding INSEE
     *        numbers, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/Departments_of_France">Departments
     *        of France</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BRAND_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.it</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IT_NATIONALITY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IT_PIN</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IT_REGISTRANT_ENTITY_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FOREIGNERS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FREELANCE_WORKERS</code> (Freelance workers and professionals)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ITALIAN_COMPANIES</code> (Italian companies and one-person companies)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROFIT_ORGANIZATIONS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER_SUBJECTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_ORGANIZATIONS</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.ru</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_DATE_IN_YYYY_MM_DD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RU_PASSPORT_DATA</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.se</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BIRTH_COUNTRY</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SE_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.sg</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SG_ID_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>.co.uk, .me.uk, and .org.uk</dt>
     *        <dd>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UK_CONTACT_TYPE</code>
     *        </p>
     *        <p>
     *        Valid values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CRC</code> (UK Corporation by Royal Charter)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FCORP</code> (Non-UK Corporation)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FIND</code> (Non-UK Individual, representing self)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FOTHER</code> (Non-UK Entity that does not fit into any other category)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOV</code> (UK Government Body)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IND</code> (UK Individual (representing self))
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IP</code> (UK Industrial/Provident Registered Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LLP</code> (UK Limited Liability Partnership)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LTD</code> (UK Limited Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER</code> (UK Entity that does not fit into any other category)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLC</code> (UK Public Limited Company)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PTNR</code> (UK Partnership)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RCHAR</code> (UK Registered Charity)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCH</code> (UK School)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STAT</code> (UK Statutory Body)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STRA</code> (UK Sole Trader)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UK_COMPANY_NUMBER</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        </dl>
     *        <p>
     *        In addition, many TLDs require a <code>VAT_NUMBER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtraParamName
     */

    public ExtraParam withName(ExtraParamName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value that corresponds with the name of an extra parameter.
     * </p>
     * 
     * @param value
     *        The value that corresponds with the name of an extra parameter.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value that corresponds with the name of an extra parameter.
     * </p>
     * 
     * @return The value that corresponds with the name of an extra parameter.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value that corresponds with the name of an extra parameter.
     * </p>
     * 
     * @param value
     *        The value that corresponds with the name of an extra parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtraParam withValue(String value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtraParam == false)
            return false;
        ExtraParam other = (ExtraParam) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ExtraParam clone() {
        try {
            return (ExtraParam) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.ExtraParamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
