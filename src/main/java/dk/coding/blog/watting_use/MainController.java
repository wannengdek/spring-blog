//package dk.coding.blog.controller;
//
//import org.springframework.stereotype.controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
///**
// * 主页控制器.
// */
//@controller
//public class MainController {
////	private static final Long ROLE_USER_AUTHORITY_ID = 2L;
////	private final UserService userService;
////	private final AuthorityService  authorityService;
////
////	@Autowired
////	public MainController(UserService userService, AuthorityService authorityService) {
////		this.userService = userService;
////		this.authorityService = authorityService;
////	}
//
//	@GetMapping("/")
//	public String root() {
//		return "redirect:index";
//	}
//
//	@GetMapping("/index")
//	public String index() {
//		return "index";
//	}
//	/**
//	 * 获取登录界面
//	 */
//	@GetMapping("/login")
//	public String login() {
//		return "login";
//	}
//
//	@GetMapping("/login-error")
//	public String loginError(Model model) {
//		model.addAttribute("loginError", true);
//		model.addAttribute("errorMsg", "登陆失败，账号或者密码错误！");
//		return "login";
//	}
//
//	@GetMapping("/register")
//	public String register() {
//		return "register";
//	}
//
//	/**
//	 * 注册用户
//	 */
////	@PostMapping("/register")
////	public String registerUser(User user) {
////		List<Authority> authorities = new ArrayList<>();
////		authorities.add(authorityService.getAuthorityById(ROLE_USER_AUTHORITY_ID));
////		user.setAuthorities(authorities);
////		user.setEncodePassword(user.getPassword()); // 加密密码
////		userService.saveUser(user);
////		return "redirect:/login";
////	}
//
//	@GetMapping("/search")
//	public String search() {
//		return "search";
//	}
//}
