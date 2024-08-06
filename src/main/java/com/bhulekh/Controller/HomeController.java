package com.bhulekh.Controller;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhulekh.helper.AuthenticationRequest;
import com.bhulekh.helper.AuthenticationResponse;
import com.bhulekh.helper.CustomUserDetailsService;
import com.bhulekh.helper.DataBaseContextHolder;
import com.bhulekh.helper.JwtUtil;
//import com.bhulekh.helper.UserRepository;
import com.bhulekh.models.Agri_t_charge_detailMode;
import com.bhulekh.models.Lr_payblexDTO;
import com.bhulekh.models.Lr_payblexModel;
import com.bhulekh.models.RorResponse;
import com.bhulekh.models.Up_gata_detailModel;
import com.bhulekh.models.Up_gata_detail_1Model;
import com.bhulekh.models.Up_gata_sequence_partModel;
import com.bhulekh.models.Up_khata_detailModel;
import com.bhulekh.models.Up_land_type_detailModel;
import com.bhulekh.models.Up_ns_detailModel;
import com.bhulekh.models.Up_order_detailModel;
import com.bhulekh.models.Up_r6_add_owner_detail_rtkModel;
import com.bhulekh.models.Up_r6_detail_rtkOModel;
import com.bhulekh.models.Up_r6_detail_rtkSpecialModel;
import com.bhulekh.models.Up_r6_remove_owner_detail_rtkModel;
import com.bhulekh.models.Up_ra_detailModel;
import com.bhulekh.models.Up_remark_detailModel;
import com.bhulekh.models.Up_ss_detailModel;
import com.bhulekh.models.Up_tehsil_masterModel;
import com.bhulekh.models.Up_village_masterModel;
import com.bhulekh.models.Up_village_master_lock_rtkModel;
import com.bhulekh.models.Up_villagelistModel;
import com.bhulekh.repository.Up_gata_detailRepo.ListOfAreaKhasraUniqueCode;
import com.bhulekh.service.Agri_t_charge_detailService;
import com.bhulekh.service.Agri_t_decharge_detailService;
import com.bhulekh.service.Lr_payblexModelImpl;
import com.bhulekh.service.RorService;
import com.bhulekh.service.Up_gata_detailService;
import com.bhulekh.service.Up_gata_detail_backupService;
import com.bhulekh.service.Up_hissa_detailService;
import com.bhulekh.service.Up_khata_detailService;
import com.bhulekh.service.Up_khata_detail_Service;
import com.bhulekh.service.Up_land_type_detailService;
import com.bhulekh.service.Up_ns_detailService;
import com.bhulekh.service.Up_order_detailService;
import com.bhulekh.service.Up_r6_add_owner_detail_rtkService;
import com.bhulekh.service.Up_r6_detail_rtkService;
import com.bhulekh.service.Up_r6_remove_owner_detail_rtkService;
import com.bhulekh.service.Up_ra_detailService;
import com.bhulekh.service.Up_remark_detailService;
import com.bhulekh.service.Up_ss_detailService;
import com.bhulekh.service.Up_tehsil_masterService;
import com.bhulekh.service.Up_village_ansh_log_rtk_service;
import com.bhulekh.service.Up_village_masterService;
import com.bhulekh.service.Up_village_master_lock_rtkService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")

@RequestMapping("/api")
public class HomeController {

	@Autowired
	private Up_tehsil_masterService up_tehsil_masterService;

	@Autowired
	private Up_village_masterService up_village_masterService;

	@Autowired
	private Up_gata_detailService up_gata_detailService;

	@Autowired
	private Up_gata_detail_backupService up_gata_detail_backupService;

	@Autowired
	private Up_ss_detailService up_ss_detailService;

	@Autowired
	private Up_ns_detailService up_ns_detailService;

	@Autowired
	private Up_ra_detailService up_ra_detailService;

	@Autowired
	private Up_khata_detailService up_khata_detailService;

	@Autowired
	private Up_village_master_lock_rtkService up_village_master_lock_rtkService;

	@Autowired
	private Up_land_type_detailService up_land_type_detailService;

	@Autowired
	private Up_khata_detail_Service up_khata_detail_Service;
	@Autowired
	private Up_hissa_detailService up_hissa_detailService;
	@Autowired
	private Up_r6_detail_rtkService up_r6_detail_rtkService;

