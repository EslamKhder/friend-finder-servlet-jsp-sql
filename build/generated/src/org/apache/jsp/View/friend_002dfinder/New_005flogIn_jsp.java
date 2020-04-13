package org.apache.jsp.View.friend_002dfinder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;
import DataBaseFiles.ServicesImplementation.UserServices;
import java.sql.Connection;
import Model.User;

public final class New_005flogIn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"This is social network html5 template available in themeforest......\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Social Network, Social Media, Make Friends, Newsfeed, Profile Page\" />\n");
      out.write("        <meta name=\"robots\" content=\"index, follow\" />\n");
      out.write("        <title>Friend Finder | A Complete Social Network Template</title>\n");
      out.write("\n");
      out.write("        <!-- Stylesheets\n");
      out.write("        ================================================= -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ionicons.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\n");
      out.write("        <!--Google Webfont-->\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Raleway:400,100,100italic,200,200italic,300,300italic,400italic,500,500italic,600,600italic,700' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--Favicon-->\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"images/fav.png\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            User user = new User();
            user.setId(0);
            Cookie[] cookies = request.getCookies();
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("email")) {
                    user.setEmail(cookies[i].getValue());
                }
                if (cookies[i].getName().equals("password")) {
                    user.setPassword(cookies[i].getValue());
                }
            }
            Connection connection = (Connection) getServletContext().getAttribute("Connect");
            UserServices userservices = new UserServices();
            userservices.setConnection(connection);
            user = userservices.getUser(user);
            if (user.getId()!= 0) {
                request.getSession().setAttribute("user", user);
                response.sendRedirect("newsfeed.jsp");
            }
        
      out.write("\n");
      out.write("        <!-- Header\n");
      out.write("        ================================================= -->\n");
      out.write("        <header id=\"header\" class=\"lazy-load\">\n");
      out.write("            <nav class=\"navbar navbar-default navbar-fixed-top menu\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"logo\" /></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right main-menu\">\n");
      out.write("                            <li class=\"dropdown\"><a href=\"index.html\">Home</a></li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Newsfeed <span><img src=\"images/down-arrow.png\" alt=\"\" /></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu newsfeed-home\">\n");
      out.write("                                    <li><a href=\"newsfeed.html\">Newsfeed</a></li>\n");
      out.write("                                    <li><a href=\"newsfeed-people-nearby.html\">Poeple Nearly</a></li>\n");
      out.write("                                    <li><a href=\"newsfeed-friends.html\">My friends</a></li>\n");
      out.write("                                    <li><a href=\"newsfeed-messages.html\">Chatroom</a></li>\n");
      out.write("                                    <li><a href=\"newsfeed-images.html\">Images</a></li>\n");
      out.write("                                    <li><a href=\"newsfeed-videos.html\">Videos</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Timeline <span><img src=\"images/down-arrow.png\" alt=\"\" /></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu login\">\n");
      out.write("                                    <li><a href=\"timeline.html\">Timeline</a></li>\n");
      out.write("                                    <li><a href=\"timeline-about.html\">Timeline About</a></li>\n");
      out.write("                                    <li><a href=\"timeline-album.html\">Timeline Album</a></li>\n");
      out.write("                                    <li><a href=\"timeline-friends.html\">Timeline Friends</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle pages\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">All Pages <span><img src=\"images/down-arrow.png\" alt=\"\" /></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu page-list\">\n");
      out.write("                                    <li><a href=\"index.html\">Landing Page</a></li>\n");
      out.write("                                    <li><a href=\"newsfeed.html\">Newsfeed</a></li>\n");
      out.write("                                    <li><a href=\"newsfeed-people-nearby.html\">Poeple Nearly</a></li>\n");
      out.write("                                    <li><a href=\"newsfeed-friends.html\">My friends</a></li>\n");
      out.write("                                    <li><a href=\"newsfeed-messages.html\">Chatroom</a></li>\n");
      out.write("                                    <li><a href=\"newsfeed-images.html\">Images</a></li>\n");
      out.write("                                    <li><a href=\"newsfeed-videos.html\">Videos</a></li>\n");
      out.write("                                    <li><a href=\"timeline.html\">Timeline</a></li>\n");
      out.write("                                    <li><a href=\"timeline-about.html\">Timeline About</a></li>\n");
      out.write("                                    <li><a href=\"timeline-album.html\">Timeline Album</a></li>\n");
      out.write("                                    <li><a href=\"timeline-friends.html\">Timeline Friends</a></li>\n");
      out.write("                                    <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown\"><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <form class=\"navbar-form navbar-right hidden-sm\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <i class=\"icon ion-android-search\"></i>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search friends, photos, videos\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div><!-- /.navbar-collapse -->\n");
      out.write("                </div><!-- /.container -->\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!--Header End-->\n");
      out.write("\n");
      out.write("        <!-- Top Banner\n");
      out.write("        ================================================= -->\n");
      out.write("        <section id=\"banner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <!-- Sign Up Form\n");
      out.write("                ================================================= -->\n");
      out.write("                <div class=\"sign-up-form\">\n");
      out.write("                    <a href=\"index.html\" class=\"logo\"><img src=\"images/logo.png\" alt=\"Friend Finder\"/></a>\n");
      out.write("                    <h2 class=\"text-white\">Find My Friends</h2>\n");
      out.write("                    <div class=\"line-divider\"></div>\n");
      out.write("                    <div class=\"form-wrapper\">\n");
      out.write("                        <p class=\"signup-text\">Signup now and meet awesome people around the world</p>\n");
      out.write("                        <form action=\"../../NewAccount\" method=\"POST\">\n");
      out.write("                            <fieldset class=\"form-group\">\n");
      out.write("                                <input type=\"text\" required name=\"fullname\" class=\"form-control\" minlength=\"6\" id=\"example-name\" placeholder=\"Enter name\" autofocus>\n");
      out.write("                            </fieldset>\n");
      out.write("                            <fieldset class=\"form-group\">\n");
      out.write("                                <input type=\"email\" required name=\"email\" class=\"form-control\" id=\"example-email\" placeholder=\"Enter email\" >\n");
      out.write("                            </fieldset>\n");
      out.write("                            <fieldset class=\"form-group\">\n");
      out.write("                                <input type=\"password\" required name=\"password\" class=\"form-control\" minlength=\"10\" id=\"example-password\" placeholder=\"Enter a password\" pattern=\"[A-Za-z0-9]{10,}\" title=\"must include length(10) at least\">\n");
      out.write("                            </fieldset>\n");
      out.write("                            <fieldset class=\"form-group\">\n");
      out.write("                                <input type=\"text\" required name=\"job\" class=\"form-control\" minlength=\"5\" id=\"example-password\" pattern=\"[A-Za-z]{1,}\" placeholder=\"Enter Your Job\">\n");
      out.write("                            </fieldset>\n");
      out.write("                            <fieldset class=\"form-group\">\n");
      out.write("                                <input type=\"text\" required name=\"distance\" class=\"form-control\" id=\"example-password\" placeholder=\"Enter Your distance in K_M\" pattern=\"[0-9]{1,}\" title=\"must include only Number\">\n");
      out.write("                            </fieldset>\n");
      out.write("                            <p>By signning up you agree to the terms</p>\n");
      out.write("                            <button class=\"btn-secondary\">Signup</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"Log_In.html\">Already have an account?</a>\n");
      out.write("                    <img class=\"form-shadow\" src=\"images/bottom-shadow.png\" alt=\"\" />\n");
      out.write("                </div><!-- Sign Up Form End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <svg class=\"arrows hidden-xs hidden-sm\">\n");
      out.write("                <path class=\"a1\" d=\"M0 0 L30 32 L60 0\"></path>\n");
      out.write("                <path class=\"a2\" d=\"M0 20 L30 52 L60 20\"></path>\n");
      out.write("                <path class=\"a3\" d=\"M0 40 L30 72 L60 40\"></path>\n");
      out.write("                </svg>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Features Section\n");
      out.write("        ================================================= -->\n");
      out.write("        <section id=\"features\">\n");
      out.write("            <div class=\"container wrapper\">\n");
      out.write("                <h1 class=\"section-title slideDown\">social herd</h1>\n");
      out.write("                <div class=\"row slideUp\">\n");
      out.write("                    <div class=\"feature-item col-md-2 col-sm-6 col-xs-6 col-md-offset-2\">\n");
      out.write("                        <div class=\"feature-icon\"><i class=\"icon ion-person-add\"></i></div>\n");
      out.write("                        <h3>Make Friends</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"feature-item col-md-2 col-sm-6 col-xs-6\">\n");
      out.write("                        <div class=\"feature-icon\"><i class=\"icon ion-images\"></i></div>\n");
      out.write("                        <h3>Publish Posts</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"feature-item col-md-2 col-sm-6 col-xs-6\">\n");
      out.write("                        <div class=\"feature-icon\"><i class=\"icon ion-chatbox-working\"></i></div>\n");
      out.write("                        <h3>Private Chats</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"feature-item col-md-2 col-sm-6 col-xs-6\">\n");
      out.write("                        <div class=\"feature-icon\"><i class=\"icon ion-compose\"></i></div>\n");
      out.write("                        <h3>Create Polls</h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <h2 class=\"sub-title\">find awesome people like you</h2>\n");
      out.write("                <div id=\"incremental-counter\" data-value=\"101242\"></div>\n");
      out.write("                <p>People Already Signed Up</p>\n");
      out.write("                <img src=\"images/face-map.png\" alt=\"\" class=\"img-responsive face-map slideUp hidden-sm hidden-xs\" />\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Download Section\n");
      out.write("        ================================================= -->\n");
      out.write("        <section id=\"app-download\">\n");
      out.write("            <div class=\"container wrapper\">\n");
      out.write("                <h1 class=\"section-title slideDown\">download</h1>\n");
      out.write("                <ul class=\"app-btn list-inline slideUp\">\n");
      out.write("                    <li><button class=\"btn-secondary\"><img src=\"images/app-store.png\" alt=\"App Store\" /></button></li>\n");
      out.write("                    <li><button class=\"btn-secondary\"><img src=\"images/google-play.png\" alt=\"Google Play\" /></button></li>\n");
      out.write("                </ul>\n");
      out.write("                <h2 class=\"sub-title\">stay connected anytime, anywhere</h2>\n");
      out.write("                <img src=\"images/iPhone.png\" alt=\"iPhone\" class=\"img-responsive\" />\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Image Divider\n");
      out.write("        ================================================= -->\n");
      out.write("        <div class=\"img-divider hidden-sm hidden-xs\"></div>\n");
      out.write("\n");
      out.write("        <!-- Facts Section\n");
      out.write("        ================================================= -->\n");
      out.write("        <section id=\"site-facts\">\n");
      out.write("            <div class=\"container wrapper\">\n");
      out.write("                <div class=\"circle\">\n");
      out.write("                    <ul class=\"facts-list\">\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"fact-icon\"><i class=\"icon ion-ios-people-outline\"></i></div>\n");
      out.write("                            <h3 class=\"text-white\">1,01,242</h3>\n");
      out.write("                            <p>People registered</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"fact-icon\"><i class=\"icon ion-images\"></i></div>\n");
      out.write("                            <h3 class=\"text-white\">21,01,242</h3>\n");
      out.write("                            <p>Posts published</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"fact-icon\"><i class=\"icon ion-checkmark-round\"></i></div>\n");
      out.write("                            <h3 class=\"text-white\">41,242</h3>\n");
      out.write("                            <p>People online</p>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Live Feed Section\n");
      out.write("        ================================================= -->\n");
      out.write("        <section id=\"live-feed\">\n");
      out.write("            <div class=\"container wrapper\">\n");
      out.write("                <h1 class=\"section-title slideDown\">live feed</h1>\n");
      out.write("                <ul class=\"online-users list-inline slideUp\">\n");
      out.write("                    <li><a href=\"#\" title=\"Alexis Clark\"><img src=\"images/users/user-5.jpg\" alt=\"\" class=\"img-responsive profile-photo\" /><span class=\"online-dot\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\" title=\"James Carter\"><img src=\"images/users/user-6.jpg\" alt=\"\" class=\"img-responsive profile-photo\" /><span class=\"online-dot\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\" title=\"Robert Cook\"><img src=\"images/users/user-7.jpg\" alt=\"\" class=\"img-responsive profile-photo\" /><span class=\"online-dot\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\" title=\"Richard Bell\"><img src=\"images/users/user-8.jpg\" alt=\"\" class=\"img-responsive profile-photo\" /><span class=\"online-dot\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\" title=\"Anna Young\"><img src=\"images/users/user-9.jpg\" alt=\"\" class=\"img-responsive profile-photo\" /><span class=\"online-dot\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\" title=\"Julia Cox\"><img src=\"images/users/user-10.jpg\" alt=\"\" class=\"img-responsive profile-photo\" /><span class=\"online-dot\"></span></a></li>\n");
      out.write("                </ul>\n");
      out.write("                <h2 class=\"sub-title\">see what?s happening now</h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 col-md-offset-2\">\n");
      out.write("                        <div class=\"feed-item\">\n");
      out.write("                            <img src=\"images/users/user-1.jpg\" alt=\"user\" class=\"img-responsive profile-photo-sm\" />\n");
      out.write("                            <div class=\"live-activity\">\n");
      out.write("                                <p><a href=\"#\" class=\"profile-link\">Sarah</a> just posted a photo from Moscow</p>\n");
      out.write("                                <p class=\"text-muted\">20 Secs ago</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"feed-item\">\n");
      out.write("                            <img src=\"images/users/user-4.jpg\" alt=\"user\" class=\"img-responsive profile-photo-sm\" />\n");
      out.write("                            <div class=\"live-activity\">\n");
      out.write("                                <p><a href=\"#\" class=\"profile-link\">John</a> Published a post from Sydney</p>\n");
      out.write("                                <p class=\"text-muted\">1 min ago</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"feed-item\">\n");
      out.write("                            <img src=\"images/users/user-10.jpg\" alt=\"user\" class=\"img-responsive profile-photo-sm\" />\n");
      out.write("                            <div class=\"live-activity\">\n");
      out.write("                                <p><a href=\"#\" class=\"profile-link\">Julia</a> Updated her status from London</p>\n");
      out.write("                                <p class=\"text-muted\">5 mins ago</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"feed-item\">\n");
      out.write("                            <img src=\"images/users/user-3.jpg\" alt=\"user\" class=\"img-responsive profile-photo-sm\" />\n");
      out.write("                            <div class=\"live-activity\">\n");
      out.write("                                <p><a href=\"#\" class=\"profile-link\">Sophia</a> Share a photo from Virginia</p>\n");
      out.write("                                <p class=\"text-muted\">10 mins ago</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"feed-item\">\n");
      out.write("                            <img src=\"images/users/user-2.jpg\" alt=\"user\" class=\"img-responsive profile-photo-sm\" />\n");
      out.write("                            <div class=\"live-activity\">\n");
      out.write("                                <p><a href=\"#\" class=\"profile-link\">Linda</a> just posted a photo from Toronto</p>\n");
      out.write("                                <p class=\"text-muted\">20 mins ago</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                        <div class=\"feed-item\">\n");
      out.write("                            <img src=\"images/users/user-17.jpg\" alt=\"user\" class=\"img-responsive profile-photo-sm\" />\n");
      out.write("                            <div class=\"live-activity\">\n");
      out.write("                                <p><a href=\"#\" class=\"profile-link\">Nora</a> Shared an article from Ohio</p>\n");
      out.write("                                <p class=\"text-muted\">22 mins ago</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"feed-item\">\n");
      out.write("                            <img src=\"images/users/user-18.jpg\" alt=\"user\" class=\"img-responsive profile-photo-sm\" />\n");
      out.write("                            <div class=\"live-activity\">\n");
      out.write("                                <p><a href=\"#\" class=\"profile-link\">Addison</a> Created a poll from Barcelona</p>\n");
      out.write("                                <p class=\"text-muted\">23 mins ago</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"feed-item\">\n");
      out.write("                            <img src=\"images/users/user-11.jpg\" alt=\"user\" class=\"img-responsive profile-photo-sm\" />\n");
      out.write("                            <div class=\"live-activity\">\n");
      out.write("                                <p><a href=\"#\" class=\"profile-link\">Diana</a> Posted a video from Captown</p>\n");
      out.write("                                <p class=\"text-muted\">27 mins ago</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"feed-item\">\n");
      out.write("                            <img src=\"images/users/user-1.jpg\" alt=\"user\" class=\"img-responsive profile-photo-sm\" />\n");
      out.write("                            <div class=\"live-activity\">\n");
      out.write("                                <p><a href=\"#\" class=\"profile-link\">Sarah</a> Shared friend's post from Moscow</p>\n");
      out.write("                                <p class=\"text-muted\">30 mins ago</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"feed-item\">\n");
      out.write("                            <img src=\"images/users/user-16.jpg\" alt=\"user\" class=\"img-responsive profile-photo-sm\" />\n");
      out.write("                            <div class=\"live-activity\">\n");
      out.write("                                <p><a href=\"#\" class=\"profile-link\">Emma</a> Started a new job at Torronto</p>\n");
      out.write("                                <p class=\"text-muted\">33 mins ago</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Footer\n");
      out.write("        ================================================= -->\n");
      out.write("        <footer id=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"footer-wrapper\">\n");
      out.write("                        <div class=\"col-md-3 col-sm-3\">\n");
      out.write("                            <a href=\"\"><img src=\"images/logo-black.png\" alt=\"\" class=\"footer-logo\" /></a>\n");
      out.write("                            <ul class=\"list-inline social-icons\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"icon ion-social-facebook\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"icon ion-social-twitter\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"icon ion-social-googleplus\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"icon ion-social-pinterest\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"icon ion-social-linkedin\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-2 col-sm-2\">\n");
      out.write("                            <h6>For individuals</h6>\n");
      out.write("                            <ul class=\"footer-links\">\n");
      out.write("                                <li><a href=\"\">Signup</a></li>\n");
      out.write("                                <li><a href=\"\">login</a></li>\n");
      out.write("                                <li><a href=\"\">Explore</a></li>\n");
      out.write("                                <li><a href=\"\">Finder app</a></li>\n");
      out.write("                                <li><a href=\"\">Features</a></li>\n");
      out.write("                                <li><a href=\"\">Language settings</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-2 col-sm-2\">\n");
      out.write("                            <h6>For businesses</h6>\n");
      out.write("                            <ul class=\"footer-links\">\n");
      out.write("                                <li><a href=\"\">Business signup</a></li>\n");
      out.write("                                <li><a href=\"\">Business login</a></li>\n");
      out.write("                                <li><a href=\"\">Benefits</a></li>\n");
      out.write("                                <li><a href=\"\">Resources</a></li>\n");
      out.write("                                <li><a href=\"\">Advertise</a></li>\n");
      out.write("                                <li><a href=\"\">Setup</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-2 col-sm-2\">\n");
      out.write("                            <h6>About</h6>\n");
      out.write("                            <ul class=\"footer-links\">\n");
      out.write("                                <li><a href=\"\">About us</a></li>\n");
      out.write("                                <li><a href=\"\">Contact us</a></li>\n");
      out.write("                                <li><a href=\"\">Privacy Policy</a></li>\n");
      out.write("                                <li><a href=\"\">Terms</a></li>\n");
      out.write("                                <li><a href=\"\">Help</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 col-sm-3\">\n");
      out.write("                            <h6>Contact Us</h6>\n");
      out.write("                            <ul class=\"contact\">\n");
      out.write("                                <li><i class=\"icon ion-ios-telephone-outline\"></i>+1 (234) 222 0754</li>\n");
      out.write("                                <li><i class=\"icon ion-ios-email-outline\"></i>info@thunder-team.com</li>\n");
      out.write("                                <li><i class=\"icon ion-ios-location-outline\"></i>228 Park Ave S NY, USA</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <p>copyright @thunder-team 2016. All rights reserved</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!--preloader-->\n");
      out.write("        <div id=\"spinner-wrapper\">\n");
      out.write("            <div class=\"spinner\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Scripts\n");
      out.write("        ================================================= -->\n");
      out.write("        <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.appear.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.incremental-counter.js\"></script>\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
