import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import kechengquxiao from '@/views/modules/kechengquxiao/list'
    import qicaifenpei from '@/views/modules/qicaifenpei/list'
    import discussjianshenfangxinxi from '@/views/modules/discussjianshenfangxinxi/list'
    import jiaolian from '@/views/modules/jiaolian/list'
    import weixiuxinxi from '@/views/modules/weixiuxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import jianshenfangxinxi from '@/views/modules/jianshenfangxinxi/list'
    import discusskechengxinxi from '@/views/modules/discusskechengxinxi/list'
    import kechengxinxi from '@/views/modules/kechengxinxi/list'
    import kechengpingjia from '@/views/modules/kechengpingjia/list'
    import huodongricheng from '@/views/modules/huodongricheng/list'
    import kechengfenlei from '@/views/modules/kechengfenlei/list'
    import yonghu from '@/views/modules/yonghu/list'
    import kechengyuyue from '@/views/modules/kechengyuyue/list'
    import qicaixinxi from '@/views/modules/qicaixinxi/list'
    import config from '@/views/modules/config/list'
    import goumaixinxi from '@/views/modules/goumaixinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告资讯',
        component: news
      }
      ,{
	path: '/kechengquxiao',
        name: '课程取消',
        component: kechengquxiao
      }
      ,{
	path: '/qicaifenpei',
        name: '器材分配',
        component: qicaifenpei
      }
      ,{
	path: '/discussjianshenfangxinxi',
        name: '健身房信息评论',
        component: discussjianshenfangxinxi
      }
      ,{
	path: '/jiaolian',
        name: '教练',
        component: jiaolian
      }
      ,{
	path: '/weixiuxinxi',
        name: '维修信息',
        component: weixiuxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/jianshenfangxinxi',
        name: '健身房信息',
        component: jianshenfangxinxi
      }
      ,{
	path: '/discusskechengxinxi',
        name: '课程信息评论',
        component: discusskechengxinxi
      }
      ,{
	path: '/kechengxinxi',
        name: '课程信息',
        component: kechengxinxi
      }
      ,{
	path: '/kechengpingjia',
        name: '课程评价',
        component: kechengpingjia
      }
      ,{
	path: '/huodongricheng',
        name: '活动日程',
        component: huodongricheng
      }
      ,{
	path: '/kechengfenlei',
        name: '课程分类',
        component: kechengfenlei
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/kechengyuyue',
        name: '课程预约',
        component: kechengyuyue
      }
      ,{
	path: '/qicaixinxi',
        name: '器材信息',
        component: qicaixinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/goumaixinxi',
        name: '购买信息',
        component: goumaixinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