	@Autowired
	private Up_r6_remove_owner_detail_rtkService up_r6_remove_owner_detail_rtkService;

	@Autowired
	private Up_r6_add_owner_detail_rtkService up_r6_add_owner_detail_rtkService;

	@Autowired
	private Agri_t_charge_detailService agri_t_charge_detailService;

	@Autowired
	private Agri_t_decharge_detailService agri_t_decharge_detailService;

	@Autowired
	private Up_remark_detailService up_remark_detailService;

	@Autowired
	private Up_order_detailService up_order_detailService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private CustomUserDetailsService userDetailsService;

	// @Autowired
	// private UserRepository userRepository;

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private CryptoMethod cryptoMethod;
	@Autowired
	private RorService rorService;

	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Operation(summary = "Get a greeting message")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfully retrieved message"),
			@ApiResponse(responseCode = "400", description = "Invalid request"),
			@ApiResponse(responseCode = "500", description = "Internal server error") })
	 @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        System.out.println("Request received at /authenticate");

        try {
            String hardcodedUsername = "user";
            String hardcodedPassword = "password";

            // Extract the username and password from the request
            String username = authenticationRequest.getUsername();
            String password = authenticationRequest.getPassword();

            // Validate the credentials
            if (!hardcodedUsername.equals(username) || !hardcodedPassword.equals(password)) {
                System.out.println("Authentication failed: invalid username or password");
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed: invalid username or password");
            }

            // Authenticate with hardcoded credentials
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(hardcodedUsername, hardcodedPassword)
            );

            // Extract UserDetails from authentication
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
       
            // Generate JWT token
            String jwt = jwtUtil.generateToken(userDetails);
            System.out.println("Authentication successful");

            // Convert JWT token to SHA-256 hash
          
