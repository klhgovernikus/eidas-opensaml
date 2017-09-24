/*
 * The eidas-opensaml project is an open-source package that extends OpenSAML
 * with definitions for the eIDAS Framework.
 *
 * More details on <https://github.com/litsec/eidas-opensaml>
 * Copyright (C) 2016-2017 Litsec AB
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package se.litsec.eidas.opensaml2.ext.attributes;

/**
 * Constant values for attribute names defined in
 * <a href="https://joinup.ec.europa.eu/sites/default/files/eidas_saml_attribute_profile_v1.0_2.pdf">eIDAS SAML
 * Attribute Profile</a>.
 * 
 * @author Martin Lindström (martin.lindstrom@litsec.se)
 */
public class AttributeConstants {

  /** Attribute name for the LoA attribute used in metadata (as an EntityAttribute). */
  public static final String EIDAS_LOA_ATTRIBUTE_NAME = "http://eidas.europa.eu/LoA";

  /** Attribute name for PersonIdentifier. */
  public static final String EIDAS_PERSON_IDENTIFIER_ATTRIBUTE_NAME = "http://eidas.europa.eu/attributes/naturalperson/PersonIdentifier";

  /** PersonIdentifier friendly name. */
  public static final String EIDAS_PERSON_IDENTIFIER_ATTRIBUTE_FRIENDLY_NAME = "PersonIdentifier";

  /** Attribute name for CurrentFamilyName. */
  public static final String EIDAS_CURRENT_FAMILY_NAME_ATTRIBUTE_NAME = "http://eidas.europa.eu/attributes/naturalperson/CurrentFamilyName";

  /** CurrentFamilyName friendly name. */
  public static final String EIDAS_CURRENT_FAMILY_NAME_ATTRIBUTE_FRIENDLY_NAME = "FamilyName";

  /** Attribute name for CurrentGivenName. */
  public static final String EIDAS_CURRENT_GIVEN_NAME_ATTRIBUTE_NAME = "http://eidas.europa.eu/attributes/naturalperson/CurrentGivenName";

  /** CurrentGivenName friendly name. */
  public static final String EIDAS_CURRENT_GIVEN_NAME_ATTRIBUTE_FRIENDLY_NAME = "FirstName";

  /** Attribute name for DateOfBirth. */
  public static final String EIDAS_DATE_OF_BIRTH_ATTRIBUTE_NAME = "http://eidas.europa.eu/attributes/naturalperson/DateOfBirth";

  /** DateOfBirth friendly name. */
  public static final String EIDAS_DATE_OF_BIRTH_ATTRIBUTE_FRIENDLY_NAME = "DateOfBirth";

  /** Attribute name for Gender. */
  public static final String EIDAS_GENDER_ATTRIBUTE_NAME = "http://eidas.europa.eu/attributes/naturalperson/Gender";

  /** Gender friendly name. */
  public static final String EIDAS_GENDER_ATTRIBUTE_FRIENDLY_NAME = "Gender";

  /** Attribute name for CurrentAddress. */
  public static final String EIDAS_CURRENT_ADDRESS_ATTRIBUTE_NAME = "http://eidas.europa.eu/attributes/naturalperson/CurrentAddress";

  /** CurrentGivenName friendly name. */
  public static final String EIDAS_CURRENT_ADDRESS_ATTRIBUTE_FRIENDLY_NAME = "CurrentAddress";
  
  /** Attribute name for BirthName. */
  public static final String EIDAS_BIRTH_NAME_ATTRIBUTE_NAME = "http://eidas.europa.eu/attributes/naturalperson/BirthName";
  
  /** BirthName friendly name. */
  public static final String EIDAS_BIRTH_NAME_ATTRIBUTE_FRIENDLY_NAME = "BirthName";

  /** Attribute name for PlaceOfBirth. */
  public static final String EIDAS_PLACE_OF_BIRTH_ATTRIBUTE_NAME = "http://eidas.europa.eu/attributes/naturalperson/PlaceOfBirth";
  
  /** PlaceOfBirth friendly name. */
  public static final String EIDAS_PLACE_OF_BIRTH_ATTRIBUTE_FRIENDLY_NAME = "PlaceOfBirth";  

}
