/**
 * DB-LOCK-POC
 * 라라벨에 스웨거 적용 테스트를 위한 프로젝트
 *
 * OpenAPI spec version: 1
 * Contact: juwonkim@me.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */


import ApiClient from '../ApiClient';





/**
* The LoginRequest model module.
* @module model/LoginRequest
* @version 1
*/
export default class LoginRequest {
    /**
    * Constructs a new <code>LoginRequest</code>.
    * @alias module:model/LoginRequest
    * @class
    * @param email {String} 사용자 이메일
    * @param password {String} 사용자 비밀번호 (6 글자 이상)
    */

    constructor(email, password) {
        

        
        

        this['email'] = email;this['password'] = password;

        
    }

    /**
    * Constructs a <code>LoginRequest</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LoginRequest} obj Optional instance to populate.
    * @return {module:model/LoginRequest} The populated <code>LoginRequest</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LoginRequest();

            
            
            

            if (data.hasOwnProperty('email')) {
                obj['email'] = ApiClient.convertToType(data['email'], 'String');
            }
            if (data.hasOwnProperty('password')) {
                obj['password'] = ApiClient.convertToType(data['password'], 'String');
            }
        }
        return obj;
    }

    /**
    * 사용자 이메일
    * @member {String} email
    */
    email = undefined;
    /**
    * 사용자 비밀번호 (6 글자 이상)
    * @member {String} password
    */
    password = undefined;








}