//            cryptoMethod.setJwtToken(sha256Jwt);
            
            hashSHA256(jwt,7);

            return ResponseEntity.ok(new AuthenticationResponse(jwt));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Authentication failed");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed");
        }
    }

    private UserDetails getUserDetailsFromToken(String jwtToken) {
        // Extract username from JWT token
        String username = jwtUtil.extractUsername(jwtToken);
        
        // Load UserDetails from UserDetailsService
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        
        return userDetails;
    }
    
    
    

	@Validated
	@PostMapping("/tehsils")
	public ResponseEntity<?> getTehsilMaster(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eDCC") String eDCC) {
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			// Decrypt the encrypted parameter
			String districtCodeCensus = cryptoMethod.decryptMethod(eDCC,jwtToken);

			// Validate token format and extract JWT token
			

			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_tehsil_masterModel> tehsils = up_tehsil_masterService.getTehsilMaster(districtCodeCensus);
				logger.info("getTehsilMaster() " + districtCodeCensus.toString() + "DB "+ DataBaseContextHolder.getCurrentDb());
				return ResponseEntity.ok(tehsils);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error : " + e.getMessage());
		}
	}

	@Validated
	@PostMapping("/villages")
	public ResponseEntity<?> getVillages(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eDCC") String eDCC, @RequestParam("eTCC") String eTCC) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String districtCodeCensus = cryptoMethod.decryptMethod(eDCC,jwtToken);
			String tehsilCodeCensus = cryptoMethod.decryptMethod(eTCC,jwtToken);
		

			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_village_masterModel> villages = up_village_masterService.getVillageMaster(districtCodeCensus,
						tehsilCodeCensus);
				logger.info("getVillageMaster() " + districtCodeCensus.toString() + tehsilCodeCensus.toString() + "DB "+ DataBaseContextHolder.getCurrentDb());
				return ResponseEntity.ok(villages);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// RTK Village
	@Validated
	@PostMapping("/villagesRtk")
	public ResponseEntity<?> getVillagesRtk(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eDCC") String eDCC, @RequestParam("eTCC") String eTCC) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String districtCodeCensus = cryptoMethod.decryptMethod(eDCC,jwtToken);
			String tehsilCodeCensus = cryptoMethod.decryptMethod(eTCC,jwtToken);
			

			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_village_masterModel> villages = up_village_masterService.getVillageMasterRtk(districtCodeCensus,
						tehsilCodeCensus);
				return ResponseEntity.ok(villages);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	@Validated
	@PostMapping("/villagelistT")
	public ResponseEntity<?> getVillagelist(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eTCC") String eTCC) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String tehsilCodeCensus = cryptoMethod.decryptMethod(eTCC,jwtToken);

		

			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_villagelistModel> villages = up_village_masterService.getVillageMasterlist(tehsilCodeCensus);
				return ResponseEntity.ok(villages);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	@Validated
	@PostMapping("/villagelist")
	public ResponseEntity<?> getVillagelist(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eTCC") String eTCC, @RequestParam("echakbandi") String echakbandi,
			@RequestParam("esurvey") String esurvey) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String tehsilCodeCensus = cryptoMethod.decryptMethod(eTCC,jwtToken);
			String chakbandi = cryptoMethod.decryptMethod(echakbandi,jwtToken);
			String survey = cryptoMethod.decryptMethod(esurvey,jwtToken);
			

			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_villagelistModel> villages = up_village_masterService.getVillageMasterlist(tehsilCodeCensus,
						chakbandi, survey);
				return ResponseEntity.ok(villages);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	@Validated
	@PostMapping("/uniqueCode")
	public ResponseEntity<?> getUniqueCode(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("eKH") String eKH, @RequestParam("eDCC") String eDCC) {

		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String khasra_no = cryptoMethod.decryptMethod(eKH,jwtToken);
			// Validate token format and extract JWT token
			

			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_gata_detailModel> uniqueCodes = up_gata_detailService.getUniqueCode(villageCodeCensus,
						khasra_no);
				return ResponseEntity.ok(uniqueCodes);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

//	  Required by Abhishek tripathi for ansh updation by public

	@Autowired
	Up_village_ansh_log_rtk_service up_village_ansh_log_rtk_service;

	@PostMapping("/findGataWithAreaUnique")
	public ResponseEntity<?> findGataWithAreaUnique(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("eDCC") String eDCC) {

		try {

			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);

			// Validate token format and extract JWT token

			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<ListOfAreaKhasraUniqueCode> listOfAreaKhasraUniqueCode = up_village_ansh_log_rtk_service
						.findCounterRTK(villageCodeCensus);
				return ResponseEntity.ok(listOfAreaKhasraUniqueCode);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

//	  End of code Required by Abhishek tripathi

	// To get uniquecode on khata number
	@PostMapping("/uniqueCodek")
	public ResponseEntity<?> getUniqueCodek(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("eKH") String eKH, @RequestParam("eDCC") String eDCC) {

		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String khata_number = cryptoMethod.decryptMethod(eKH,jwtToken);
			// Extract UserDetails from Spring Security context
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_gata_detailModel> uniqueCodesk = up_gata_detailService.getUniqueCodek(villageCodeCensus,
						khata_number);
				return ResponseEntity.ok(uniqueCodesk);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}

		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// To get uniquecode on name
	@PostMapping("/uniqueCoden")
	public ResponseEntity<?> getUniqueCoden(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("name") String name, @RequestParam("eDCC") String eDCC) {

		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			// String name = cryptoMethod.decryptMethod(encryptedname);
			// Extract UserDetails from Spring Security context
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {

				List<Up_gata_detailModel> uniqueCodesn = up_gata_detailService.getUniqueCoden(villageCodeCensus, name);
				return ResponseEntity.ok(uniqueCodesn);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// To get uniquecode on landtype
	@PostMapping("/landType")
	public ResponseEntity<?> getShreni(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("ltt") String ltt, @RequestParam("eDCC") String eDCC) {

		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String It = cryptoMethod.decryptMethod(ltt,jwtToken);

			// Extract UserDetails from Spring Security context
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {

				List<Up_gata_detailModel> uniqueSh = up_gata_detailService.getShreni(villageCodeCensus, It);
				return ResponseEntity.ok(uniqueSh);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	/// For Backup data
	/// *************************************************************************************************
	@Validated
	@PostMapping("/uniqueCodeB")
	public ResponseEntity<?> getUniqueCodeB(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("eKH") String eKH,
			@RequestParam("fasliYear") String fasliYear, @RequestParam("eDCC") String eDCC) {

		try {
			String jwtToken = jwtUtil.extractJwtToken(token);

			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String khasra_no = cryptoMethod.decryptMethod(eKH,jwtToken);
			String fasli_year = cryptoMethod.decryptMethod(fasliYear,jwtToken);
			// Validate token format and extract JWT token
			

			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_gata_detailModel> uniqueCodesB = up_gata_detail_backupService.getUniqueCodeB(villageCodeCensus,
						khasra_no, fasli_year);
				return ResponseEntity.ok(uniqueCodesB);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// To get uniquecode on khata number
	@PostMapping("/uniqueCodekB")

	public ResponseEntity<?> getUniqueCodekB(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("eKH") String eKH,
			@RequestParam("fasliYear") String fasliYear, @RequestParam("eDCC") String eDCC) {

		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String khata_number = cryptoMethod.decryptMethod(eKH,jwtToken);
			String fasli_year = cryptoMethod.decryptMethod(fasliYear,jwtToken);
			// Extract UserDetails from Spring Security context
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_gata_detailModel> uniqueCodeskB = up_gata_detail_backupService
						.getUniqueCodekB(villageCodeCensus, khata_number, fasli_year);
				return ResponseEntity.ok(uniqueCodeskB);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}

		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// To get uniquecode on name
	@PostMapping("/uniqueCodenB")
	public ResponseEntity<?> getUniqueCodenB(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("name") String name,
			@RequestParam("fasliYear") String fasliYear, @RequestParam("eDCC") String eDCC) {

		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String fasli_year = cryptoMethod.decryptMethod(fasliYear,jwtToken);
			// String name = cryptoMethod.decryptMethod(encryptedname);
			// Extract UserDetails from Spring Security context
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {

				List<Up_gata_detailModel> uniqueCodesnB = up_gata_detail_backupService
						.getUniqueCodenB(villageCodeCensus, name, fasli_year);
				return ResponseEntity.ok(uniqueCodesnB);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// To get uniquecode on landtype
	@PostMapping("/landTypeB")
	public ResponseEntity<?> getShreniB(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("ltt") String ltt,
			@RequestParam("fasliYear") String fasliYear, @RequestParam("eDCC") String eDCC) {

		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String It = cryptoMethod.decryptMethod(ltt,jwtToken);
			String fasli_year = cryptoMethod.decryptMethod(fasliYear,jwtToken);
			// Extract UserDetails from Spring Security context
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {

				List<Up_gata_detailModel> uniqueShB = up_gata_detail_backupService.getShreniB(villageCodeCensus, It,
						fasli_year);
				return ResponseEntity.ok(uniqueShB);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}
	// ******************************************End of backup
	// data***************************************************************

	@PostMapping("/fasli")
	public ResponseEntity<?> getfasliYear(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("eDCC") String eDCC) {

		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);

		

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {

				List<Up_khata_detailModel> fasli = up_khata_detailService.getfasliYear(villageCodeCensus);
				logger.info("getfasliYear() " + villageCodeCensus.toString() + "DB "+ DataBaseContextHolder.getCurrentDb());
				return ResponseEntity.ok(fasli);
				
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// to be deleted portion start
	// --current fasli
	@PostMapping("/khata1")
	public ResponseEntity<?> getkhataone(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("uniqueCo") String uniqueCo) {

		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);

			// Convert BigInteger to String
			// String uniqueC = Long.toString(uniqueCo);
			String uniqueCode = cryptoMethod.decryptMethod(uniqueCo,jwtToken);
			// Long uniqueCode = new Long(uniqueCod);
			// Extract UserDetails from Spring Security context
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {

				List<Up_khata_detailModel> fasli = up_khata_detailService.getkhataone(villageCodeCensus, uniqueCode);
				return ResponseEntity.ok(fasli);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// --backup fasli
	@PostMapping("/khata2")
	public ResponseEntity<?> getkhataone(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("fasliyear") String fasliyear,
			@RequestParam("khataNumber") String khataNumber) {

		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			// Extract UserDetails from Spring Security context
						UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String fasli_year = cryptoMethod.decryptMethod(fasliyear,jwtToken);
			String khata_number = cryptoMethod.decryptMethod(khataNumber,jwtToken);
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {

				List<Up_khata_detailModel> fasli = up_khata_detailService.getkhatatwo(villageCodeCensus, fasli_year,
						khata_number);
				return ResponseEntity.ok(fasli);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}
	// to be deleted portion end

	@Validated
	@PostMapping("/ssdistricts")
	public ResponseEntity<?> getAllDistrict(@Valid @RequestHeader("Authorization") String token,
			@RequestParam(name = "encall", required = false) String encall) {
		try {
			// Check if encall parameter is present and not empty
			if (encall != null && !encall.isEmpty()) {
				String jwtToken = jwtUtil.extractJwtToken(token);
				// Extract UserDetails from Spring Security context
				UserDetails userDetails = getUserDetailsFromToken(jwtToken);
				// Decrypt the encrypted parameter
				String all = cryptoMethod.decryptMethod(encall,jwtToken);
				// Validate token format and extract JWT token
				

				

				// Check if UserDetails is valid
				if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
					List<Up_ss_detailModel> districts = up_ss_detailService.getAllDistrict(all);
					return ResponseEntity.ok(districts);
				}

				else {
					return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
				}
			} else {
				// Return a bad request response if encall is not provided or empty
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
						.body("parameter is required and must not be empty");
			}
		}

		catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	@Validated
	@PostMapping("/sstehsils")
	public ResponseEntity<?> getAllTehsil(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eDCC") String eDCC) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			// Extract UserDetails from Spring Security context
						UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String districtCodeCensus = cryptoMethod.decryptMethod(eDCC,jwtToken);
			

			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_ss_detailModel> tehsils = up_ss_detailService.getAllTehsil(districtCodeCensus);
				return ResponseEntity.ok(tehsils);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	@Validated
	@PostMapping("/ssdetails")
	public ResponseEntity<?> getAllDetails(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eTCC") String eTCC) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			// Extract UserDetails from Spring Security context
						UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String tehsilCodeCensus = cryptoMethod.decryptMethod(eTCC,jwtToken);
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_ss_detailModel> details = up_ss_detailService.getAllDetails(tehsilCodeCensus);
				return ResponseEntity.ok(details);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	@Validated
	@PostMapping("/nsdistricts")
	public ResponseEntity<?> getAllNsDistrict(@Valid @RequestHeader("Authorization") String token,
			@RequestParam(name = "encall", required = false) String encall) {
		// Validate token format and extract JWT token
		try {
			if (encall != null && !encall.isEmpty()) {
				// Decrypt the encrypted parameter
				String jwtToken = jwtUtil.extractJwtToken(token);

				// Extract UserDetails from Spring Security context
				UserDetails userDetails = getUserDetailsFromToken(jwtToken);
				String all = cryptoMethod.decryptMethod(encall,jwtToken);
				

				// Check if UserDetails is valid
				if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
					List<Up_ns_detailModel> districts = up_ns_detailService.getAllNsDistrict(all);
					return ResponseEntity.ok(districts);
				} else {
					return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
				}
			} else {
				// Return a bad request response if encall is not provided or empty
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
						.body("parameter is required and must not be empty");
			}
		}

		catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	@Validated
	@PostMapping("/nstehsils")
	public ResponseEntity<?> getAllNsTehsil(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eDCC") String eDCC) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String districtCodeCensus = cryptoMethod.decryptMethod(eDCC,jwtToken);
		

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_ns_detailModel> tehsils = up_ns_detailService.getAllNsTehsil(districtCodeCensus);
				return ResponseEntity.ok(tehsils);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	@Validated
	@PostMapping("/nsdetails")
	public ResponseEntity<?> getAllNsDetails(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eTCC") String eTCC) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String tehsilCodeCensus = cryptoMethod.decryptMethod(eTCC,jwtToken);
		

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_ns_detailModel> details = up_ns_detailService.getAllNsDetails(tehsilCodeCensus);
				return ResponseEntity.ok(details);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	@Validated
	@PostMapping("/radistricts")
	public ResponseEntity<?> getAllRaDistrict(@Valid @RequestHeader("Authorization") String token,
			@RequestParam(name = "encall", required = false) String encall) {
		try {
			if (encall != null && !encall.isEmpty()) {
				// Validate token format and extract JWT token
				String jwtToken = jwtUtil.extractJwtToken(token);

				// Extract UserDetails from Spring Security context
				UserDetails userDetails = getUserDetailsFromToken(jwtToken);
				// Decrypt the encrypted parameter
				String all = cryptoMethod.decryptMethod(encall,jwtToken);
				

				// Check if UserDetails is valid
				if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
					List<Up_ra_detailModel> districts = up_ra_detailService.getAllRaDistrict(all);
					return ResponseEntity.ok(districts);
				} else {
					return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
				}
			} else {
				// Return a bad request response if encall is not provided or empty
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
						.body("parameter is required and must not be empty");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	@Validated
	@PostMapping("/ratehsils")
	public ResponseEntity<?> getAllRaTehsil(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eDCC") String eDCC) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			// Extract UserDetails from Spring Security context
						UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String districtCodeCensus = cryptoMethod.decryptMethod(eDCC,jwtToken);
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_ra_detailModel> tehsils = up_ra_detailService.getAllRaTehsil(districtCodeCensus);
				return ResponseEntity.ok(tehsils);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	@Validated
	@PostMapping("/radetails")
	public ResponseEntity<?> getAllRaDetails(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eTCC") String eTCC, @RequestParam("eDCC") String eDCC) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			// Extract UserDetails from Spring Security context
						UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String tehsilCodeCensus = cryptoMethod.decryptMethod(eTCC,jwtToken);
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_ra_detailModel> details = up_ra_detailService.getAllRaDetails(tehsilCodeCensus);
				return ResponseEntity.ok(details);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// Status for village to find out the row

	@Validated
	@PostMapping("/status")
	public ResponseEntity<?> getStatus(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
		

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_village_master_lock_rtkModel> stat = up_village_master_lock_rtkService
						.getStatus(villageCodeCensus);
				return ResponseEntity.ok(stat);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// to be deleted portion start

	// to get gata_seq_no, khata_number, part
	@Validated
	@PostMapping("/gata_seq")
	public ResponseEntity<?> getGataSeq(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("uniquecode") String uniquecode) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			// Extract UserDetails from Spring Security context
						UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String unicode = cryptoMethod.decryptMethod(uniquecode,jwtToken);
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_gata_sequence_partModel> stat = up_gata_detailService.getGataSeq(villageCodeCensus, unicode);
				return ResponseEntity.ok(stat);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// land revenue payblex
	@Validated
	@PostMapping("/lr_payblex")
	public ResponseEntity<?> getLr_payblex(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("khata_number") String khata_number,
			@RequestParam("uniquecode") String uniquecode) {
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String khataNumber = cryptoMethod.decryptMethod(khata_number,jwtToken);
			String uniqueCode = cryptoMethod.decryptMethod(uniquecode,jwtToken);

			

			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Lr_payblexDTO> lr_payblDTO = up_khata_detail_Service.getLr_payblex(villageCodeCensus, khataNumber,
						uniqueCode);

				// Convert Lr_payblexDTO to Lr_payblexModel
				List<Lr_payblexModel> lr_payblModel = new ArrayList<>();
				for (Lr_payblexDTO dto : lr_payblDTO) {
					Lr_payblexModel model = new Lr_payblexModelImpl(); // Assuming Lr_payblexModelImpl is your
																		// implementation of Lr_payblexModel
					model.setCounts(dto.getCounts());
					model.setLand_revenue_payable(dto.getLand_revenue_payable());
					lr_payblModel.add(model);
				}

				return ResponseEntity.ok(lr_payblModel);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}
	}

	// to get landTypeDesc, landType

	@Validated
	@PostMapping("/landTypeDesc")
	public ResponseEntity<?> getLandTypeDesc(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("uniquecode") String uniquecode) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			// Extract UserDetails from Spring Security context
						UserDetails userDetails = getUserDetailsFromToken(jwtToken);
			String uniqueCode = cryptoMethod.decryptMethod(uniquecode,jwtToken);
			

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_land_type_detailModel> landTypeDes = up_land_type_detailService.getLandTypeDesc(uniqueCode);
				return ResponseEntity.ok(landTypeDes);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}
	}



	@PostMapping("/ansh")
	public ResponseEntity<?> getCounts(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("village_code_census") String village_code_census,
			@RequestParam("khata_number") String khata_number, @RequestParam("pt") String pt,
			@RequestParam("fasli_year") String fasli_year, @RequestParam("seq_no") String seq_no,
			@RequestParam("unique_code") String unique_code) {
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);

			String villageCodeCensus = cryptoMethod.decryptMethod(village_code_census,jwtToken);
			String khataNumber = cryptoMethod.decryptMethod(khata_number,jwtToken);
			String part = cryptoMethod.decryptMethod(pt,jwtToken);
			String fasliYear = cryptoMethod.decryptMethod(fasli_year,jwtToken);
			String seqNo = cryptoMethod.decryptMethod(seq_no,jwtToken);
			String uniqueCode = cryptoMethod.decryptMethod(unique_code,jwtToken);

			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				// Call the service method and get the response
				ResponseEntity<?> responseEntity = up_hissa_detailService.getCounts(villageCodeCensus, khataNumber,
						part, fasliYear, seqNo, uniqueCode);

				// Return the response as it is
				return responseEntity;
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}
	}

	@Validated
	@PostMapping("/getkayr")
	public ResponseEntity<?> getKayr(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("unique_code") String unique_code,
			@RequestParam("pt") String pt) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String uniqueCode = cryptoMethod.decryptMethod(unique_code,jwtToken);
			String part = cryptoMethod.decryptMethod(pt,jwtToken);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_gata_detail_1Model> kap = up_gata_detailService.getKayr(villageCodeCensus, uniqueCode, part);
				return ResponseEntity.ok(kap);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// to get flgOrd,countCourt,court_name,court_name1

	

	@PostMapping("/cname")
	public ResponseEntity<?> getCname(@RequestHeader("Authorization") String token, @RequestParam("eVCC") String eVCC,
			@RequestParam("khataNumber") String khataNumber, @RequestParam("uniqueCode") String uniqueCode) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String khata_number = cryptoMethod.decryptMethod(khataNumber,jwtToken);
			String unique_code = cryptoMethod.decryptMethod(uniqueCode,jwtToken);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				// Call service method to get data and flag
				Up_r6_detail_rtkService.ServiceResponse serviceResponse = up_r6_detail_rtkService
						.getCname(villageCodeCensus, khata_number, unique_code);

				// Return the service response directly
				return ResponseEntity.ok(serviceResponse);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}
	}
	// For column 11-16
	// to get order_no

//    	 select distinct order_no, to_char(dsc_date, 'YYYY-MM-DD HH24:MI') 
//    	 from up_r6_detail_rtk  
//    	 where village_code_census = ? and khata_number=? and unique_code=? and trans_type not in ('1','2','7','15','16','17','18','19','20') order by to_char(dsc_date, 'YYYY-MM-DD HH24:MI')
//    	

	@Validated
	@PostMapping("/celesix")
	public ResponseEntity<?> getOrderN(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("khataNumber") String khataNumber,
			@RequestParam("uniqueCode") String uniqueCode) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String khata_number = cryptoMethod.decryptMethod(khataNumber,jwtToken);
			String unique_code = cryptoMethod.decryptMethod(uniqueCode,jwtToken);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_r6_detail_rtkOModel> corder = up_r6_detail_rtkService.getOrderN(villageCodeCensus, khata_number,
						unique_code);
				return ResponseEntity.ok(corder);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error while decrypting: " + e.getMessage());
		}

	}

	// Add owner detailrtk
	@Validated
	@PostMapping("/Aname")
	public ResponseEntity<?> getAname(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("khataNumber") String khataNumber,
			@RequestParam("uniqueCode") String uniqueCode, @RequestParam("orderNo") String orderNo) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String khata_number = cryptoMethod.decryptMethod(khataNumber,jwtToken);
			String unique_code = cryptoMethod.decryptMethod(uniqueCode,jwtToken);
			String order_no = cryptoMethod.decryptMethod(orderNo,jwtToken);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_r6_add_owner_detail_rtkModel> aname = up_r6_add_owner_detail_rtkService
						.getAname(villageCodeCensus, khata_number, unique_code, order_no);
				return ResponseEntity.ok(aname);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// Remove owner detailrtk
	@Validated
	@PostMapping("/Rname")
	public ResponseEntity<?> getRname(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("khataNumber") String khataNumber,
			@RequestParam("uniqueCode") String uniqueCode, @RequestParam("orderNo") String orderNo) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String khata_number = cryptoMethod.decryptMethod(khataNumber,jwtToken);
			String unique_code = cryptoMethod.decryptMethod(uniqueCode,jwtToken);
			String order_no = cryptoMethod.decryptMethod(orderNo,jwtToken);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_r6_remove_owner_detail_rtkModel> rname = up_r6_remove_owner_detail_rtkService
						.getRname(villageCodeCensus, khata_number, unique_code, order_no);
				return ResponseEntity.ok(rname);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	@Validated
	@PostMapping("/specialOrd")
	public ResponseEntity<?> getSpecialOrder(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("khataNumber") String khataNumber,
			@RequestParam("uniqueCode") String uniqueCode) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);

			String unique_code = cryptoMethod.decryptMethod(uniqueCode,jwtToken);
			String khata_number = cryptoMethod.decryptMethod(khataNumber,jwtToken);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_r6_detail_rtkSpecialModel> specialorder = up_r6_detail_rtkService
						.getSpecialOrder(villageCodeCensus, khata_number, unique_code);
				return ResponseEntity.ok(specialorder);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// To get charge detail
	@Validated
	@PostMapping("/charge")
	public ResponseEntity<?> getCharge(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("unique_code") String unique_code) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);

			String uniqueCode = cryptoMethod.decryptMethod(unique_code,jwtToken);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Agri_t_charge_detailMode> charg = agri_t_charge_detailService.getCharge(villageCodeCensus,
						uniqueCode);
				return ResponseEntity.ok(charg);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// To get charge detail
	@Validated
	@PostMapping("/decharge")
	public ResponseEntity<?> getDecharge(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("unique_code") String unique_code) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);

			String uniqueCode = cryptoMethod.decryptMethod(unique_code,jwtToken);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Agri_t_charge_detailMode> dcharg = agri_t_decharge_detailService.getDecharge(villageCodeCensus,
						uniqueCode);
				return ResponseEntity.ok(dcharg);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	//
	// To get charge detail
	@Validated
	@PostMapping("/remarks")
	public ResponseEntity<?> getRemarks(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("khata_number") String khata_number,
			@RequestParam("unique_code") String unique_code) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String khataNumber = cryptoMethod.decryptMethod(khata_number,jwtToken);
			String uniqueCode = cryptoMethod.decryptMethod(unique_code,jwtToken);
			// String orderType = cryptoMethod.decryptMethod(order_type);

			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_remark_detailModel> remar = up_remark_detailService.getRemarks(villageCodeCensus, khataNumber,
						uniqueCode);
				return ResponseEntity.ok(remar);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// to get old order detail
	@Validated
	@PostMapping("/oldOrd")
	public ResponseEntity<?> getOldOrder(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("khata_number") String khata_number) {
		// Validate token format and extract JWT token
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);

			String khataNumber = cryptoMethod.decryptMethod(khata_number,jwtToken);
			// Extract UserDetails from Spring Security context
			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			// Check if UserDetails is valid
			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				List<Up_order_detailModel> oldorder = up_order_detailService.getOldOrder(villageCodeCensus,
						khataNumber);
				return ResponseEntity.ok(oldorder);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			// Handle decryption exceptions
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
		}

	}

	// to be deleted portion end

	// ***********************************************************************************************************************************************************************************
	// ************************************************************************************************************************************************************************************

	@Validated
	@PostMapping("/ror")
	public ResponseEntity<?> getRor(@Valid @RequestHeader("Authorization") String token,
			@RequestParam("eVCC") String eVCC, @RequestParam("khata_number") String khata_number,
			@RequestParam("unique_code") String unique_code, @RequestParam("eDCC") String eDCC) {
		try {
			String jwtToken = jwtUtil.extractJwtToken(token);
			String villageCodeCensus = cryptoMethod.decryptMethod(eVCC,jwtToken);
			String khataNumber = cryptoMethod.decryptMethod(khata_number,jwtToken);
			String UniqueCode = cryptoMethod.decryptMethod(unique_code,jwtToken);

			UserDetails userDetails = getUserDetailsFromToken(jwtToken);

			if (userDetails != null && jwtUtil.validateToken(jwtToken, userDetails)) {
				RorResponse rorResponse = rorService.getRor(villageCodeCensus, khataNumber, UniqueCode);
				return ResponseEntity.ok(rorResponse);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error  " + e.getMessage());
		}
	}



	  private String hashSHA256(String input, int length) throws Exception {
	        MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        byte[] hash = digest.digest(input.getBytes("UTF-8"));
	        StringBuilder hexString = new StringBuilder();

	        for (byte b : hash) {
	            String hex = Integer.toHexString(0xff & b);
	            if (hex.length() == 1) hexString.append('0');
	            hexString.append(hex);
	        }

	        // Truncate the hash value to the desired length
	        String hashedValue = hexString.toString().substring(0, Math.min(length, hexString.length()));
	        System.out.println("SHA-256 hash value: " + hashedValue); // Print hash value to console

	        return hashedValue;
	    }

}
